package Deck;

import Enemies.Enemy;
import Enemies.EnemyType;
import Enemies.Vampire;
import Npc.Npc;
import Utils.RandomGenerator;

import java.util.Random;

public class Deck {
    private final static Random rand = new Random();
    RandomGenerator randomGenerator = RandomGenerator.getRandomPhraseGenerator();
    public Card draw(){
        CardType cardType = randomGenerator.getRandomCardtype();
        return randomCardFactory(cardType);
    }

    private Enemy randomEnemyFactory(){
        EnemyType enemyType = randomGenerator.getRandomEnemyType();
        switch(enemyType){
            case VAMPIRE:
                return new Vampire(60,100, 0); //TODO creating an automatic system
        }
        throw new IllegalStateException("Enemy not found");
    }
    private Card randomCardFactory(CardType cardType){
        switch(cardType){
            case ENEMY:
                return  randomEnemyFactory();

            case NPC:
                return new Npc();
        }
        throw new IllegalStateException("Unknown card");
    }
}

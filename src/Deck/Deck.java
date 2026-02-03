package Deck;

import Enemies.Enemy;
import Enemies.EnemyType;
import Enemies.Vampire;
import Npc.Npc;

import java.util.Random;

public class Deck {
    private final static Random rand = new Random();
    /**
      I wanted to make a very readable function,
      thats why i didnt made the factory switch here but created another method
     */
    public Card draw(){
        CardType cardType = randomCardtype();
        return randomCardFactory(cardType);
    }
    private CardType randomCardtype(){
        CardType[] cardTypes = CardType.values();
        int randomCard = rand.nextInt(cardTypes.length); // 0 - 1
        return cardTypes[randomCard];
    }
    private EnemyType randomEnemyType(){
        EnemyType[] enemyTypes = EnemyType.values();
        int randomCard = rand.nextInt(enemyTypes.length); // 1
        return enemyTypes[randomCard];
    }
    private Enemy randomEnemyFactory(){
        EnemyType enemyType = randomEnemyType();
        switch(enemyType){
            case VAMPIRE:
                return new Vampire();
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

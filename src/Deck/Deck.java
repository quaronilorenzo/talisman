package Deck;

import Enemy.Enemy;
import Npc.Npc;

import java.util.Random;

public class Deck {
    private final static Random rand = new Random();
    public Card draw(){
        CardType cardType = randomCardtype();

        switch(cardType){
            case ENEMY:
                return new Enemy();
            case NPC:
                return new Npc();
        }
        throw new IllegalStateException("Unknown card");
    }
    private CardType randomCardtype(){
        CardType[] cardTypes = CardType.values();
        int randomCard = rand.nextInt(cardTypes.length); // 0 - 1
        return cardTypes[randomCard];
    }
}

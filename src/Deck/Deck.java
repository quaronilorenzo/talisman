package Deck;

import Enemy.Enemy;
import Npc.Npc;

import java.util.Random;

public class Deck {
    public Card draw(){
        Random rand = new Random();
        int randomCard = rand.nextInt(2); // 0 - 1
        switch(randomCard){
            case 0:
                return new Enemy();
            case 1:
                return new Npc();
        }
        throw new IllegalStateException("Unknown card");
    }

}

package Npc;

import Deck.Card;

public class Npc implements Card {
    @Override
    public void interact() {
        System.out.println("Hi Vagabond! How are ya?");
    }
}

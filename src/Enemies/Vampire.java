package Enemies;

import Deck.Card;

import java.util.Random;

public class Vampire implements Card {
    private final static Random randomPhraseGenerator = new Random();
    @Override
    public void interact() {
        System.out.println(VampireCostants.STARTINGPHRASES
                .get(
                    randomPhraseGenerator.nextInt(
                            VampireCostants.STARTINGPHRASES.size()
                    )
                )
        );
    }

}

package Deck;

import Enemies.VampireCostants;

import java.util.List;
import java.util.Random;


public abstract class Card{
    private final static Random randomPhraseGenerator = new Random();
    public void interact(List<String> phrases) {
        System.out.println(phrases
                .get(
                        randomPhraseGenerator.nextInt(
                                phrases.size()
                        )
                )
        );
    }
    public abstract List<String> getPhrases();
}

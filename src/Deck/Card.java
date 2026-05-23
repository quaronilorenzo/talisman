package Deck;

import Utils.RandomGenerator;

import java.util.List;


public abstract class Card{
    private RandomGenerator randomPhraseGenerator = RandomGenerator.getRandomPhraseGenerator();
    public void interact(List<String> phrases) {
        System.out.println(randomPhraseGenerator.generatePhrase(phrases));
    }
    public abstract List<String> getPhrases();
}

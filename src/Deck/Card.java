package Deck;

import Deck.Utils.RandomPhraseGenerator;
import Enemies.VampireCostants;

import java.util.List;
import java.util.Random;


public abstract class Card{
    RandomPhraseGenerator randomPhraseGenerator = RandomPhraseGenerator.getRandomPhraseGenerator();
    public void interact(List<String> phrases) {
        System.out.println(randomPhraseGenerator.generatePhrase(phrases));
    }
    public abstract List<String> getPhrases();
}

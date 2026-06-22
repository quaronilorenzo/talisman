package Deck;

import Game.Game;
import Player.Player;
import Utils.RandomGenerator;

import java.util.List;


public abstract class Card{
    private final RandomGenerator randomPhraseGenerator = RandomGenerator.getRandomPhraseGenerator();
    public void interact(List<String> phrases) {
        System.out.println(randomPhraseGenerator.generatePhrase(phrases));
    }
    public abstract List<String> getPhrases();
    public abstract void applyEffect(Game game, Player player);
}

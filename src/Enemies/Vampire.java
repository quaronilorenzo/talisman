package Enemies;

import Deck.Card;

import java.util.List;
import java.util.Random;

public class Vampire extends Enemy {
    @Override
    public List<String> getPhrases() {
        return getVampireCostants();
    }
    public List<String> getVampireCostants() {
        return vampireCostants.STARTINGPHRASES;
    }
    private VampireCostants vampireCostants = new VampireCostants();
}

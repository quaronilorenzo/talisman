package Enemies;

import Deck.Card;

import java.util.List;
import java.util.Random;

public class Vampire extends Enemy implements Card{
    private final static Random randomPhraseGenerator = new Random();
    @Override
    public void interact() {
        System.out.println(vampireCostants.STARTINGPHRASES
                .get(
                    randomPhraseGenerator.nextInt(
                            VampireCostants.STARTINGPHRASES.size()
                    )
                )
        );
    }
    private VampireCostants vampireCostants = new VampireCostants();

    public VampireCostants getVampireCostants() {
        return vampireCostants;
    }

    public void setVampireCostants(VampireCostants vampireCostants) {
        this.vampireCostants = vampireCostants;
    }
}

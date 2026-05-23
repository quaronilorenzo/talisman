package Enemies;

import java.util.List;

public class Vampire extends Enemy {
    @Override
    public List<String> getPhrases() {
        return getVampireStartingPhrases();
    }
    private List<String> getVampireStartingPhrases() {
        return vampireCostants.startingPhrases;
    }
     public List<String> getVampireWinningPhrases(){
        return vampireCostants.winningPhrases;
    }
    private List<String> getVampireLosingPhrases(){
        return vampireCostants.losingPhrases;
    }
    private VampireCostants vampireCostants = VampireCostants.getVampireCostants();
    public Vampire(){}
    public Vampire(int health, int attack, int defense) {
        this.setHealth(health);
        this.setAttack(attack);
        this.setDefense(defense);
    }
}

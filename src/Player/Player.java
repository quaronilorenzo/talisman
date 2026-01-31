package Player;

import Player.PlayerState.AliveState;
import Player.PlayerState.PlayerState;

public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;
    private int defense;
    private int lvl = PlayerCostants.STARTING_LVL;
    private PlayerState state;
    public Player(String name, int health, int attack, int defense, int strength){
        this.name = name;
        this.health = PlayerCostants.STARTING_HEALTH + health;
        this.attack = PlayerCostants.BAREKNUCKLE_DAMAGE + attack;
        this.defense = PlayerCostants.STARTING_DEFENSE + defense;
        this.strength = PlayerCostants.STARTING_STRENGTH + strength;
        this.state = new AliveState();
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
    public void setState(PlayerState state) {
        this.state = state;
    }

    public String stats() {
        return "Player stats: " +
                "  name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                ", attack=" + attack +
                ", defense=" + defense;
    }
}

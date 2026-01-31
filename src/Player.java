
public class Player {
    private int health = PlayerCostants.STARTING_HEALTH;
    private int attack = PlayerCostants.BAREKNUCKLE_DAMAGE;
    private int defense = PlayerCostants.STARTING_DEFENSE;

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
}

package Enemies;

import Deck.Card;

import java.util.List;

public abstract class Enemy extends Card {
    private int health;
    private int attack;
    private int defense;

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
}

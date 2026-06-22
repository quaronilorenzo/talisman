package Enemies;

import Deck.Card;
import Game.Game;
import Player.Player;

import java.util.List;

public abstract class Enemy extends Card {
    private String name;
    private int health;
    private int attack;
    private int defense;
    public void applyEffect(Game game, Player player) {
        game.fight(this, player);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract List<String> getWinningPhrases();
    public abstract List<String> getLosingPhrases();
}

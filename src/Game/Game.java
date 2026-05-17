package Game;

import Enemies.Enemy;
import Player.Player;

import java.util.Objects;

public class Game {
    private static Game game = new Game();

    private Game() {}

    private boolean isWinning;
    public void fight(Enemy enemy, Player player){
        while(player.getHealth() > 0 && enemy.getHealth() > 0){
            playerTurn(enemy, player);
            if(enemy.getHealth() == 0){
                // setWinning();
                break;
            }
            enemyTurn(enemy, player);
        }
    }
    private void playerTurn(Enemy enemy, Player player){
        int healthDamaged = enemy.getHealth() - player.getAttack();
        enemy.setHealth(healthDamaged);
        if(enemy.getHealth() < 0){
            enemy.setHealth(0);
        }
        System.out.println("Hit confirmed! The enemy has " + enemy.getHealth() + " HP remaining");
    }
    private void enemyTurn(Enemy enemy, Player player){
        int healthDamaged = player.getHealth() - enemy.getAttack();
        player.setHealth(healthDamaged);
        if(player.getHealth() < 0){
            player.setHealth(0);
        }
        System.out.println("Hit confirmed! You have " + player.getHealth() + " HP remaining");
    }

    public boolean isWinning() {
        return isWinning;
    }

    public void setWinning(boolean winning) {
        this.isWinning = winning;
    }

    public static Game getGame() {
        return game;
    }

}

package Game;

import Enemies.Enemy;
import Player.Player;

import java.util.Objects;

public class Game {
    private static Game game = new Game();

    private Game() {}

    public void fight(Enemy enemy, Player player){
        while(player.getHealth() > 0 && enemy.getHealth() > 0){
            playerTurn(enemy, player);
            enemyTurn(enemy, player);
            printPhrases(enemy,player);
        }
    }
    private void playerTurn(Enemy enemy, Player player){
        if(player.getHealth() != 0){
            int healthDamaged = enemy.getHealth() - player.getAttack();
            enemy.setHealth(healthDamaged);
            if(enemy.getHealth() < 0){
                enemy.setHealth(0);
            }else{
                System.out.println("Hit confirmed! The enemy has " + enemy.getHealth() + " HP remaining");
            }
        }
    }
    private void enemyTurn(Enemy enemy, Player player){
        if(enemy.getHealth() != 0){
            int healthDamaged = player.getHealth() - enemy.getAttack();
            player.setHealth(healthDamaged);
            if(player.getHealth() < 0){
                player.setHealth(0);
            }else{
                System.out.println("Hit confirmed! You have " + player.getHealth() + " HP remaining");
            }
        }
    }


    private void printPhrases(Enemy enemy, Player player){
        if (player.getHealth() == 0 && enemy.getHealth() > 0){
            System.out.println(enemy.getWinningPhrases());
        }
        if (player.getHealth() > 0 && enemy.getHealth() == 0){
            System.out.println(enemy.getLosingPhrases());
        }
    }


    // Singleton
    public static Game getGame() {
        return game;
    }

}

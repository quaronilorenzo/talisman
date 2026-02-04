package Game;

import Enemies.Enemy;
import Player.Player;

public class EnemyFightState implements FightState{

    @Override
    public void PlayerTurn(Enemy enemy, Player player, Game game) {
        // do nothing
    }

    @Override
    public void EnemyTurn(Enemy enemy, Player player, Game game) {
        int healthDamaged = player.getHealth() - enemy.getAttack();
        player.setHealth(healthDamaged);
        System.out.println("Enemy hitted you, you lost " + enemy.getAttack() + " HP, you have still " + player.getHealth() + " left!");
        game.setFightState(new PlayerFightState());
    }
}

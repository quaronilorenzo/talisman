package Game;

import Enemies.Enemy;
import Player.Player;

public class PlayerFightState implements FightState{

    @Override
    public void PlayerTurn(Enemy enemy, Player player, Game game ) {
        int healthDamaged = enemy.getHealth() - player.getAttack();
        enemy.setHealth(healthDamaged);
        System.out.println("Hit confirmed! The enemy has " + enemy.getHealth() + " HP remaining");
        game.setFightState(new EnemyFightState());
    }
    @Override
    public void EnemyTurn(Enemy enemy, Player player, Game game) {
        // do nothing
    }
}

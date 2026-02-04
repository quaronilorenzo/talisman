package Game;

import Enemies.Enemy;
import Player.Player;

public interface FightState {
    public void PlayerTurn(Enemy enemy, Player player, Game game);

    void EnemyTurn(Enemy enemy, Player player, Game game);
}

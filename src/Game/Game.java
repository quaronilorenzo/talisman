package Game;

import Enemies.Enemy;
import Player.Player;

public class Game {
    FightState fightState = new PlayerFightState();

    public void fight(Enemy enemy, Player player){
        while(enemy.getHealth() <= 0 || player.getHealth() <= 0){

        }
    }

    public void setFightState(FightState fightState) {
        this.fightState = fightState;
    }
}

package Player.PlayerState;

import Player.Player;

public class AliveState implements PlayerState {
    @Override
    public void handle(Player player){
        if(player.getHealth() <= 0){
            player.setState(new DeathState());
        }
    }

    @Override
    public void attack(Player player) {
        //TODO attack - enemy health
    }
}

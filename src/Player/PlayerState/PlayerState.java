package Player.PlayerState;

import Player.Player;

public interface PlayerState {
    public void handle(Player player);
    public void attack(Player player);
}

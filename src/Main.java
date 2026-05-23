import Deck.*;
import Enemies.Enemy;
import Enemies.Vampire;
import Game.Game;
import Player.Player;

public class Main {
    public static void main(String[] args) {
        Game game = Game.getGame();
        Player player = new Player("Quaro", 10, 50, 0, 0, true);
        Vampire enemy = new Vampire(10, 500, 0);
        game.fight(enemy, player);
    }
}
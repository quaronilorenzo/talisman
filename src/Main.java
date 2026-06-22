import Deck.*;
import Enemies.Enemy;
import Enemies.Vampire;
import Game.Game;
import Player.Player;

public class Main {
    public static void main(String[] args) {
        Game game = Game.getGame();
        Player player = new Player("Quaro", 10, 10, 0, 0, true);
        Deck deck = new Deck();

        for (int i = 0; i < 5; i++) {
            Card drawnCard = deck.draw();
            drawnCard.interact(drawnCard.getPhrases());
            drawnCard.applyEffect(game, player);
        }
    }
}
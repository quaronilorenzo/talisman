import Deck.*;
import Enemies.Enemy;
import Game.Game;
import Player.Player;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player player = new Player("Quaro", 10, 0, 0, 0);
        Deck deck = new Deck();

        for (int i = 0; i < 5; i++) {
            Card drawnCard = deck.draw();
            drawnCard.interact(drawnCard.getPhrases());
            //TODO starting creating class game and fighting system
            if(drawnCard instanceof Enemy){
                Enemy enemy = (Enemy) drawnCard;
                game.fight(enemy, player);
            }
        }
    }
}
import Deck.*;
import Enemies.Enemy;
import Enemies.Vampire;
import Game.Game;
import Player.Player;

public class Main {
    public static void main(String[] args) {
        Game game = Game.getGame();
        Player player = new Player("Quaro", 10, 50, 0, 0, true);
        Deck deck = new Deck();
        for (int i = 0; i < 5; i++) {
            Card drawnCard = deck.draw();
            drawnCard.interact(drawnCard.getPhrases());
            if(drawnCard instanceof Enemy){
                Enemy enemy = (Enemy) drawnCard;
                game.fight(enemy, player);
                //TODO sout win / lose  drop e morte, , cambiare fightsystem con piu opzioni, armi
            }

        }
    }
}
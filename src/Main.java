import Deck.*;
import Enemies.Vampire;
import Player.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Quaro", 10, 0, 0, 0);
        Deck deck = new Deck();

        for (int i = 0; i < 5; i++) {
            Card drawnCard = deck.draw();
            drawnCard.interact(drawnCard.getPhrases());
        }
    }
}
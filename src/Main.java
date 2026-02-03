import Deck.*;
import Enemies.Enemy;
import Enemies.Vampire;
import Player.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Quaro", 10, 0, 0, 0);
        Deck deck = new Deck();

        for (int i = 0; i < 5; i++) {
            System.out.println("--- Pescata " + (i + 1) + " ---");

            Card drawnCard = deck.draw();

            drawnCard.interact();

            if (drawnCard instanceof Vampire) {
                System.out.println("È un nemico!");
                Enemy enemy = (Enemy) drawnCard;
            } else {
                System.out.println("Npc.");
            }
        }
    }
}
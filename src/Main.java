import Deck.*;
import Player.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Quaro", 10, 0,0,0); // max 10 points
        Deck deck = new Deck();
        for(int i = 0; i < 5; i++){
            Card card = deck.draw();
            card.interact();
        }

    }
}
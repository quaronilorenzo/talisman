import Player.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Quaro", 10, 0,0,0); // max 10 points
        System.out.println(player.stats());
    }
}
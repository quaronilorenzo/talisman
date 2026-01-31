package Player;

public class DeathState implements PlayerState {
    @Override
    public void handle(Player player){
        System.out.println("Game Over!, you are dead");
    }

    @Override
    public void attack(Player player) {
        // player is dead
    }
}

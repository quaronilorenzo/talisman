package Npc;

import Deck.Card;
import Game.Game;
import Player.Player;

import java.util.List;

public class Npc extends Card {

    @Override
    public List<String> getPhrases() {
        return getNpcCostants();
    }

    @Override
    public void applyEffect(Game game, Player player) {
        // No effect for NPC cards
    }

    public List<String> getNpcCostants() {
        return npcCostants.STARTINGPHRASES;
    }

    private NpcCostants npcCostants = new NpcCostants();
}

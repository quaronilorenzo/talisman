package Npc;

import Deck.Card;

import java.util.List;

public class Npc extends Card {

    @Override
    public List<String> getPhrases() {
        return getNpcCostants();
    }

    public List<String> getNpcCostants() {
        return npcCostants.STARTINGPHRASES;
    }

    NpcCostants npcCostants = new NpcCostants();
}

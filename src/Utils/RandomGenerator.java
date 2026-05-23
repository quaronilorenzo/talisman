package Utils;

import Deck.CardType;
import Enemies.EnemyType;

import java.util.List;
import java.util.Random;

public class RandomGenerator {
    private static RandomGenerator randomPhraseGenerator = new RandomGenerator();
    private RandomGenerator() {}

    public static RandomGenerator getRandomPhraseGenerator() {
        return randomPhraseGenerator;
    }
    public String generatePhrase(List<String> phrases) {
        return phrases
                .get(
                        random.nextInt(
                                phrases.size()
                        )
                );
    }
    public CardType getRandomCardtype(){
        CardType[] cardTypes = CardType.values();
        int randomCard = random.nextInt(cardTypes.length);
        return cardTypes[randomCard];
    }
    public EnemyType getRandomEnemyType(){
        EnemyType[] enemyTypes = EnemyType.values();
        int randomCard = random.nextInt(enemyTypes.length);
        return enemyTypes[randomCard];
    }
    private final static Random random = new Random();
}

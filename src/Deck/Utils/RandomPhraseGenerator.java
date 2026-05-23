package Deck.Utils;

import java.util.List;
import java.util.Random;

public class RandomPhraseGenerator {
    private static RandomPhraseGenerator randomPhraseGenerator = new RandomPhraseGenerator();
    private RandomPhraseGenerator() {}

    public static RandomPhraseGenerator getRandomPhraseGenerator() {
        return randomPhraseGenerator;
    }

    private final static Random random = new Random();
    public String generatePhrase(List<String> phrases) {
        return phrases
                .get(
                        random.nextInt(
                                phrases.size()
                        )
                );
    }
}

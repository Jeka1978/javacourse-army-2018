package strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class CharacterFactoryImpl implements CharacterFactory {
    private Map<Integer, Supplier<Character>> registry = new HashMap<>();

    private Random random = new Random();

    @Override
    public void registry(Supplier<Character> supplier) {
        registry.put(registry.size(), supplier);
    }


    public CharacterFactoryImpl() {

        registry.put(1, Knight::new);
        registry.put(2, Hobbit::new);
    }


    @Override
    public Character create() {
        int i = random.nextInt(registry.size())+1;
        Supplier<Character> characterSupplier = registry.get(i);
        return characterSupplier.get();
    }

    public static void main(String[] args) {
        CharacterFactoryImpl factory = new CharacterFactoryImpl();
        for (int i = 0; i < 10; i++) {
            factory.create().fight(null);
        }
    }
}







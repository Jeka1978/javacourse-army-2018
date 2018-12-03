package strategy;

import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public interface CharacterFactory {
    default void registry(Supplier<Character> supplier){

    }

    Character create();
}

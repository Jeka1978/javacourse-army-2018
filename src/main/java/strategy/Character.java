package strategy;

import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public interface Character {
    void fight(Character enemy);
    int getPower();

    void registryMyself(CharacterFactory factory);

}

package strategy;

/**
 * @author Evgeny Borisov
 */
public interface Character {
    void fight(Character enemy);
    int getPower();
}

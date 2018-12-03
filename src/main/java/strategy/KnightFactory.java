package strategy;

import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class KnightFactory implements Supplier<Knight> {
    @Override
    public Knight get() {
        return new Knight();
    }

    public static void main(String[] args) {

    }
}

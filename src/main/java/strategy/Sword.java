package strategy;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class Sword implements Weapon {
    private Random random = new Random();

    @Override
    public void kick(Character c1, Character c2) {
        int damage = random.nextInt(c1.getPower());
        System.out.println("my sword kick your for damage = " + damage);

    }
}

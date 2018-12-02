package strategy;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class Knife implements Weapon {
    private Random random = new Random();

    @Override
    public void kick(Character c1, Character c2) {
        int damage = random.nextInt(c1.getPower()-2);
        System.out.println("my knife kick your for damage = " + damage);

    }
}

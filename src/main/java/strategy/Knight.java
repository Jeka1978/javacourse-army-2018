package strategy;

import lombok.Data;

/**
 * @author Evgeny Borisov
 */

/*
    Knight, King,..
        add property hp (life)
    GameManager
        doWar(Character c1, Character c2)
    CharacterFactory
        randomCharacter()

 */


@Data
public class Knight implements Character {
    private int power=10;
    private int stamina=5;
    private Weapon weapon = new Sword();


    @Override
    public void fight(Character enemy) {
        weapon.kick(this,enemy);
        stamina--;
        if (stamina < 3) {
            weapon = new Knife();
        }
        if (stamina < 2) {
            weapon = new Weapon() {
                @Override
                public void kick(Character c1, Character c2) {
                    System.out.println("I'm so tired, I prefer to die...");
                }
            };
        }

    }

    @Override
    public void registryMyself(CharacterFactory factory) {
        factory.registry(Knight::new);
    }

    public static void main(String[] args) {
        Knight knight = new Knight();
        for (int i = 0; i < 5; i++) {
            knight.fight(knight);
        }
    }
}





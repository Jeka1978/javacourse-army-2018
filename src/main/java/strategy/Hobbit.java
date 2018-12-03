package strategy;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class Hobbit implements Character {
    @Override
    public void fight(Character enemy) {
        System.out.println("don't kill me!!! I'm just a hobbit");

    }

    @Override
    public int getPower()
    {

        return 0;
    }

    @Override
    @SneakyThrows
    public void registryMyself(CharacterFactory factory) {
        Class<?> type = Class.forName("com.army.adk;jfhalskdjhfdlk");
    }

    public static void main(String[] args) {
        Hobbit hobbit = new Hobbit();
        try {
            hobbit.registryMyself(null);
        } catch (Exception e) {


        }

        System.out.println("THIS IS SUPER IMPORTANT MESSAGE");






    }


}

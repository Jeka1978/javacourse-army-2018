package strategy;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.*;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class ReflectionCharacterFactory implements CharacterFactory {
    private Reflections scanner = new Reflections();
    private List<Class<? extends Character>> characterTypes = new ArrayList<>();
    private Random random = new Random();

    public ReflectionCharacterFactory() {
        Set<Class<? extends Character>> classes = scanner.getSubTypesOf(Character.class);
        for (Class<? extends Character> type : classes) {
            if (!Modifier.isAbstract(type.getModifiers())) {
                characterTypes.add(type);
            }
        }
    }

    @Override
    @SneakyThrows
    public Character create() {

        int i = random.nextInt(characterTypes.size());
        Class<? extends Character> characterClass = characterTypes.get(i);
        return characterClass.newInstance();
    }

    public static void main(String[] args) {
        ReflectionCharacterFactory factory = new ReflectionCharacterFactory();
        for (int i = 0; i < 10; i++) {
            System.out.println(factory.create().getClass());

        }
    }
}












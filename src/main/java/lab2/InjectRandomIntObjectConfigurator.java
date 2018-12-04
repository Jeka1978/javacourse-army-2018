package lab2;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomIntObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object obj) {
        Class<?> type = obj.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomInt.class)) {
                InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
                int min = annotation.min();
                int max = annotation.max();
                Random random = new Random();
                int value = random.nextInt(max - min) + min + 1;
                field.setAccessible(true);
                field.set(obj,value);
            }
        }
    }
}

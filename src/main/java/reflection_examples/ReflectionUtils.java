package reflection_examples;

import lombok.SneakyThrows;
import lombok_examples.Person;
import lombok_examples.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Evgeny Borisov
 */
public class ReflectionUtils {


    @SneakyThrows
    public static void runAllTestMethodsFromClassByName(String className) {
        Class<?> type = Class.forName(className);
        runAllTestMethodsFromClass(type);
    }

    @SneakyThrows
    public static void runAllTestMethodsFromClass(Class type) {
        Object o = type.newInstance();
        runAllTestMethods(o);
    }


    @SneakyThrows
    public static void runAllTestMethods(Object o) {
        Class<?> type = o.getClass();
        Method[] methods = type.getDeclaredMethods();
        for (Method method : methods) {
            int modifiers = method.getModifiers();

            System.out.println(method.getName());
            if (method.getName().startsWith("test")|| method.isAnnotationPresent(Test.class)) {
                method.setAccessible(true);
                method.invoke(o);
            }
        }
    }


    public static void main(String[] args) {


        runAllTestMethodsFromClassByName("lombok_examples.Person");
    }
}



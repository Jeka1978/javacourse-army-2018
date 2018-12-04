package lab2;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {
    private Config config = new JavaConfig();
    private static ObjectFactory ourInstance = new ObjectFactory();
    private List<ObjectConfigurator> configurators = new ArrayList<>();


    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
        configurators.add(new InjectRandomIntObjectConfigurator());
        configurators.add(new AutowiredObjectConfigurator());
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
            type = config.getImplClass(type);
        }

        T t = type.newInstance();


        configurators.forEach(configurator -> configurator.configure(t));

        return t;
    }

}



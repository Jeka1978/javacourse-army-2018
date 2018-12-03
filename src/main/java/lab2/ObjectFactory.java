package lab2;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
            // ask the config about impl
            // scan packages and hope that only single impl will be found
        }
        return null;
    }
}

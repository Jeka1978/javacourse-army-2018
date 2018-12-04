package enum_examples;

import lombok_examples.Person;

/**
 * @author Evgeny Borisov
 */
public interface PersonValidator {
    String validate(Person person);
}

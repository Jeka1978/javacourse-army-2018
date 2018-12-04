package enum_examples;

import lombok_examples.Person;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class AgeValidator implements PersonValidator {
    @Override
    public String validate(Person person) {
        return person.getAge() < 0 ? "can't be negative" : "";
    }
}

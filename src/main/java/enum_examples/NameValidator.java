package enum_examples;

import lombok_examples.Person;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class NameValidator implements PersonValidator {
    @Override
    public String validate(Person person) {
        if (person.getName().startsWith("A")) {
            return "name not valid";
        }
        return "";
    }
}

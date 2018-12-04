package enum_examples;

import lombok_examples.Person;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */

@Component
public class SalaryValidator implements PersonValidator {
    @Override
    public String validate(Person person) {
        return person.getSalary() > 50000 ? "salary to big" : "";
    }
}

package enum_examples;

import lombok_examples.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */

@Component
public class ValidatorAggregator {
    @Autowired(required = false)
    private List<PersonValidator> validators = new ArrayList<>();

    @PostConstruct
    public void init() {
        System.out.println(validators.size());
    }

    public List<String> validate(Person person) {
       return validators.stream().map(validator -> validator.validate(person))
                .collect(Collectors.toList());
    }
}




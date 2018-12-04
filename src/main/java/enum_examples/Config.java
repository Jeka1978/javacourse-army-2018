package enum_examples;

import lombok_examples.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class Config {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ValidatorAggregator validator = context.getBean(ValidatorAggregator.class);
        Person person = new Person();
        person.setName("Alex");
        person.setAge(-200);
        person.setSalary(Integer.MAX_VALUE);
        List<String> list = validator.validate(person);
        list.forEach(System.out::println);
    }
}


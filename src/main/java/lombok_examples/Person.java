package lombok_examples;

import lombok.*;

import java.util.Objects;

/**
 * @author Evgeny Borisov
 */
@Data
@Setter
public class Person {
    private String name;
    @Getter
    private int age;
    private int salary;


}



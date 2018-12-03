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


    @Test
    private void myTest2() {
        System.out.println("test 22222222222");
    }


    public void testPersonState() {
        System.out.println("THis method is test method, but shouldn't be here");
    }

}



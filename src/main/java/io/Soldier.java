package io;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Soldier implements Serializable {
    private String name;
    private transient int age;
}

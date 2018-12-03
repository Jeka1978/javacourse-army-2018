package io;

import lombok.SneakyThrows;

import java.io.*;

/**
 * @author Evgeny Borisov
 */
public class MainToRead {
    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("c:\\temp\\soldiers.obj");

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream oos = new ObjectInputStream(fis);
        Object o = oos.readObject();
        System.out.println("o = " + o);

    }
}










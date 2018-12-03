package io;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author Evgeny Borisov
 */
public class MainToWrite {
    @SneakyThrows
    public static void main(String[] args) {
        Soldier daniel = new Soldier("Sandi", 21);
        File file = new File("c:\\temp\\soldiers.obj");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        FileOutputStream fis = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fis);
        oos.writeObject(daniel);

    }
}










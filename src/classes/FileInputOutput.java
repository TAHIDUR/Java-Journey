package classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputOutput {
    public static void fileRead(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("welcome.txt"));

            writer.write("Welcome to Java");
            writer.write("\nKeep Learning");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

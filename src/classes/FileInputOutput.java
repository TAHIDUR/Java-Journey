package classes;

import java.io.*;

public class FileInputOutput implements Serializable { // Replace with an appropriate long value

    String name;
    String designation;
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

    public static void serialize() throws IOException {
        FileInputOutput info = new FileInputOutput();
        info.name = "Habib";
        info.designation = "BCS Cadre";
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("info.txt"));
        stream.writeObject(info);
        stream.close();
    }

    public static void deserialize() {
        try {
            FileInputOutput.serialize();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FileInputOutput info = new FileInputOutput();
        try {
            ObjectInputStream stream = new ObjectInputStream(new FileInputStream("info.txt"));
            info = (FileInputOutput) stream.readObject();

            System.out.println(info.name);
            System.out.println(info.designation);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

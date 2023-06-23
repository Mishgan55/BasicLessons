package basicLessons.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person misha = new Person(1, "Misha");
        Person anna = new Person(2, "Anna");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("people.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(misha);
            objectOutputStream.writeObject(anna);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

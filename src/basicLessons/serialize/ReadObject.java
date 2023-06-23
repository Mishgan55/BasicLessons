package basicLessons.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
        FileInputStream fileInputStream = new FileInputStream("people.bin");

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person m =(Person) objectInputStream.readObject();
            Person a = (Person) objectInputStream.readObject();
            System.out.println(m);
            System.out.println(a);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

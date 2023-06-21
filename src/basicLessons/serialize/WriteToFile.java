package basicLessons.serialize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File testFile = new File("testFile");
        PrintWriter printWriter = new PrintWriter(testFile);
        for (int i = 0; i < 5; i++) {
            printWriter.println("I love you "+i);

        }
        printWriter.close();
    }
}

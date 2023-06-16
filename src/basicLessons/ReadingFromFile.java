package basicLessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) {
        File file = new File("testFile");


        try {
            Scanner scanner = new Scanner(file);
            String s = scanner.nextLine();
            String[] s1 = s.split(" ");
            int[] numbers = new int[5];
            int count = 0;
            for (String number : s1) {
                numbers[count++] = Integer.parseInt(number);


            }
            System.out.println(Arrays.toString(numbers));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


}

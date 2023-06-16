package basicLessons.exceptions;

import java.util.Scanner;

public class Exception2 {

    public static void main(String[] args) throws ExceptionScanner {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int i = Integer.parseInt(scanner.nextLine());

            if (i!=5){
                throw new ExceptionScanner("You didn't write down 5");



            }
        }
    }
}

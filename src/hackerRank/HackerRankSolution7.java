package hackerRank;
/*The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.*/

import java.util.Scanner;

public class HackerRankSolution7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value=1;

        while (scanner.hasNext()){
            String s = scanner.nextLine();
            System.out.println(value+" "+s);
            value++;
        }
        scanner.close();


    }

}

package hackerRank;

/*In this challenge, you must read an integer, a double, and a String from stdin,
 then print the values according to the instructions in the Output Format section below.
 To make the problem a little easier, a portion of the code is provided for you in the editor.
 */


import java.util.Scanner;

public class HackerRankSolution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();




        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}

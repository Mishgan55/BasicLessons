package hackerRank;
/*You are given an integer n, you have to convert it into a string.

Please complete the partially completed code in the editor.
If your code successfully converts  into a string  the code will print "Good job".
 Otherwise it will print "Wrong answer".*/

import java.util.Scanner;

public class HackerRankSolution8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s=scanner.nextInt();
        if (Integer.toString(s).isEmpty()){
            System.out.println("Wrong answer");

        }else{

            System.out.println("Good job");
        }
    }
}

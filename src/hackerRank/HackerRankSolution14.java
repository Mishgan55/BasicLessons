package hackerRank;

/*Given a string,S , and two indices print a substring consisting of all
 characters in the inclusive range from  to .
  You'll find the String class' substring method helpful in completing this challenge.*/

import java.util.Scanner;

public class HackerRankSolution14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String substring = S.substring(start, end);
        System.out.println(substring);
    }
}

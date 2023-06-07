package hackerRank;

import java.util.Scanner;

/*Given a string, s , matching the regular expression [A-Za-z !,?._'@]+,
 split the string into tokens. We define a token to be one or more consecutive English alphabetic letters.
  Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.*/

public class HackerRankSolution16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if (s.isEmpty()){
            System.out.println(0);
        }else{
        String[] split = s.split("[ !,?._'@]+");
        scan.close();
        int length = split.length;
        System.out.println(length);
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }


        }
    }
}

package hackerRank;
/*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.*/

import java.util.Scanner;

public class HackerRankSolution13 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuffer stringBuffer = new StringBuffer(A);
        stringBuffer.reverse();
        if (A.equals(stringBuffer.toString())){
            System.out.println("Yes");

        }else {
            System.out.println("No");
        }


    }

}

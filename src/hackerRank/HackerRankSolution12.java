package hackerRank;

import java.util.Locale;
import java.util.Scanner;

/*This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length,
 and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters, A and B, perform the following operations:

Sum the lengths of A and B.
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.*/

public class HackerRankSolution12 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String A=sc.next();
        String B=sc.next();
        int a = A.length();
        int b = B.length();
        System.out.println(a+b);
        if(A.compareTo(B)>0){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "
                +B.substring(0,1).toUpperCase()+B.substring(1));
        /* Enter your code here. Print output to STDOUT. */

    }
}

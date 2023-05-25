package hackerRank;

/*Java's System.out.printf function can be used to print formatted output.
 The purpose of this exercise is to test your understanding of formatting output using printf.

To get you started, a portion of the solution is provided for you in the editor;
 you must format and print the input to complete the solution.*/

import java.util.Scanner;

public class HackerRankSolution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

            System.out.printf("%-14s %03d",s1,x);//%-14s-  14 символов отведено на стринг,%03d- маскимально 3 значное
            // число если 2 значное то добавляется 0 в начало

        }
        System.out.println("================================");

    }
}

package hackerRank;

import java.util.Scanner;

/*Task
        Given an integer, , perform the following conditional actions:

        If n is odd, print Weird
        If n is even and in the inclusive range 2 of  5 to , print Not Weird
        If n is even and in the inclusive range of 6 to 20, print Weird
        If n is even and greater than , print Not Weird
        Complete the stub code provided in your editor to print whether or not n is weird.*/

public class HackerRankSolution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(n%2==1){
            System.out.println("Weird");

        }else if(n>=2 && n<=5){
            System.out.println("Not Weird");

        }else if(n>=6 && n<=20){
            System.out.println("Weird");
        }else if(n>20){
            System.out.println("Not Weird");
        }

            scanner.close();
    }
}

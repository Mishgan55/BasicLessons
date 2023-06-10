package hackerRank;

import java.math.BigInteger;
import java.util.Scanner;

/*In this problem, you have to add and multiply huge numbers!
 These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.*/

public class HackerRankSolution20 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();
        BigInteger add = A.add(B);
        BigInteger multiply = A.multiply(B);
        System.out.println(add);
        System.out.println(multiply);

    }
}

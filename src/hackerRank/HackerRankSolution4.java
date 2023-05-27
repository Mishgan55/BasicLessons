package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Task
Given an integer, n, print its first 10 multiples.
 Each multiple n*i (where 1<=n<=10 ) should be printed on a new line in the form: N x i = result.
 */

public class HackerRankSolution4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();


        for (int i = 1; i <=10 ; i++) {
            System.out.println(n+" x "+i+" = "+n*i);


        }

}
}

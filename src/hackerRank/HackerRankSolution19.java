package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/*A prime number is a natural number greater than  whose only positive divisors are  and itself.
 For example, the first six prime numbers are 2,3 ,5 ,7 ,11  and 13.

Given a large integer,n , use the Java BigInteger class' isProbablePrime method to determine and print
 whether it's prime or not prime.*/

public class HackerRankSolution19 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));



        String n = bufferedReader.readLine();
        BigInteger bigInteger = new BigInteger(n);
        boolean probablePrime = bigInteger.isProbablePrime(1);

        if(probablePrime){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }


        bufferedReader.close();
    }
}

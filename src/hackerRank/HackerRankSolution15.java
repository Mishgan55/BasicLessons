package hackerRank;
/*Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies.
 For this challenge, the test is not case-sensitive.
  For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

 */

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class HackerRankSolution15 {
    static boolean isAnagram(String a, String b) {
        String s = a.toLowerCase();
        String s1 = b.toLowerCase();
        if (a.length() != b.length()){
            return false;
        }

        char[] chars = s.toCharArray();
        char[] chars1 = s1.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);

        return Arrays.equals(chars,chars1);


    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

package basicLessons.serialize;

import java.util.ArrayList;
import java.util.Scanner;
class Arithmetic {
    public Arithmetic() {
    }

    public String sum(String[] string){
        ArrayList<String> objects = new ArrayList<>();
        for (String s : string) {
            objects.add(s);

        }


        return objects.toString();
    }
    public Integer sum(Integer[] i){
        int sum=0;
        for (Integer integer : i) {
            sum=integer+sum;

        }



        return sum;
    }



}

public class Solution {

    public static void main(String args[] ) throws Exception {
        Arithmetic arithmetic = new Arithmetic();

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] values = line.split(" ");

        //check if int array
        try{
            Integer.parseInt(values[0]);

            //System.out.println("Integer array");
            Integer[] ia = new Integer[values.length];
            for (int i=0; i< values.length; i++){
                ia[i] = Integer.valueOf(values[i]);
            }
            System.out.println(arithmetic.sum(ia));
        }catch(NumberFormatException nfe){
            //then string array

            //System.out.println("String array");
            System.out.println(arithmetic.sum(values));
        }
    }
}

package basicLessons;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int a=scanner.nextInt();
        switch (a){
            case 0 :
                System.out.println("you are was born");
                break;
            case 6 :
                System.out.println("you start going to school");
                break;
            case 16 :
                System.out.println("You finished school");
                break;
            default:
                System.out.println("you are "+a);
        }
    }
}

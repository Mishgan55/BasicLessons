import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что-нибудь");
        String s=scanner.nextLine();
        System.out.println("Вы ввели "+ s);
    }
}

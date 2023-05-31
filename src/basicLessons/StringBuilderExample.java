package basicLessons;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" my").append(" new").append(" friend");
        sb.reverse().reverse();
        int length = sb.length();
        System.out.println(length);

        System.out.println(sb);
    }
}

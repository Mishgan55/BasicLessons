public class Arrays {
    public static void main(String[] args) {
        int[] numbers=new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=i*12;

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

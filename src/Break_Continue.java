public class Break_Continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i%2==1){
                continue;
            }
            if (i==50){
                break;
            }
            System.out.println("Четное число " + i);

        }
    }
}

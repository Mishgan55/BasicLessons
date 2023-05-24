package basicLessons;

public class Arrays_of_Strings {
    public static void main(String[] args) {
        String[] strings=new String[4];
        for (int i = 0; i < strings.length; i++) {
            strings[i]="world war "+i;
        }
        for (String string: strings){
            System.out.println(string);
        }
        System.out.println();

        int[] number={1,3,4,5,6,8};
        int sum=0;
        for (int x:number){
            sum=sum+x;
        }
        System.out.println("sum= "+sum);
    }
}

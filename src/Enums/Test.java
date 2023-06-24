package Enums;

public class Test {
    public static void main(String[] args) {
        Season summer=Season.SUMMER;
        System.out.println(summer.getAverageTemperature());
        String s = summer.toString();
        System.out.println(s);
        Season winter = Season.valueOf("WINTER");
        System.out.println(winter.getAverageTemperature());
        int ordinal = winter.ordinal();
        System.out.println(ordinal);
    }
}

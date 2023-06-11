package hackerRank;

import java.awt.image.DataBufferInt;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class HackerRankSolution21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int second = scanner.nextInt();


        int numberOfDays;
        int numberOfHours;
        int numberOfMinutes;
        int numberOfSeconds;

        numberOfDays = second / 86400;
        numberOfHours = (second % 86400) / 3600;
        numberOfMinutes = ((second % 86400) % 3600) / 60;
        numberOfSeconds = ((second % 86400) % 3600) % 60;


        System.out.println(String.format("%2d:%02d:%02d", numberOfHours, numberOfMinutes, numberOfSeconds));


    }
}

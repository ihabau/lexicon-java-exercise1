package se.lexicon;
import java.util.Scanner;

public class LeapYear {
    public static void findLeapYear(){

        boolean leap;
        String leapString = "not a";

        Scanner scanner = new Scanner(System.in);
        IO.println("Enter a year: ");
        int year = scanner.nextInt();
        if (year % 400 == 0) {leap = true; leapString = "a"; }
        if (year % 100 == 0) {leap = true; leapString = "a";}
        if (year % 4 == 0) {leap = true; leapString = "a";}

        IO.println("The year " + year + " is " + leapString + " leap year.");

    };
}

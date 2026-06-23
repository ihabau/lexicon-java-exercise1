package se.lexicon;
import java.util.*;

public class LargestNumber {

    public static int[] numbers = {14, 3, 78, 45, 22, 91, 7, 56};

    public static void LargedstNumber() {
        int number = numbers[0];
        for (int n : numbers) {
            if (n > number) {
                number = n;
            }
        }
        Print.printLeft("largest number is: " + number);
    }


}

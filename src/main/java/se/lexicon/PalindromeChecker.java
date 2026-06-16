package se.lexicon;
import java.util.Scanner;

public class PalindromeChecker {

    public static void PalindromeChecker() {
        while (true) {
        System.out.println("inter a word");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        if (word.indexOf(' ') != -1) {
            System.out.println("please inter one word no spaces!");
            continue;
        }

        int firstHalf = 0;
        int secondHalf = 0;
        if (word.length() % 2 == 1) {
            firstHalf = word.length() / 2;
            secondHalf = word.length() / 2 + 1;
        } else {
            firstHalf = word.length() / 2;
            secondHalf = word.length() / 2;
        }

        String leftStr = word.substring(0,firstHalf).toLowerCase();
        StringBuilder sb = new StringBuilder(word.substring(secondHalf,word.length()));
        String rightStr = sb.reverse().toString().toLowerCase();

        if (leftStr.equalsIgnoreCase(rightStr)) {
            System.out.println(word + " is a palindrome");
        }

        if (!leftStr.equalsIgnoreCase(rightStr)) {
            System.out.println(word + " is not a palindrome");
        }

        //System.out.println( leftStr + " " + rightStr );
        break;
        }
    }
}

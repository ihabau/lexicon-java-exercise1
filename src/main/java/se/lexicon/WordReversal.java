package se.lexicon;
import java.util.Scanner;

public class WordReversal {
    public static void WordReversal() {
        System.out.println("     Word revasal     ");
        System.out.println("     Enter a word and get the revers of it.     ");
        Scanner input = new Scanner(System.in);
        String reverse = "";
        String word = input.nextLine();


        for (int i = word.length() - 1; i > -1 ; i--) {
            //reverse = word.concat(String.valueOf(i));

            reverse += word.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void reverseBuilder() {
        System.out.println("     Word revasal     ");
        System.out.println("     Enter a word and get the revers of it.     ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        StringBuilder sb = new StringBuilder(word);

        String reverse = sb.reverse().toString();


        System.out.println(reverse);
    }

}

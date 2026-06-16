package se.lexicon;
import java.util.Scanner;

public class StringState {

    public static void StringState() {
        System.out.println("Enter a sentance.");
        Scanner input = new Scanner(System.in);

        int letters = 0;
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        String text = input.nextLine();

        for (char ch : text.toCharArray()) {
            ch = Character.toLowerCase(ch);
            if (Character.isLetter(ch) ) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                    vowels += 1;
                } else {
                    consonants += 1;
                }
                letters += 1;
            }
            if (Character.isDigit(ch)) {
                digits += 1;
            }
            if (Character.isWhitespace(ch)) {
                spaces += 1;
            }
        }
        System.out.println(text);
        System.out.println("leters: " + letters);
        System.out.println("consonants: " + consonants);
        System.out.println("vowels: " + vowels);
        System.out.println("digits: " + digits);
        System.out.println("spaces: " + spaces);


        //char.isDigit()
        //char.isLetter()
        //char.isWhitespace()

    }
}

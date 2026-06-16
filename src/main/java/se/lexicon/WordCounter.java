package se.lexicon;
import java.util.Scanner;

public class WordCounter {

    public static void WordCounter() {
        System.out.println("inter a sentence.");

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        sentence = sentence.trim();

        int counter = 1;

        for (char ch : sentence.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                counter += 1;
            }
        }

        System.out.println("word counter: " + counter);
    }

}

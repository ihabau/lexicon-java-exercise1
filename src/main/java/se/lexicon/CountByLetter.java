package se.lexicon;
import java.util.ArrayList;
import java.util.Arrays;

public class CountByLetter {

    public static ArrayList<String> namesList = new ArrayList<>();

    public static void CountByLetter() {

        String[] names = {"Anna", "Bob", "Alice", "Charlie", "Amanda", "David", "Amy", "Brian"};
        // i know that this is redundent for a basic string array but i made it this way
        // because the exercise wanted a list and i asumed that it ment
        namesList.addAll(Arrays.asList(names));

        Print.printLeft("Enter a letter.");

        int counter = 0;
        String ch = ErrorHandling.ErrorHandling("String");
        for ( String name : namesList) {
            if (name.toUpperCase().startsWith(ch.toUpperCase()) ) {
                counter ++;
            }
        }
        Print.printLeft("Number of names that Start with the letter " + ch.toUpperCase() + " is: " + counter );

    }


}

package se.lexicon;
import java.util.*;


public class WordFrequency {

    public static List<String> fruitsList = new ArrayList<>();
    public static List<String> fruitsFreq = new ArrayList<String>();


    public static void WordFrequency() {

        String[] fruits = { "apple", "banana", "apple", "orange", "banana", "apple", "grape", "orange" };
        fruitsList.addAll(Arrays.stream(fruits).toList());
        LinkedHashSet<String> unique = new LinkedHashSet<>(fruitsList);
        fruitsFreq.addAll(unique);

        int[] count = new int[fruitsFreq.size()];

        fruitsList.forEach( fruit -> {
            int i = 0;

            for ( String item : fruitsFreq ) {
                if (fruit.equalsIgnoreCase(item)) {
                    count[i] ++;
                }
                i++;
            }



        });
        for (int i = 0 ; i < fruitsFreq.size(); i++) {

            Print.printLeft( fruitsFreq.get(i) + ": " + count[i] );

        };
    }



}

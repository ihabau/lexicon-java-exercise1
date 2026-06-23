package se.lexicon;

import java.lang.reflect.Array;
import java.util.*;

public class UniqueCities {

    public static List<String> cities = new ArrayList<>();
    public static Collection<String> citiesCollection = new ArrayList<>();

    public static void UniqueCities() {
        cities.add("Stockholm");
        cities.add("Gothenburg");
        cities.add("Malmö");
        cities.add("Stockholm");
        cities.add("Uppsala");
        cities.add("Gothenburg");
        cities.add("Lund");

        System.out.println("List size: " + cities.size());
        cities.forEach(item -> System.out.println("List: " + item));
        //cities.forEach(item -> citiesCollection.add(item));

        LinkedHashSet<String> unique = new LinkedHashSet<>(cities);
        citiesCollection.addAll(unique);

        System.out.println("Collection size: " + citiesCollection.size());
        citiesCollection.forEach(item -> System.out.println("Collection: " + item));
    }
}

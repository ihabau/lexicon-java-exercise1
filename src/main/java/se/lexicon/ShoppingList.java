package se.lexicon;
import java.util.ArrayList;

public class ShoppingList {

    public static ArrayList<String> list = new ArrayList<>();
    public static void ShoppingList() {

        list.add("bannas");
        list.add("apples");
        list.add("tomatoes");
        list.add("watermelon");
        list.add("pears");

        ShoppingList.print();

        int index = list.indexOf("tomatoes");
        System.out.println("remove item " + index + ": " + list.get(index));
        list.remove(index);
        System.out.println("After item removed.");
        ShoppingList.print();

    }

    public static void print() {
        System.out.println("List size: " + list.size());
        int i = 0;
        for( String item : list ) {
            System.out.println(i + ": " + item);
            i++;
        }
    }

}

package se.lexicon;
import java.util.*;

public class PhoneBook {

    public static String[][] book = {
            {"Alice", "070-1234567"},
            {"Bob", "073-2345678"},
            {"Charlie", "076-3456789"},
            {"Diana", "070-4567890"},
            {"Eve", "073-5678901"},
            {"Frank", "076-6789012"},
            {"Grace", "070-7890123"},
            {"Hank", "073-8901234"},
            {"Ivy", "076-9012345"},
            {"Jack", "070-0123456"},
            {"Kate", "073-1234567"},
            {"Leo", "076-2345678"},
            {"Mia", "070-3456789"},
            {"Nick", "073-4567890"},
            {"Olivia", "076-5678901"},
            {"Paul", "070-6789012"},
            {"Quinn", "073-7890123"},
            {"Rosa", "076-8901234"},
            {"Sam", "070-9012345"},
            {"Tina", "073-0123456"},
    };
    public static void PhoneBook() {


    }

    public static void logic() {

        Print.centerCalc("Phone Book");
        Print.printLeft("Enter name.");
        String input = ErrorHandling.ErrorHandling("string");

        boolean found = false;
        for( String [] item : book) {
            if (item[0].equalsIgnoreCase( input)) {
                found = true;
                Print.printLeft(item[1]);
            }
        }
        if (found == false){
            Print.printLeft("contact not found.");
        }
    }


}

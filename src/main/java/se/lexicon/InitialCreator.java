package se.lexicon;
import java.util.Scanner;
public class InitialCreator {

    public static void InitialCreator() {
        System.out.println("Enter full name:");
        Scanner input = new Scanner(System.in);
        String fullName = input.nextLine();
        String cleanName = fullName.trim(); // removes unwanted spaces at the end

        int firstIndex = cleanName.indexOf(" ");
        String prefix = cleanName.substring(0, firstIndex);

        int lastIndex = cleanName.lastIndexOf(" "); // find the last space
        String sufix = cleanName.substring(lastIndex + 1);

        System.out.println("prefix: " + prefix);
        System.out.println("sufix: " + sufix);

        String initial = prefix.charAt(0) + "." + sufix.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initials: " + initial);
    }

}


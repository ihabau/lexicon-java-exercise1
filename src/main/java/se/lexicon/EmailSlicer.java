package se.lexicon;
import java.util.Scanner;

public class EmailSlicer {
    public static void EmailSlicer() {
        System.out.println("Enter your email address!");
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        int atIndex = email.indexOf("@");
        String userName = email.substring(0,atIndex);
        String domain = email.substring(atIndex + 1, email.length());
        System.out.printf("Username: %s\n", userName);
        System.out.printf("Domain: %s\n", domain);
    }
}

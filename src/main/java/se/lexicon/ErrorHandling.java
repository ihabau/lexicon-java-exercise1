package se.lexicon;
import java.util.*;
public class ErrorHandling {

    public static String ErrorHandling(String msg) {

        while (true) {
            Scanner input = new Scanner(System.in);
            String res = input.next();

            if (msg.equalsIgnoreCase("string")) {
                return res;
                // string error handling is not perfect for all methods
            }

            if (msg.equalsIgnoreCase("number")) {
                try {
                  Double resN = Double.parseDouble(res);
                  return resN.toString();
                } catch (Exception e) {
                    Print.printLeft("Try again!");
                    continue;
                }

            }


        }
    }
}

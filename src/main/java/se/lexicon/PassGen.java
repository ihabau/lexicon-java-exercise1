package se.lexicon;
import java.util.Scanner;
import java.util.Random;

public class PassGen {
    public static void PassGen() {

        Random pass = new Random();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        System.out.println("Enter the password length.");
        Scanner input = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        int passLength = input.nextInt();

        for (int i = 0; i < passLength; i++) {
            int randIndex = pass.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(randIndex);
            sb.append(randomChar);

        }

        System.out.println("password generated: " + sb);



    }
}

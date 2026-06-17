package se.lexicon;
import java.util.Scanner;
import java.util.Random;

public class DiceRoller {

    public static void DiceRoller() {

        Random rand = new Random();

        System.out.println("How many dice rolls?");
        Scanner input = new Scanner(System.in);
        int rolls = input.nextInt();
        int counter = 0;

        for (int i = 0; i < rolls; i++) {
            int dice1 = rand.nextInt(6) + 1;
            int dice2 = rand.nextInt(6) + 1;
            String doubleDice = "";
            if (dice1 == dice2) {
                doubleDice = "DOUBLE!";
                counter+=1;
            }

            System.out.printf("Roll %s : %s %s %s\n", i + 1, dice1, dice2, doubleDice);
        }
        System.out.printf("Double rolled: %s out of %s", counter, rolls);

    }
}

package se.lexicon;
import java.util.Scanner;

public class Calculator {

    public static void circleArea () {
        System.out.println("Enter a radius");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        double res = radius * radius * Math.PI;

        //System.out.println(Math.pow(radius, 2));
        System.out.println("area of " + radius + " is " + res);

    }

    public static void PowerCalc() {

        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        double powerNumber = input.nextDouble();

        for (int i = 1; i < 11; i++) {

            System.out.println(i + ": " + Math.pow(powerNumber, i));
        }
    }

    public static void RightAngleCalc() {

        System.out.println("Enter triangle 3 sides");
        Scanner input = new Scanner(System.in);

        double sideA = input.nextDouble();
        double sideB = input.nextDouble();
        double sideC = input.nextDouble();

        double hypotenuse = Math.max(sideA, Math.max(sideB, sideC));
        double smallest = Math.min(sideA, Math.min(sideB, sideC));
        double mid = (sideA + sideB + sideC) - (smallest + hypotenuse);

        System.out.println("Hypotenuse is: " + hypotenuse);
        if (Math.pow(mid,2) + Math.pow(smallest, 2) == Math.pow(hypotenuse, 2)) {
            System.out.println("this is a right triangle.");
        } else {

            System.out.println("this is not a right triangle.");
        }
    }

    public static void NumberCruncher() {

        System.out.println("Enter 3 numbers!");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        double avr = (double) (a + b + c) / 3;

        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
        System.out.printf("Average : %.2f", avr);

    }

}

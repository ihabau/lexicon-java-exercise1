package se.lexicon;
import java.util.ArrayList;
import java.util.Scanner;

public class RecieptBuilder {

    public String itemName;
    public double price;

    public RecieptBuilder (String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    };

    public static final ArrayList<RecieptBuilder> basket =new ArrayList<RecieptBuilder>();

    public static void RecieptBuilder2() {

        boolean repeat = true;

        double price;
        double finalPrice = 0;
        while (repeat) {
            System.out.println("Enter item name and price or done if your finnished.");
            Scanner input = new Scanner(System.in);
            String item = input.next();
            if (item.equalsIgnoreCase("done")) {
                repeat = false;
                print(finalPrice);
            } else {
                price = input.nextDouble();
                RecieptBuilder newItem = new RecieptBuilder(item, price);
                basket.add(newItem);
                finalPrice += price;


            }


        }


    }

    public static void print(double finalPrice) {
        System.out.println("==============================");
        System.out.println("           Receipt");
        System.out.println("==============================");
        for (RecieptBuilder item : basket) {
            System.out.printf("%-24s %5.2f%n", item.itemName, item.price);
        }
        System.out.println("------------------------------");
        System.out.printf("Grand Total: %17.2f%n", finalPrice);
        System.out.println("==============================");
    }

}

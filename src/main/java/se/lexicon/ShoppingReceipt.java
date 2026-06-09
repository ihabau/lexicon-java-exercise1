package se.lexicon;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingReceipt {

        public static void main(String[] args){
        // print the catalog
            int itemCounter = 0;
            String devider = "======================================";
            IO.println(devider);
            IO.println("| Items available for purchase " + Products.CATALOG.length + " |");
            IO.println(devider);
            System.out.printf("| %8.8s | %-15.15s | %5.5sKr |\n", "|Item nr", "Item name", "Price");
            IO.println(devider);

            for (Products item : Products.CATALOG) {
                System.out.printf("| %8.8s | %-15.15s | %5.5s |\n", itemCounter + 1, item.name, item.price);
                itemCounter += 1;
            }
        ShoppingReceipt.shopping();
        }


        //add items to shopping cart.

        public static void shopping() {
            String devider = "======================================";
            System.out.println(devider);
            System.out.println("|     Add item number and amount!    |");
            System.out.println(devider);
            boolean ckeckout = false;

            Scanner addedItem = new Scanner(System.in);
            // here we add the items to the cart
            int cartItemNumber = addedItem.nextInt();
            cartItemNumber -= 1;
            int cartItemAmount = addedItem.nextInt();
            double calc = cartItemAmount * Products.CATALOG[cartItemNumber].price;
            System.out.printf("%s %s %s %s/n",cartItemNumber, Products.CATALOG[cartItemNumber].name, cartItemAmount, calc );

        ShoppingCart.addItem(Products.CATALOG[cartItemNumber].name, Products.CATALOG[cartItemNumber].price , cartItemAmount);
        System.out.println(cartItemNumber + " || " + ShoppingCart.basket.get(0).itemName);
        }

    }


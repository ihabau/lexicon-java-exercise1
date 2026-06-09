package se.lexicon;
import java.util.ArrayList;

public class ShoppingCart {
    public String itemName;
    public double unitPrice;
    public int amount;

    public ShoppingCart(String itemName, double unitPrice, int amount) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.amount = amount;

    }

    public static final ArrayList<ShoppingCart> basket = new ArrayList<>();

    // A static method inside the class to handle additions directly
    public static void addItem(String name, double price, int qty) {
        ShoppingCart newItem = new ShoppingCart(name, price, qty);
        basket.add(newItem); // Adds directly to the global list above
        System.out.println("✅ Added to internal class basket: " + name);
    }

    public double getCalculationPrice() {
        return this.unitPrice * this.amount;
    }
}

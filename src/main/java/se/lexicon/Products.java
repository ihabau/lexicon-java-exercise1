package se.lexicon;

public class Products {
    public String name;
    public double price;

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static final Products[] CATALOG = {

            // === FRUITS ===
            new Products("Apple", 15.00),
            new Products("Banana", 12.50),
            new Products("Orange", 14.00),
            new Products("Pear", 16.50),
            new Products("Strawberries", 35.00),
            new Products("Blueberries", 29.90),
            new Products("Grapes", 28.00),
            new Products("Watermelon", 45.00),
            new Products("Lemon", 8.00),
            new Products("Peach", 18.50),

            // === VEGETABLES ===
            new Products("Tomato", 22.00),
            new Products("Cucumber", 15.00),
            new Products("Lettuce", 19.00),
            new Products("Carrot", 11.50),
            new Products("Potato", 13.00),
            new Products("Onion", 9.50),
            new Products("Garlic", 7.00),
            new Products("Broccoli", 21.00),
            new Products("Bell Pepper", 17.50),
            new Products("Spinach", 24.00),

            // === DAIRY PRODUCTS ===
            new Products("Milk", 22.50),
            new Products("Cheese", 65.00),
            new Products("Butter", 42.00),
            new Products("Yogurt", 19.50),
            new Products("Sour Cream", 16.00),
            new Products("Heavy Cream", 23.00),
            new Products("Cottage Cheese", 26.50),
            new Products("Greek Yogurt", 32.00),
            new Products("Feta Cheese", 29.00),
            new Products("Cream Cheese", 25.00)


    };
};

public public class Refactoring {
    private String name;
    private double price;
    private int stock;

    private static final double DISCOUNT_RATE = 0.1; // 10% discount

    // Constructor
    public Refactoring(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // New method to calculate discount
    public double calculateDiscount() {
        return price * (1 - DISCOUNT_RATE);
    }

    // Display product details
    public void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Discounted Price: $" + calculateDiscount());
        System.out.println("Stock: " + stock);
    }

    // Adjust stock
    public void applyStockAdjustment(int adjustment) {
        stock += adjustment;
        System.out.println("Stock adjusted. New stock: " + stock);
    }
}

public class Inventory {
    private Refactoring product;
    private String location;

    // Constructor
    public Inventory(Refactoring product, String location) {
        this.product = product;
        this.location = location;
    }

    // Setter methods
    public void setProduct(Refactoring product) {n
        this.product = product;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Show inventory details
    public void showInventory() {
        System.out.println("Location: " + location);
        product.displayProduct();
    }
}

public class Main {
    public static void main(String[] args) {
        Refactoring prod = new Refactoring("Smartphone", 699.99, 50);
        Inventory inv = new Inventory(prod, "Warehouse A");

        inv.showInventory();
        prod.applyStockAdjustment(10);
        inv.showInventory();
    }
}
 {
    
}

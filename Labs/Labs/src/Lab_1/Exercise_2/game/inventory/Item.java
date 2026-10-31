package Lab_1.Exercise_2.game.inventory;

/**
 * Represents a single game title available in the shop.
 * Access modifiers are chosen to enforce least privilege.
 */

public class Item {

    // Declares fields with appropriate access modifiers

    private String name;
    private String genre;
    private int stockCount;
    private String serialCode;

    // Full Constructor
    public Item(String name, String genre, int stockCount, String serialCode) {
        this.name = name;
        this.genre = genre;
        this.stockCount = stockCount;
        this.serialCode = serialCode;
    }

    // Public Getters
    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getStockCount() {
        return stockCount;
    }

    // Private-package
        String getSerialCode() {
        return serialCode;
    }

    // Checks whether enough stock exists
    private boolean isAvailable(int quantity) {
        return stockCount >= quantity;
    }

    public void sell(int quantity) {
        // Check stock before selling
        if (isAvailable(quantity)) {
            stockCount -= quantity;
            System.out.println("Sold " + quantity + " copy/copies of " + name + ". Remaining stock: " + stockCount);
            } else {
            System.out.println("WARNING: Not enough stock for " + name + ". Requested: " + quantity + ", Available: " + stockCount);
        }
    }
}
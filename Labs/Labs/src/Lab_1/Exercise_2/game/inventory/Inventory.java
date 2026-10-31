package Lab_1.Exercise_2.game.inventory;

/**
 * Manages a collection of Items in the game shop.
 */

public class Inventory {

    private Item[] items;
    private int count;

    public Inventory() {
        items = new Item[10];
        count = 0;
    }

    // Public Methods
    public void addItem(Item item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        }
    }

        public void displayAll() {
        System.out.println("--- Inventory Listing ---");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-15s | %-10s | Stock: %d%n", items[i].getName(), items[i].getGenre(), items[i].getStockCount());
        }
    }

    public void auditSerialCodes() {
        System.out.println("--- Serial Code Audit ---");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-15s -> %s%n", items[i].getName(), items[i].getSerialCode());
        }
    }
}
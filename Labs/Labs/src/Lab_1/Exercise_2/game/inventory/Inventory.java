package Lab_1.Exercise_2.game.inventory;

/**
 * Manages a collection of Items in the game shop.
 */

public class Inventory {

    private Item[] items; //list
    private int count;

    public Inventory() {
        items = new Item[10];
        count = 0;
    }

    /** Adds an item to the inventory. */
    public void addItem(Item item) {
        // TODO: Add item to the array, increment count
    }

    /** Displays name, genre, and stock count for every item. */
    public void displayAll() {
        System.out.println("--- Inventory Listing ---");
        // TODO: Loop through items and print each one's public info
    }

    /**
     * Prints each item's name and serial code.
     * This is allowed because Inventory is in the SAME package as Item,
     * so it can access Item's package-private getSerialCode() method.
     */
    public void auditSerialCodes() {
        System.out.println("--- Serial Code Audit ---");
        // TODO: Loop through items, call item.getSerialCode() for each
    }
}

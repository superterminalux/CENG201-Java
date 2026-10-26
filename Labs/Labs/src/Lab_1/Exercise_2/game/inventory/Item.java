package Lab_1.Exercise_2.game.inventory;

/**
 * Represents a single game title available in the shop.
 * Access modifiers are chosen to enforce least privilege.
 */

public class Item {

    // TODO: Declare fields with appropriate access modifiers
    // name, genre, stockCount -> private
    // serialCode              -> private (no public getter!)


    public Item(String name, String genre, int stockCount, String serialCode) {
        // TODO: Initialize all fields
    }

    // TODO: Public getters for name, genre, stockCount only

    /**
     * Package-private: accessible within game.inventory, hidden from outside.
     * Used by Inventory for auditing purposes.
     */
    // TODO: Declare getSerialCode() with NO access modifier (package-private)


    /**
     * Private helper: checks whether enough stock exists.
     */
    private boolean isAvailable(int quantity) {
        // TODO: Return true if stockCount >= quantity
        return false;
    }

    /**
     * Reduces stock by the given quantity if available.
     * Prints a warning if stock is insufficient.
     */
    public void sell(int quantity) {
        // TODO: Use isAvailable() to check stock before selling
        //       If available: reduce stockCount, print confirmation
        //       If not: print warning message, do NOT change stockCount
    }
}
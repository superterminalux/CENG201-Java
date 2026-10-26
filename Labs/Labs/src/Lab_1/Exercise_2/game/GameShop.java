package Lab_1.Exercise_2.game;

public class GameShop {
    public static void main(String[] args) {

        Inventory shop = new Inventory();

        // TODO: Create 3 Item objects and add them to the inventory
        // Suggested items:
        //   "Galaxy Racer",  "Racing",  12 units, serial "GR-4421"
        //   "Shadow Realm",  "RPG",      5 units, serial "SR-8873"
        //   "Pixel Legends", "Strategy", 3 units, serial "PL-0091"

        // TODO: Call displayAll()

        System.out.println();

        // TODO: Sell some copies:
        //   Sell 4 copies of "Galaxy Racer"
        //   Sell 6 copies of "Shadow Realm" (should trigger warning — only 5 in stock)

        System.out.println();

        // TODO: Call displayAll() again to show updated stock

        System.out.println();

        // TODO: Call auditSerialCodes()

        // TODO: Try calling getSerialCode() directly from here — it should FAIL to compile.
        //       Leave this as a COMMENT explaining why it doesn't work:
        // System.out.println(item.getSerialCode()); // WHY does this fail?
    }
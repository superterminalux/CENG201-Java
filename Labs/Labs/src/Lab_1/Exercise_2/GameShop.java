package Lab_1.Exercise_2;

import Lab_1.Exercise_2.game.inventory.Item;
import Lab_1.Exercise_2.game.inventory.Inventory;



public class GameShop {
    public static void main(String[] args) {

        Inventory shop = new Inventory();

        // Creates 3 Item objects and add them to the inventory
        Item game1 = new Item("Galaxy Racer",  "Racing",  12, "GR-4421");
        Item game2 = new Item("Shadow Realm",  "RPG",      5, "SR-8873");
        Item game3 = new Item("Pixel Legends", "Strategy", 3, "PL-0091");

        // Adds items
        shop.addItem(game1);
        shop.addItem(game2);
        shop.addItem(game3);

        // Prints current inventory
        shop.displayAll();

        System.out.println();

        game1.sell(4);
        game2.sell(6);

        System.out.println();
        shop.displayAll();

        System.out.println();

        // shop.auditSerialCodes();

        // TODO: Try calling getSerialCode() directly from here — it should FAIL to compile.
        //       Leave this as a COMMENT explaining why it doesn't work:
        // System.out.println(item.getSerialCode()); // WHY does this fail?
        // Because the GameShop class is not included in game.inventory.
    }
}
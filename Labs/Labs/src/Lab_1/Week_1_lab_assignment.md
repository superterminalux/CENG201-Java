# Lab 1: Java Recall

### Directory Structure

## Exercise 1: Playlist Track

**Problem Statement**: You are building the data layer for a music streaming application.
Design a class called `Track` that represents a single song in a playlist. A Track has the following fields: 
  1. title (type: String) --> Song title
  2. artist (type: String) --> Artist Name
  3. durationSeconds (type: int) --> length of the song in seconds
  4. isExplicit (type: boolean) --> Wheither the track has explicit content

---

**Requirements**:
   1. Constructor requirements (you must implement ALL of these):
      - Default constructor: sets title to "Unknown Title", artist to "Unknown Artist", durationSeconds to 0, isExplicit to false
      - Title-only constructor accepts only a title; delegates to the full constructor
      - Title + artist constructor accepts title and artist; delegates to the full constructor
      - Full constructor  accepts all four fields; validates that durationSeconds >= 0 (print an error and set to 0 if invalid)

    2. Provide `getters` methods for all four fields
    3. Provide a `getDurationFormatted()` method that returns the duration as "m:ss" (ex,"3:45")
    4. Provide a `toString()` method that returns a single-line summary (see expected output)
    5. Use this(...) to chain constructors (no constructor should duplicate initialization logic)
    6. Write a Test class `PlaylistDemo` to test all four constructors and all methods.

---

**Starter Code**:

`track.java`:
```java
/**
 * Track.java
 * Represents a single music track in a streaming playlist.
 *
 * Your Name:        ___________________________
 * Your Student ID:  ___________________________
 * Your Date:        ___________________________
 */
public class Track {

    // -------------------------------------------------------
    // Instance variables
    // -------------------------------------------------------
    private String title;
    private String artist;
    private int    durationSeconds;
    private boolean isExplicit;

    // -------------------------------------------------------
    // TODO 1: Full constructor (all four parameters).
    //         Validate durationSeconds — must be >= 0.
    //         If invalid, print: "Warning: Invalid duration. Setting to 0."
    //         and set durationSeconds to 0.
    // -------------------------------------------------------
    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        // Your code here
    }

    // -------------------------------------------------------
    // TODO 2: Title + artist constructor.
    //         Delegate to the full constructor using this(...).
    //         Default: durationSeconds = 0, isExplicit = false
    // -------------------------------------------------------
    public Track(String title, String artist) {
        // Your code here (one line using this(...))
    }

    // -------------------------------------------------------
    // TODO 3: Title-only constructor.
    //         Delegate to the full constructor using this(...).
    //         Default: artist = "Unknown Artist", duration = 0, explicit = false
    // -------------------------------------------------------
    public Track(String title) {
        // Your code here (one line using this(...))
    }

    // -------------------------------------------------------
    // TODO 4: Default constructor.
    //         Delegate to the full constructor using this(...).
    // -------------------------------------------------------
    public Track() {
        // Your code here (one line using this(...))
    }

    // -------------------------------------------------------
    // TODO 5: Getters for all four fields.
    // -------------------------------------------------------


    // -------------------------------------------------------
    // TODO 6: getDurationFormatted()
    //         Returns duration as "m:ss" — ex., 225 seconds -> "3:45"
    //         Hint: minutes = durationSeconds / 60
    //               seconds = durationSeconds % 60
    //         Use String.format to ensure seconds is always two digits: "%02d"
    // -------------------------------------------------------
    public String getDurationFormatted() {
        // Your code here
        return "";
    }

    // -------------------------------------------------------
    // TODO 7: toString()
    //         Returns: "\"Title\" by Artist [m:ss] [EXPLICIT]"
    //         Only append " [EXPLICIT]" if isExplicit is true.
    //         Example: "\"Neon Lights\" by Stellar Echo [4:02] [EXPLICIT]"
    //         Example: "\"Ocean Drive\" by Midnight Pulse [3:30]"
    // -------------------------------------------------------
    @Override
    public String toString() {
        // Your code here
        return "";
    }
}

```

`PlaylistDemo.java`:

```java
/**
 * PlaylistDemo.java
 * Driver program to test the Track class.
 *
 * Name:        ___________________________
 * Student ID:  ___________________________
 * Date:        ___________________________
 */

public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        // TODO: Create one Track object using EACH of the four constructors.
        //       Print each track's toString() result.
        //       Also test getDurationFormatted() and individual getters.
        //       Test the invalid-duration case (negative value).

        // --- Default constructor ---


        // --- Title-only constructor ---


        // --- Title + artist constructor ---


        // --- Full constructor ---

        // --- Getter test ---

        // --- Invalid duration test ---



    }
}

```
---

**Expected Output**:

```
=== Playlist Track Demo ===

Default Track: 
"Unknowm Title" by Unknown Artist [0:00]

Title-only track:
"Neon Lights" by Unknown Artist [0:00]

Title + Artist Track:
"Ocean Drive" by Midnight Pulse [0:00]

Full Track (non-explicit):
"Raindrop Waltz" by Clara Voss [3:30]

Invalid Duration Test:
Warning: Invalid duration. Setting to 0.
"Broken Clock" by Static Noise [0:00]

Getter Test:
Title:     Stardust
Artist:    Stellar Echo
Duration:  4:02
Explicit:  true

```
---

**Hints**:
- this(...) must be the very first statement inside a constructor, you cannot write any other code before it.
For getDurationFormatted(), use String.format("%d:%02d", minutes, seconds)
- the %02d ensures seconds always shows two digits (ex, "3:05" not "3:5").
In the toString() method, use a conditional expression or if block to optionally append " [EXPLICIT]".
- Remember: if you define any constructor, Java will not automatically provide a default one. You must write it yourself.

---






## Exercise 2: Game Shop Inventory with Access Modifiers

**Objective**: Practice choosing appropriate access modifiers and applying the Principle of Least Privilege across two classes in a package.

Lab1/
├── game/
│   ├── inventory/
│   │   ├── Item.java
│   │   └── Inventory.java
├── GameShop.java

---

**Problem Statement**:

You are designing the inventory system for a video game shop. Create a package `game.inventory` containing two classes: `Item` and `Inventory`. Each class must use access modifiers deliberately — every field and method should have the **most restrictive** access level that still allows the program to work correctly.

**Requirements for `Item`**:
- `private` fields: `name` (String), `genre` (String), `stockCount` (int), `serialCode` (String)
- `public` constructor: `Item(String name, String genre, int stockCount, String serialCode)`
- `public` getters for `name`, `genre`, and `stockCount` — but **no getter for `serialCode`** (it is internal only)
- `public` method `sell(int quantity)`: decreases `stockCount` by `quantity`; prints a warning and does nothing if stock would go negative
- **Package-private** (no modifier) method `getSerialCode()`: accessible within the package for inventory auditing, but not from outside
- `private` helper method `isAvailable(int quantity)`: returns `true` if `stockCount >= quantity`

**Requirements for `Inventory`**:
- `private` field: an array of `Item` objects (size 10), and an `int` tracking how many items have been addedz
- `public` method `addItem(Item item)`: adds an item to the inventory
- `public` method `displayAll()`: prints all items with their name, genre, and stock count
- `public` method `auditSerialCodes()`: prints each item's name alongside its serial code — this works because `Inventory` is in the **same package** as `Item` and can call the package-private `getSerialCode()`

Write `GameShop.java` in the root directory that imports from `game.inventory` and demonstrates all features.

---

**Starter Code**:

`game/inventory/Item.java`:
```java
// TODO: Add package declaration

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
```

`game/inventory/Inventory.java`:
```java
// TODO: Add package declaration

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
```

`GameShop.java`:
```java
// TODO: Import Item and Inventory from game.inventory

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
}
```

---

**Expected Output**:

```
--- Inventory Listing ---
Galaxy Racer    | Racing   | Stock: 12
Shadow Realm    | RPG      | Stock: 5
Pixel Legends   | Strategy | Stock: 3

Sold 4 copy/copies of Galaxy Racer. Remaining stock: 8
WARNING: Not enough stock for Shadow Realm. Requested: 6, Available: 5

--- Inventory Listing ---
Galaxy Racer    | Racing   | Stock: 8
Shadow Realm    | RPG      | Stock: 5
Pixel Legends   | Strategy | Stock: 3

--- Serial Code Audit ---
Galaxy Racer    -> GR-4421
Shadow Realm    -> SR-8873
Pixel Legends   -> PL-0091
```

---

**Hints**:
- A method with **no access modifier** is package-private by default — simply write `String getSerialCode()` with no keyword before it
- To demonstrate that `getSerialCode()` is inaccessible outside the package, write the call as a **comment** in `GameShop.java` and explain why it would fail
- The `isAvailable()` helper is `private` — it is only called from within `Item` itself, so no other class should ever see it

---
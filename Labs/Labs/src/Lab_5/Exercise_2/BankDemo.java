/**
 * BankDemo.java
 * Your Name:        __________________
 * Your Student ID:  240446034
 * Your Date:        16.11.26
 */

package Lab_5.Exercise_2;

public class BankDemo {

    public static void main(String[] args) {

        // Step 1: Create a Bank object.
        Bank bank = new Bank();

        // Step 2: Simulate customer arrivals.
        bank.arrive("Ali");
        bank.arrive("Ayse");
        bank.arrive("Mehmet");
        bank.arrive("Zeynep");
        bank.arrive("Can");

        // Step 3: Display the current bank status.
        bank.displayStatus();

        // Step 4: Complete Teller 2's transaction.
        bank.completeTransaction(2);

        // Step 5: Display the updated bank status.
        bank.displayStatus();

        // Step 6: Complete Teller 1's transaction.
        bank.completeTransaction(1);

        // Step 7: Display the updated bank status.
        bank.displayStatus();
    }
}

/**
 * Your Name:        _________________
 * Your Student ID:  240446034
 * Your Date:        16.11.26
 *
 * The Bank class manages three tellers and one waiting queue.

 We will use a String array to represent the three teller positions:
 - tellers[0] represents Teller 1.
 - tellers[1] represents Teller 2.
 - tellers[2] represents Teller 3.
 - null means that the teller is available.
 */

package Lab_5.Exercise_2;

public class Bank {

    private String[] tellers;
    private Queue waitingQueue;

    public Bank() {

        // Step 1: Create a String array with 3 elements for tellers.

        // Step 2: Initialize all teller positions as null.

        // Step 3: Create a watting Queue object.
    }

    public void arrive(String customerName) {

        // Step 1: Display the customer's arrival message. (Ex:  "Customer " + customerName + " arrived.")

        // Step 2: Search for an available teller.
        //         An available teller has a null value.

        // Step 3: If an available teller is found:
        //         - Assign the customer to that teller.
        //         - Display the teller assignment message. (Ex: customerName + " is assigned to Teller " + (i + 1) + ".")

        // Step 4: Otherwise:
        //         - Add the customer to waitingQueue using enqueue().
        System.out.println("All tellers are busy.");
        //         - Display a waiting message. (Ex: customerName + " joins the waiting queue.")
    }

    public void completeTransaction(int tellerNumber) {

        // Step 1: Check whether tellerNumber is between 1 and 3. If not, return and print a message "Invalid teller number!"

        //Step 2: Check whether the teller is already available. İf (tellers[index] == null) then print a message "Teller " + tellerNumber + " is already available."


        // Step 3: Display the completed customer's name. (Ex: "Teller " + tellerNumber + " completed " + tellers[index] + "'s transaction.")

        // Step 4: Set the selected teller position to null.

        // Step 5: Call assignNextCustomer(tellerNumber) for that teller.
    }

    public void assignNextCustomer(int tellerNumber) {

        // Step 1: Check whether there are customers waiting. (empty)

        // Step 2: If it is not empty: (!waitingQueue.isEmpty())
        //         - Create a String nextCustomer and Remove it from the queue using dequeue().
        //         - Assign that customer to the available teller.
        //         - Display the assignment message. (Ex: nextCustomer + " is assigned to Teller " + tellerNumber + ".")
    }

    public void displayStatus() {

        System.out.println("\n---------- BANK STATUS ----------");

        // Display the status of all tellers.
        for (int i = 0; i < tellers.length; i++) {

            System.out.print("Teller " + (i + 1) + ": ");

            if (tellers[i] == null) {
                System.out.println("Available");
            } else {
                System.out.println(tellers[i]);
            }
        }

        // Display the waiting queue.
        System.out.print("Waiting Queue: ");
        waitingQueue.display();

        System.out.println("---------------------------------");
    }
}
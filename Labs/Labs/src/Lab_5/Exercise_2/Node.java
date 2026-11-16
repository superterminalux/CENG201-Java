/**
 * Node.java
 * Your Name:        __________________
 * Your Student ID:  240446034
 * Your Date:        16.11.26
 */

package Lab_5.Exercise_2;

public class Node {

    String customerName;
    Node next;

    public Node(String customerName) {

        // Stores the customer's name.
        this.customerName = customerName;

        // Initializes the next pointer as null.
        this.next = null;
    }
}
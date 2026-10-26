/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Your Name:        _________________
 * Your Student ID:  240446034
 * Your Date:        12.10.26
 */

package Lab_2.Exercise_1;

public class SinglyLinkedList {

    // -------------------------------------------------------
    // Instance variable

    private Node head;

    // -------------------------------------------------------
    // Constructor

    public SinglyLinkedList() {
        head = null;
    }

    // -------------------------------------------------------
    // Add a node to the end of the list

    public void add(int data) {
        // TODO:
        // 1. Create a new Node.
        // 2. If the list is empty, make the new node the head.
        // 3. Otherwise, traverse to the last node.
        // 4. Link the last node to the new node.
    }

    // -------------------------------------------------------
    // Display the linked list

    public void display() {
        // TODO:
        // Start from head.
        // Visit each node using next.
        // Print the data values in this format:
        //
        // 1 --> 2 --> 3 --> 4 --> 5 --> NULL
    }

    // -------------------------------------------------------
    // Find the middle node

    public Node findMiddle() {
        // TODO:
        //
        // Find and return the middle node.
        // For an odd number of nodes:
        //     1 --> 2 --> 3 --> 4 --> 5
        //                 ^
        //              middle
        //
        // For an even number of nodes:
        //     10 --> 20 --> 30 --> 40 --> 50 --> 60
        //                          ^
        //                        middle
        // IMPORTANT:
        // For an even-sized list, return the SECOND
        // middle node.
        return ;
    }

    // -------------------------------------------------------
    // Get the head
    public Node getHead() {
        return head;
    }
}
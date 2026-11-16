/**
 * Queue.java
 * Your Name:        __________________
 * Your Student ID:  240446034
 * Your Date:        16.11.26
 */

package Lab_5.Exercise_2;

public class Queue {

    private Node front;
    private Node rear;
    private int size;

    public Queue() {

        // Initializes front and rear as null.
        front = null;
        rear = null;

        // Initializes size as 0.
        size = 0;
    }

    public void enqueue(String customerName) {

        // Creates a new Node using customerName.
        Node newNode = new Node(customerName);

        // Checks whether the queue is empty.
        if (isEmpty()) {
            front =newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        // Increases size.
        size++;
    }

    public String dequeue() {

        // Checks whether the queue is empty.
        //         If empty, returns null.
        if (isEmpty()) {
            return null;
        }

        // Stores the customer name at the front.
        String removedCustomer = front.customerName;

        // Moves front to the next node.
        front = front.next;

        // If front becomes null:
        //   - Set rear to null.
        if (front == null) {
            rear = null;
        }

        // Decreases size.
        size--;

        // Returns the removed customer's name.

        return removedCustomer;
    }

    public boolean isEmpty() {

        // Checks whether front is null.
        return front = null;
    }

    public int size() {

        // Returns the current size.
        return size;
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }

        Node current = front;

        while (current != null) {

            System.out.print(current.customerName);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println();
    }
}
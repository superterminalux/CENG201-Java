/**
 * TokenStack.java
 *
 * Your Name:        __________________
 * Your Student ID:  240446034
 * Your Date:        26.10.26
 */

package Lab_4.Exercise_2;

public class TokenStack {

    private class Node {
        // create the instant named data as a String type
        String data;

        // create the next pointer that will be used for the Stack implementation as a Node type[cite: 1]
        Node next;

        // complete the constructor accordingly[cite: 1]
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // create the top pointer that will be used for the Stack implementation as private[cite: 1]
    private Node top;

    public TokenStack() {
        // create the constructor of the TokenStack class that will assign the top pointer to null[cite: 1]
        top = null;
    }

    public void push(String value) {
        // TODO: Create a new node. Connect it to the current top. Update top.[cite: 1]
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        // TODO: Check whether the stack is empty. Store the top value. Move top to the next node. Return the stored value.[cite: 1]
        if (isEmpty()) {
            return null;
        }
        String poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public boolean isEmpty() {
        // TODO: Return whether the stack is empty.[cite: 1]
        return top == null;
    }
}
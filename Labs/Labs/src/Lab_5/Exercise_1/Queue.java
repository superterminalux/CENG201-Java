/**
 * Queue.java
 *
 * Your Name:        __________________
 * Your Student ID:  240446034
 * Your Date:        16.11.26
 */

package Lab_5.Exercise_1;

public class Queue<T> {

    private T[] items;
    private int front; // first element of the queue
    private int rear;  // last element of the queue
    private int count;

    @SuppressWarnings("unchecked")
    public Queue(int capacity) {
        items = (T[]) new Object[capacity];

        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(T value) {
        // Checks whether the queue is full.
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        // Calculates the next rear position.
        rear++;

        // Inserts the new element into the array.
        items[rear] = value;

        // Increases count.
        count++;
    }

    public T dequeue() {
        // Checks whether the queue is empty.
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }

        // Stores the element at the front position.
        T removedValue = items[front];

        // Moves front to the next position.
        front++;

        // Decreases count.
        count--;

        // Returns the removed element.
        return removedValue;
    }

    public T peek() {
        // Checks whether the queue is empty.
        if (isEmpty()) {
            return null;
        }

        // Returns the front element without removing it.
        return items[front];
    }

    public boolean isEmpty() {
        // Checks whether count is zero.
        return count == 0;
    }

    public boolean isFull() {
        // Checks whether count equals the array capacity.
        return count == items.length;
    }

    public int size() {
        // Returns the number of elements.
        return count;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < count; i++) {

            int index = front + i;

            result.append(items[index]);

            if (i < count - 1) {
                result.append(", ");
            }
        }

        result.append("]");

        return result.toString();
    }

}
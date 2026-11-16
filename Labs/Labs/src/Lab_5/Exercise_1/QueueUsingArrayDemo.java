/**
 * Your Name:        _________________
 * Your Student ID:  240446034
 * Your Date:        16.11.26
 */

package Lab_5.Exercise_1;

public class QueueUsingArrayDemo {

    public static void main(String[] args) {

        String[] students = {
                "Ali", "Ayse", "Mehmet", "Zeynep", "Ahmet",
                "Elif", "Mustafa", "Fatma", "Can", "Ece",
                "Burak", "Deniz", "Emre", "Selin", "Mert",
                "Ceren", "Kerem", "Dilan", "Onur", "Seda"
        };

        // Creates the Queue object with capacity 10.
        Queue<String> queue = new Queue<>(10);

        // Inserts the first 10 student names into the queue.
        // Uses a for loop.
        for (int i=0; i<10; i++) {
            queue.enqueue(students[i]);
        }

        // Displays the original queue.
        System.out.println("Original Queue: " + queue.toString());

        // Displays the queue size.
        System.out.println("Queue Size: " + queue.size());

        // Displays the first student using peek().
        System.out.println("First Student: " + queue.peek());
        System.out.println();

        // Removes three students using dequeue().
        // Display the name of each removed student.
        System.out.println("Removing three students: ");
        System.out.println("Removed: " + queue.dequeue());
        System.out.println("Removed: " + queue.dequeue());
        System.out.println("Removed: " + queue.dequeue());
        System.out.println();

        // Displays the remaining queue.
        System.out.println("Queue After Removal: " + queue.toString());

        // Displays the final queue size.
        System.out.println("Final Queue Size: " + queue.size());

        //QUESTION: if I want to add the student[11], (because I have dequeue 3 student so there is empty parts in the array)
        // Try the code bellow and give an answer to: why does it give an error? and what can you use to add the 11 student to the array?
        //queue.enqueue(students[11]);
        //System.out.println("Queue Size: " + queue.size());

        /*
        ANSWER:
         */
    }
}
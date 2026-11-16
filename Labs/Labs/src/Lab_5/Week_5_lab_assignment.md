# Lab 5: Queue

### Learning Objectives

## Exercise 1: Implement a Queue Using an Array of Student Names

**Problem Statement**: A course has 20 registered students. Their names are stored in a String array. Implement a queue using **an array** and perform the following operations:

1. Create a generic class named Queue<T>.
2. Implement the following attributes:
   - items: an array to store queue elements.
   - front: the index of the first element.
   - rear: the index of the last element.
   - count: the number of elements currently in the queue.
3. Implement the following methods:
    - enqueue(T value): Insert an element into the queue.
    - dequeue(): Remove and return the first element.
    - peek(): Return the first element without removing it.
    - isEmpty(): Check whether the queue is empty.
    - isFull(): Check whether the queue is full.
    - size(): Return the number of elements.
    - toString(): Display the queue elements.
4. In QueueDemo.java, insert the first 10 student names from the given array into your queue.
5. Display the queue, its size, and the first student.
6. Remove three students and display their names.
7. Display the remaining queue and its size.

Exercise1/
│
├── Queue.java
└── QueueUsingArrayDemo.java

---

**Starter Code**:

`Queue.java`:
```java
/**
 * Queue.java
 *
 * Your Name:        __________________
 * Your Student ID:  __________________
 * Your Date:        __________________
 */
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
        // Step 1 Check whether the queue is full.

        // Step 2: Calculate the next rear position.

        // Step 3: Insert the new element into the array.

        // Step 4: Increase count.
    }

    public T dequeue() {
        // TODO: Check whether the queue is empty.

        // TODO: Store the element at the front position.

        // TODO: Move front to the next position.

        // TODO: Decrease count.

        // TODO: Return the removed element.
        return ;
    }

    public T peek() {
        // TODO: Check whether the queue is empty.

        // TODO: Return the front element without removing it.
        return null;
    }

    public boolean isEmpty() {
        // TODO: Check whether count is zero.
        return false;
    }

    public boolean isFull() {
        // TODO: Check whether count equals the array capacity.
        return false;
    }

    public int size() {
        // TODO: Return the number of elements.
        return ;
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


```

`QueueUsingArrayDemo.java`:

```java
/**
 * Your Name:        _________________
 * Your Student ID:  _________________
 * Your Date:        _________________
 */

public class QueueDemo {

    public static void main(String[] args) {

        String[] students = {
            "Ali", "Ayse", "Mehmet", "Zeynep", "Ahmet",
            "Elif", "Mustafa", "Fatma", "Can", "Ece",
            "Burak", "Deniz", "Emre", "Selin", "Mert",
            "Ceren", "Kerem", "Dilan", "Onur", "Seda"
        };

        // TODO: Create your Queue object with capacity 10.


        // TODO: Insert the first 10 student names into the queue.
        // Use a for loop.


        // TODO: Display the original queue.


        // TODO: Display the queue size.


        // TODO: Display the first student using peek().


        // TODO: Remove three students using dequeue().
        // Display the name of each removed student.


        // TODO: Display the remaining queue.


        // TODO: Display the final queue size.

        //QUESTION: if I want to add the student[11], (because I have dequeue 3 student so there is empty parts in the array)
        // Try the code bellow and give an answer to: why does it give an error? and what can you use to add the 11 student to the array?
        //queue.enqueue(students[11]);
        //System.out.println("Queue Size: " + queue.size());
    }
}

```
**Expected Output**:
```
Original Queue: [Ali, Ayse, Mehmet, Zeynep, Ahmet, Elif, Mustafa, Fatma, Can, Ece]
Queue Size: 10
First Student: Ali

Removing three students:
Removed: Ali
Removed: Ayse
Removed: Mehmet

Queue After Removal: [Zeynep, Ahmet, Elif, Mustafa, Fatma, Can, Ece]
Final Queue Size: 7

```

**Hints**:
 - enqueue(T value): Insert an element into the queue at the end(after rear). Check if the array is FULL // rear++; // ArrayName[rear] = value; // count++;
 - dequeue(): Remove and return the first element (front). Check the queue if it is empty // T removedValue = ArrayName[front];// ArrayName[front] = null;// front++ //count--; // return removedValue;
 

---

## Exercise 2: Bank Waiting Line Simulation using a Queue implemented with a Singly Linked List.

**Problem Statement**: Develop a Java program that simulates a bank's customer service system. The bank has three tellers who serve customers.

Customers arrive at the bank and follow these rules:
1. If at least one teller is available, the arriving customer goes directly to that teller.
2. If all three tellers are busy, the customer must wait in a queue.
3. Customers must be served in FIFO order (First In, First Out).
4. When a teller finishes serving a customer, that teller becomes available.
5. If there are customers waiting, the customer at the front of the queue immediately moves to the newly available teller.
6. If the waiting queue is empty, the teller remains available.

Exercise2/
│── Node.java - Represents a customer in the linked list.
├── Queue.java - Implements the waiting queue using a Singly Linked List.
├── Bank.java - Manages the three tellers and assigns customers
├── BankDemo.java - Simulates customer arrivals and completed transactions.

---

**Starter Code**:

`Node.java`:
```java
/**
 * Node.java
 * Your Name:        __________________
 * Your Student ID:  __________________
 * Your Date:        __________________
 */

public class Node {

    String customerName;
    Node next;

    public Node(String customerName) {

        // Step 1: Store the customer's name.

        // Step 2: Initialize the next pointer as null.
    }
}

```

`Queue.java`:
```java
/**
 * Queue.java
 * Your Name:        __________________
 * Your Student ID:  __________________
 * Your Date:        __________________
 */

public class Queue {

    private Node front;
    private Node rear;
    private int size;

    public Queue() {

        // Step 1: Initialize front and rear as null.

        // Step 2: Initialize size as 0.
    }

    public void enqueue(String customerName) {

        // Step 1: Create a new Node using customerName.

        // Step 2: Check whether the queue is empty.

        // Step 3: If the queue is empty:
        //         - Set front to the new node.
        //         - Set rear to the new node.

        // Step 4: Otherwise:
        //         - Connect the current rear node to the new node.
        //         - Update rear to the new node.

        // Step 5: Increase size.
    }

    public String dequeue() {

        // Step 1: Check whether the queue is empty.
        //         If empty, return null.

        // Step 2: Store the customer name at the front.

        // Step 3: Move front to the next node.

        // Step 4: If front becomes null:
        //         - Set rear to null.

        // Step 5: Decrease size.

        // Step 6: Return the removed customer's name.

        return null;
    }

    public boolean isEmpty() {

        // Step 1: Check whether front is null.

        return true;
    }

    public int size() {

        // Step 1: Return the current size.

        return 0;
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

```

`Bank.java`:

```java
/**
 * Your Name:        _________________
 * Your Student ID:  _________________
 * Your Date:        _________________
 * 
 * The Bank class manages three tellers and one waiting queue.

    We will use a String array to represent the three teller positions:
        - tellers[0] represents Teller 1.
        - tellers[1] represents Teller 2.
        - tellers[2] represents Teller 3.
        - null means that the teller is available.
 */

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

```

`BankDemo.java`:
```java
/**
 * BankDemo.java
 * Your Name:        __________________
 * Your Student ID:  __________________
 * Your Date:        __________________
 */

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

```

---

**Expected Output**:

```
Customer Ali arrived.
Ali is assigned to Teller 1.

Customer Ayse arrived.
Ayse is assigned to Teller 2.

Customer Mehmet arrived.
Mehmet is assigned to Teller 3.

Customer Zeynep arrived.
All tellers are busy.
Zeynep joins the waiting queue.

Customer Can arrived.
All tellers are busy.
Can joins the waiting queue.

---------- BANK STATUS ----------
Teller 1: Ali
Teller 2: Ayse
Teller 3: Mehmet
Waiting Queue: Zeynep -> Can
---------------------------------

Teller 2 completed Ayse's transaction.
Zeynep is assigned to Teller 2.

---------- BANK STATUS ----------
Teller 1: Ali
Teller 2: Zeynep
Teller 3: Mehmet
Waiting Queue: Can
---------------------------------

Teller 1 completed Ali's transaction.
Can is assigned to Teller 1.

---------- BANK STATUS ----------
Teller 1: Can
Teller 2: Zeynep
Teller 3: Mehmet
Waiting Queue: Empty
---------------------------------

```
---



---


## Exercise 3: Recognizing Palindromes Using a Stack and a Queue

**Problem Statement**: You will implement their own Stack and Queue classes using arrays and use them together to recognize whether a given string is a palindrome.

A palindrome is a string that reads the same from left to right and right to left.

Ex: RADAR --> PALINDROME
    LEVEL --> PALINDROME
    HELLO --> NOT PALINDROME

- Do not use Java's built-in Stack, Queue, or LinkedList classes.
- Implement all required methods from scratch.
- Use char[] arrays to store characters.
- Compare characters removed from the stack and queue

Algorithm:
1. Read a string from the user.
2. Create a Stack and a Queue with sufficient capacity.
3. Traverse the input string from left to right.
4. Insert each character into both the stack and the queue.
5. Compare the character removed from the stack (pop) with the character removed from the queue (dequeue).
6. If all characters match, the string is a palindrome.
7. If any characters do not match, the string is not a palindrome.

Exercise2/
│
├── Stack.java
└── Queue.java
└── PalindromeDemo.java

---

**Starter Code**:

`Stack.java`:
```java
/**
 * Stack.java
 *
 * Your Name:        __________________
 * Your Student ID:  __________________
 * Your Date:        __________________
 */

public class Stack {

    private char[] items;
    private int top;

    public Stack(int capacity) {
        items = new char[capacity];

        // Initialize top to indicate an empty stack.
        top = -1;
    }

    public void push(char value) {

        // Step 1: Check whether the stack is full.

        // Step 2: Increase top.

        // Step 3: Insert the character at the top position.

    }

    public char pop() {

        // Step 1: Check whether the stack is empty.

        // Step 2: Store the character at the top position.

        // Step 3: Decrease top.

        // Step 4: Return the removed character.
        return '\0';
    }

    public char peek() {

        // Check whether the stack is empty.

        // Return the character at the top without removing it.
        return '\0';
    }

    public boolean isEmpty() {

        // Return true if the stack is empty.
        return false;
    }

    public boolean isFull() {

        // Return true if the stack is full.
        return false;
    }
}

```

`Queue.java`:

```java
/**
 * Your Name:        _________________
 * Your Student ID:  _________________
 * Your Date:        _________________
 */

public class Queue {

    private char[] items;
    private int front;
    private int rear;
    private int count;

    public Queue(int capacity) {

        items = new char[capacity];

        // Initialize front, rear, and count.
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(char value) {

        // Step 1: Check whether the queue is full.

        // Step 2: Calculate the next rear position
        // using circular indexing.

        // Step 3: Insert the character into the array.

        // Step 4: Increase count.

    }

    public char dequeue() {

        // Step 1: Check whether the queue is empty.

        // Step 2: Store the character at the front position.

        // Step 3: Move front to the next position
        // using circular indexing.

        // Step 4: Decrease count.

        // Step 5: Return the removed character.
        return '\0';
    }

    public char peek() {

        // Check whether the queue is empty.

        // Return the front character without removing it.
        return '\0';
    }

    public boolean isEmpty() {

        // Return true if the queue is empty.
        return false;
    }

    public boolean isFull() {

        // Return true if the queue is full.
        return false;
    }

    public int size() {

        // Return the number of elements in the queue.
        return 0;
    }
}

```
`PalindromeDemo.java`:
```java
/**
 * PalindromeDemo.java
 *
 * Your Name:        __________________
 * Your Student ID:  __________________
 * Your Date:        __________________
 */

import java.util.Scanner;

public class PalindromeDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Step 1: Ask the user to enter a string.
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Step 2: Create a Stack and a Queue.
        // Use the length of the input string as capacity.


        // Step 3: Traverse the string from left to right.


            // Get the character at the current index.


            // Insert the character into the stack.


            // Insert the same character into the queue.


        // Step 4: Assume the string is a palindrome.
        boolean isPalindrome = true;

        // Step 5: Compare characters while the queue is not empty.


            // Remove one character from the stack.


            // Remove one character from the queue.


            // Compare the two characters.
            // If they are different, update isPalindrome.
            // Stop comparing if a mismatch is found.


        // Step 6: Display whether the string is a palindrome.


        input.close();
    }
}

```

**Expected Output**:
```
Enter a string: HELLO
"HELLO" is not a palindrome.
---------------------------------
Enter a string: RADAR
"RADAR" is a palindrome.


```
---

**Hints**:
 - Each character must be inserted into both stack and queue: stack.push(ch); // queue.enqueue(ch);
 - Use a while loop to compare characters until the queue becomes empty or a mismatch is found.
 - While comparing characters, use both Stack and Queue character: char stackChar = stack.pop(); // char queueChar = queue.dequeue();
---

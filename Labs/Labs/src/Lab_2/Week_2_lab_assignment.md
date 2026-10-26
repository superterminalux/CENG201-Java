# Lab 2: Single Linked List

### Directory Structure

## Exercise 1: Found Middle Node in a Singly Linked List

**Problem Statement**: Given the head of singly linked list, find the middle node of the linked list.
    - If the number of nodes is odd, return the middle node.
    - If the number of nodes is even, there are two middle nodes, so return the second middle node.

Exercise1/
│
├── Node.java
├── SinglyLinkedList.java
└── MiddleNodeDemo.java

---

**Starter Code**:

`Node.java`:
```java
/**
 * Node.java
 *
 * Represents one node in a singly linked list.
 *
 * Your Name:        ___________________
 * Your Date:        ___________________
 */

public class Node {

    // Instance variables

    int data;
    Node next;

    // -------------------------------------------------------
    // Constructor

    public Node(int data) {
        // TODO: Initialize data
        // TODO: Set next to null
    }
}

```

`SinglyLinkedList.java`:

```java
/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Your Name:        _________________
 * Your Student ID:  _________________
 * Your Date:        _________________
 */

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

```
`MiddleNodeDemo.java`:

```java
/**
 * MiddleNodeDemo.java
 *
 * Tests the singly linked list and findMiddle() method.
 *
 * Name:        ___________________
 * Student ID:  ___________________
 * Date:        ___________________
 */

public class MiddleNodeDemo {

    public static void main(String[] args) {

        System.out.println();
        System.out.println();

        // -------------------------------------------------------
        // Test 1: Odd number of nodes
        // TODO: 
        // 1. Created a singlyLİnkedList
        // 2. Add 1,2,3,4,5 Nodes to the list
        // 3. Display the list
        // 4. Found and print the middle Node
        

        System.out.println("List 1:");



        System.out.println("Middle Node: " + );
        System.out.println();

        // -------------------------------------------------------
        // Test 2: Even number of nodes
        // TODO: 
        // 1. Created another singlyLİnkedList
        // 2. Add 10,20,30,40,50,60 Nodes to the list
        // 3. Display the list
        // 4. Found and print the middle Node


        System.out.println("List 2:");

        System.out.println("Middle Node: " + );
        System.out.println();
    }
}
```
---

**Expected Output**:

```
=== Find Middle Node Demo ===

List 1:
1 --> 2 --> 3 --> 4 --> 5 --> NULL
Middle Node: 3

List 2:
10 --> 20 --> 30 --> 40 --> 50 --> 60 --> NULL
Middle Node: 40

```
---

**Hints**:
 - To find the middle node, first count the total number of nodes in the linked list.
 - After finding the count, divide it by 2.(Example: 5 / 2 = 2  ; 6 / 2 = 3)
 - Remember that linked list indexing starts from 0. Therefore:
 - For an odd number of nodes, count / 2 gives the middle node.
 - For an even number of nodes, count / 2 gives the second middle node, as required.
 - After calculating the middle index, traverse the linked list again until you reach that index.

---


## Exercise 2: Delete Middle Node of a Singly Linked List

**Problem Statement**: Given a singly linked list, delete the middle node of the list.

  - If the list contains an odd number of nodes, delete the middle node.
  - If the list contains an even number of nodes, there are two middle nodes. Delete the second middle node.
  - If the linked list contains only one node, delete that node and the list becomes empty.

Exercise2/
│
├── Node.java (Can use the one created in exerice 1)
├── SinglyLinkedList.java (Can use the one created in exerice 1 and add the deleteMiddle method)
└── DeleteMiddleDemo.java

---

**Starter Code**:

`SinglyLinkedList.java`:

```java
/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Your Name:        ______________________________
 * Your Student ID:  ______________________________
 * Your Date:        ______________________________
 */

public class SinglyLinkedList {

    // Instance variable

    private Node head;

    // Constructor
    public SinglyLinkedList() {
        
    }
    // use it from Exercise 1
    // Add a node to the end of the list
    public void add(int data) {

        // TODO:
        // 1. Create a new Node.
        // 2. If the list is empty, make the new node the head.
        // 3. Otherwise, traverse to the last node.
        // 4. Link the last node to the new node.
    }
    
    // use it from Exercise 1
    // Display the linked list
    public void display() {

        // TODO:
        // Start from head.
        // Visit each node using next.
        // Print:
        //
        // 1 --> 2 --> 3 --> NULL
    }

    // -------------------------------------------------------
    // Delete the middle node
    public void deleteMiddle() {

        // TODO:
        // Step 1: Count the total number of nodes.
        // Step 2: Find the node before the middle node.
        //         Then change its next reference so that
        //         the middle node is removed from the list.
        //
        // Remember:
        // - For an odd number of nodes, delete the middle.
        // - For an even number of nodes, delete the SECOND middle.
        // - If there is only one node, the list becomes empty.
    }

    // Get the head
    public Node getHead() {
        return head;
    }
}

```
`DeleteMiddleDemo.java`:

```java
/**
 * DeleteMiddleDemo.java
 *
 * Tests deleting the middle node of a singly linked list.
 *
 * Name:        ______________________________
 * Student ID:  ______________________________
 * Date:        ______________________________
 */

public class DeleteMiddleDemo {

    public static void main(String[] args) {

        System.out.println("=== Delete Middle Node Demo ===");
        System.out.println();

        // Test 1: Odd number of nodes
        // TODO: 
        // 1. Created a singlyLinkedList
        // 2. Add 1,2,3,4,5 Nodes to the list
        // 3. Display the list
        // 4. Delete the Middle Node
        // 5. Display the list after deleting
        

        System.out.println("Original List 1:");


        System.out.println("After deleting middle:");


        System.out.println();

        // -------------------------------------------------------
        // Test 2: Even number of nodes
        // TODO: 
        // 1. Created another singlyLİnkedList
        // 2. Add 10,20,30,40,50,60 Nodes to the list
        // 3. Display the list
        // 4. Delete the Middle Node
        // 5. Display the list after deleting

        System.out.println("Original List 2:");


        System.out.println("After deleting middle:");


        System.out.println();

        // Test 3: One node
        // TODO: 
        // 1. Created another singlyLİnkedList
        // 2. Add just 999 to the list
        // 3. Display the list
        // 4. Delete the Middle Node (because it has just one node, you just have to delete the head)
        // 5. Display the list after deleting


        System.out.println("Original List 3:");


        System.out.println("After deleting middle:");


    }
}
```
---

**Expected Output**:

```
=== Delete Middle Node Demo ===

Original List 1:
1 --> 2 --> 3 --> 4 --> 5 --> NULL
After deleting middle:
1 --> 2 --> 4 --> 5 --> NULL

Original List 2:
10 --> 20 --> 30 --> 40 --> 50 --> 60 --> NULL
After deleting middle:
10 --> 20 --> 30 --> 50 --> 60 --> NULL

Original List 3:
999 --> NULL
After deleting middle:
NULL

```
---

**Hints**:
 - To found the midle Node, you have to get the count of Nodes inside the list. 
 - After founding the count, you have to divide it by 2. (Ex: 5/2=2 // 6/2=3) 
 - To delete a node in a singly linked list, you need access to the node before it.
 - Once you reach the previous node, change its next reference so that it skips the middle node.
 - Be careful with the one-node case. If there is only one node, there is no previous node; simply make head equal to null.

---
# Lab 4: Stack

### Learning Objectives

## Exercise 1: Parenthesis Checker

**Problem Statement**: Given a string s, composed of different combinations of '(' , ')', '{', '}', '[', ']'. Determine whether the Expression is balanced or not.

An expression is balanced if:
1. Each opening bracket has a corresponding closing bracket of the same type.
2. Opening brackets must be closed in the correct order.

Exercise1/
│
├── BracketStack.java
├── BalancedBrackets.java
└── BracketBalancedDemo.java

---

**Starter Code**:

`BracketStack.java`:
```java
/**
 * BracketStack.java
 *
 * Your Name:        __________________
 * Your Student ID:  __________________
 * Your Date:        __________________
 */

public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null;
    }

    // TODO 1: Add an element to the top of the stack
    public void push(char value) {
        // connect newNode to the current top
        // update top
        
    }

    //  TODO 2: Remove and return the top element
    public char pop() {
        
        return '';
        // After saving top.data, the new top should be the node that comes after the current top.  
    }

    //  TODO 3: Return the top element without removing it
    public char peek() {
        // Control if the stack is empty; if it is, then return null
        // if not return the data of the top
        return '';
    }

    //  TODO 4: Check whether the stack is empty
    public boolean isEmpty() {
        // TODO
        return false;
    }
}

```

`BalancedBrackets.java`:

```java
/**
 * Your Name:        _________________
 * Your Student ID:  _________________
 * Your Date:        _________________
 */

public class BalancedBrackets {

    public static boolean isBalanced(String s) {

        // Create a stack
        BracketStack stack = new BracketStack();

        // TODO:
        // 1. Traverse the string character by character.
        // 2. If the character is an opening bracket,
        //    push it onto the stack.
        // 3. If it is a closing bracket:
        //      - Check whether the stack is empty.
        //      - Pop the top opening bracket.
        //      - Check whether the brackets match.(call isMatchingPair method)
        // 4. At the end, check whether the stack is empty.

        return false/true;
    }

    private static boolean isMatchingPair(char opening, char closing) {

        // Check: ( matches )

        // Check: [ matches ]

        // Check: { matches }

        // if check doesnt match; then return false

        return false;
    }
}

```
`BracketBalancedDemo.java`:

```java
/**
 * BracketBalancedDemo.java
 */
public class BracketBalancedDemo {

    public static void main(String[] args) {

        String[] expressions = {
                "[{()}]",
                "[()()]{}",
                "([]",
                "([{]})",
                "abc{defg(ijk)l[mn]op}qr",
                "a(bc)def]"
        };

        for (String expression : expressions) {

            boolean result = BalancedBrackets.isBalanced(expression);

            System.out.println(expression + " -> " + result);
        }
    }
}
```
---

**Expected Output**:

```
========== BALANCED BRACKET TEST ==========
Input: [{()}] -> Output: true
Input: [()()]{} -> Output: true
Input: ([] -> Output: false
Input: ([{]}) -> Output: false
Input: abc{defg(ijk)l[mn]op}qr -> Output: true
Input: a(bc)def] -> Output: false

```
---

**Hints**:
 - Add an element to the top: newNode.next = top; // top = newNode;
 - Remove and return the top element: After saving top.data, the new top should be the node that comes after the current top.
 - peek: Control if the stack is empty; if it is, then return null // if not, return the data of the top.
 

---

## Exercise 2: REVERSING EQUATION

**Problem Statement**: Given a mathematical equation that contains only numbers and +, -, *, /. 
                       Print the equation in reverse, such that the equation is reversed, but the numbers remain the same.
                       It is guaranteed that the given equation is valid, and there are no leading zeros.

Exercise2/
│
├── TokenStack.java
├── EquationReverser.java
└── ReverseEquationDemo.java

---

**Starter Code**:

`TokenStack.java`:
```java
/**
 * TokenStack.java
 *
 * Your Name:        __________________
 * Your Student ID:  __________________
 * Your Date:        __________________
 */

public class TokenStack {

    private class Node {
        // create the instant named data as a String type

        // create the next pointer that will be used for the Stack implementation as a Node type
        
        // cpmplete the constructor accordinally
        Node(String data) {
            
        }
    }

    // create the top pointer that will be used for the Stack implementation as private

    
    public TokenStack() {
        // create the constructor of the TokenStack class that will assigned the top pointer to null
        
    }

    public void push(String value) {
        // TODO: Create a new node.
        //       Connect it to the current top.
        //       Update top.
    }

    public String pop() {
        // TODO: Check whether the stack is empty.
        //       Store the top value.
        //       Move top to the next node.
        //       Return the stored value.
        return ;
    }

    public boolean isEmpty() {
        // TODO: Return whether the stack is empty.
        return ;
    }
}
```

`EquationReverser.java`:

```java
/**
 * EquationReverser.java
 * Your Name:        _________________
 * Your Student ID:  _________________
 * Your Date:        _________________
 */

public class EquationReverser {

    public static String reverseEquation(String equation) { // why the method is static?
        // create the object of the TokenStack class
        

        int i = 0;

        // TODO 1: Traverse the equation from left to right.
        // Push numbers and operators onto the stack.

        // TODO 2: If the current character is a digit,
        //         Remember the beginning of the number and Move forward until the number ends.
        // Push the whole number as one item.

        // TODO 3: Otherwise, push the operator.

        // TODO 4: Pop all items from the stack and append
        //         them to a StringBuilder. (Pop items to construct the reversed equation.)
        //String Builder= new StringBuilder() creates an empty builder. Each append() adds a character to it.

        return "";
    }
}
```
`ReverseEquationDemo.java`:

```java
/**
 * ReverseEquationDemo.java
 */

public class ReverseEquationDemo {

    public static void main(String[] args) {

        String[] equations = {
            "20-3+5*2",
            "123+45*6",
            "100/25-7"
        };

        //Print the input and output like in the expected output
    }
}
```

---

**Expected Output**:

```
Input:  20-3+5*2
Output: 2*5+3-20

Input:  5+2*56-2/4
Output: 4/2-56*2+5

Input:  123+45*6
Output: 6*45+123

Input:  100/25-7
Output: 7-25/100
```
---

**Hints**:
 - Check whether the current character is a digit. (Use Character.isDigit(current) method)
 - Remember where the number starts( int start = i)
 - Move forward while the characters are digits (i++)
 - Extract the entire number and push it (Use substring(start, i) method)
 - Push the operator(Use String.valueOf(current))
 - Get the result wile using a StringBuilter (StringBuilder result = new StringBuilder()). StringBuilder is generally more efficient when repeatedly adding many pieces to a string.
 

---

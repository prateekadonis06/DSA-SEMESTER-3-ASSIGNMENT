/** Stack implementation using a Singly Linked List (LIFO). */
public class Stack {
    private Node top;   // points to the top element of the stack
    private int count;  // tracks total elements in the stack

    public Stack() {
        this.top = null;
        this.count = 0;
    }

    /** Insert an element at the top of the Stack. */
    public void push(int data) {
        push(data, true);
    }

    /** Helper push with optional console logging for challenge methods. */
    public void push(int data, boolean verbose) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        count++;
        if (verbose) {
            System.out.println(data + " inserted");
        }
    }

    /** Remove and return the top element. Displays "Stack Underflow" if empty. */
    public int pop() {
        return pop(true);
    }

    /** Helper pop with optional console logging for challenge methods. */
    public int pop(boolean verbose) {
        if (isEmpty()) {
            if (verbose) {
                System.out.println("Stack Underflow");
            }
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        count--;
        if (verbose) {
            System.out.println(poppedValue + " removed");
        }
        return poppedValue;
    }

    /** Return the top element without removing it. */
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return top.data;
    }

    /** Check whether the Stack is empty. */
    public boolean isEmpty() {
        return top == null;
    }

    /** Return the total number of elements in the Stack. */
    public int size() {
        return count;
    }

    /** Display all elements from top to bottom. */
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" → ");
            }
            current = current.next;
        }
        System.out.println();
    }

    /** Challenge 4: Find the middle element of the Stack using slow & fast pointers. */
    public int findMiddle() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        Node slow = top;
        Node fast = top;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}

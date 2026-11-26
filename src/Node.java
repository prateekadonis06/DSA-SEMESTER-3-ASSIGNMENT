/** A single node of the singly linked list. */
public class Node {
    int data;     // value stored in the node
    Node next;    // reference to the next node (below it in the stack)

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
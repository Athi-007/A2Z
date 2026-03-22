package linkedlist.doubleLinkedList;
import java.util.Stack;
class Node {
        public int data;
        public Node next;
        public Node back;

        public Node(int data1, Node next1, Node back1) {
            data = data1;
            next = next1;
            back = back1;
        }
        public Node(int data1) {
            data = data1;
            next = null;
            back = null;
        }
}
public class reversethedll {
    private static Node convertArr2DLL(int[] arr) {
        // Create the head node with the
        // first element of the array
        Node head = new Node(arr[0]);
        // Initialize 'prev' to the head node
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            // Create a new node with data from
            // the array and set its 'back' pointer
            // to the previous node

            Node temp = new Node(arr[i], null, prev);
            // Update the 'next' pointer of the
            // previous node to point to the new node

            prev.next = temp;
            // Move 'prev' to the newly created node
            // for the next iteration
            prev = temp;
        }
        // Return the head of the doubly linked list
        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            // Print the data in the current node
            System.out.print(head.data + " ");
            // Move to the next node
            head = head.next;
        }
        System.out.println();
    }

    public static Node reverseDLL(Node head) { // Initialise a stack st
        Stack<Integer> st = new Stack<>();

        // Initialise the node pointer temp at head
        Node temp = head;

        // Traverse the doubly linked list via the temp pointer
        while (temp != null) {
            // insert the data of the current node into the stack
            st.push(temp.data);
            // traverse further
            temp = temp.next;
        }

        // Reinitialise temp to head
        temp = head;

        // Second iteration of the DLL to replace the values
        while (temp != null) {
            // Replace the value pointed via temp with
            // the value from the top of the stack and pop it
            temp.data = st.pop();

            // Traverse further
            temp = temp.next;
        }

        // Return the updated doubly linked
        // where the values of nodes from both ends
        // has been swapped
        return head;

    }

     private static Node reversedll(Node head) {
        // Check if the list is empty
        // or has only one node
        if (head == null || head.next == null) {
            // No change is needed;
            // return the current head
            return head; 
        }
        
         // Initialize a pointer to
         // the previous node        
        Node prev = null;
        
        // Initialize a pointer to
        // the current node
        Node current = head;
        
        // Traverse the linked list
        while (current != null) {
            
            // Store a reference to
            // the previous node
            prev = current.back;
            
            // Swap the previous and
            // next pointers
            current.back = current.next;
            
            // This step reverses the links
            current.next = prev;
            
            // Move to the next node
            // in the orignal list
            
            current = current.back;
        }

        // The final node in the original list
        // becomes the new head after reversal
        return prev.back;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 5, 6, 8, 4 };
        // Convert the array to a doubly linked list
        Node head = convertArr2DLL(arr);

        // Print the doubly linked list
        System.out.println("Doubly Linked List Initially:  ");
        print(head);

        System.out.println("Doubly Linked List After Reversing :");

        head = reverseDLL(head);
        print(head);

        System.out.println("Doubly Linked List After Reversing(optimal approach) :"); // swap of two variable approach
        head = reversedll(head);
        print(head);

    }
}

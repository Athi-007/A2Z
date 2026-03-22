package linkedlist.doubleLinkedList;
class Node {
    int data;
    Node next, back;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }

    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }
}
public class deletetheNode {

    public static void deletethenode(Node temp) {
        Node prev = temp.back;
        Node front = temp.next;

        if (front == null) {
            prev.next = null;
            temp.back = null;
        }

        prev.next = front;
        front.back = prev;
        temp.next = null;
        temp.back = null;

    }
    public static Node insertatEnd(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 12, 10, 16, 14 };
        Node head = insertatEnd(arr);
        deletethenode(head.next); // expext the node head of the node
        print(head);
    }
}

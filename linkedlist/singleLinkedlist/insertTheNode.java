 package linkedlist.singleLinkedlist;
import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node (int data1 , Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node (int data1) {
        this.data = data1;
        this.next = null;
    }
}
public class insertTheNode {

    public static Node insertAtHead (int data , Node head) {
        Node temp = new Node (data , head);
        return temp;
    }

    public static void printLL (Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = {12,13,14,15};
        Node head = new Node(arr[0]);
        head.next = new Node (arr[1]);
        head.next.next = new Node (arr[2]);
        head.next.next.next = new Node (arr[3]);

        int val = obj.nextInt();
        head = insertAtHead(val,head);
        printLL (head);
        obj.close();
    }
}

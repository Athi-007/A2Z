package linkedlist.doubleLinkedList;

import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node back;

    Node (int data1 , Node next1 , Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node (int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
public class arraytodll {
    public static Node insertatEnd (int[] arr) {
        Node head = new Node (arr[0]);
        Node prev = head;
        
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node (arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
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
        Node head = insertatEnd(arr);
        printLL (head);
        obj.close();
    }
}

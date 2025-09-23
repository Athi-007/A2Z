package linkedlist.singleLinkedlist;

import java.util.Scanner;
// leetcode https://leetcode.com/problems/reverse-linked-list/
class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class reversethesll {

    public static Node insertatEnd(int data, Node head) {
        Node temp = new Node(data);
        if (head == null) {
            return temp;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node reverseList(Node head) {
        Node last = null, current = head;
        while (current != null) {
            Node temp = current.next;
            current.next = last;
            last = current;
            current = temp;
        }
        return last;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = {12,13,14,15};
        Node head = new Node(arr[0]);
        head.next = new Node (arr[1]);
        head.next.next = new Node (arr[2]);
        head.next.next.next = new Node (arr[3]);

        int val = obj.nextInt();
        head = insertatEnd(val,head);
        printLL (head);
        System.out.println("Linked list after reversed");
        head = reverseList(head);
        printLL(head);
        obj.close();
    }
}

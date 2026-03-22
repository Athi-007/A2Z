package linkedlist.doubleLinkedList;
import java.util.Scanner;
/*
 * edge case delete head && k == n or tail && siglenodeletion
 */
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

public class deletetheKth {
    public static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;

        return head;
    }

    public static Node deletetail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node prev = temp.back;
        temp.back = null;
        prev.next = null;
        return head;
    }

    public static Node deleteKth(Node head, int k) {
        if (head == null) {
            return null;
        }

        Node kNode = head;
        int cnt = 0;
        while (kNode!= null) {
            cnt++;
            if (cnt == k) break;
            kNode = kNode.next;
        }

        Node prev = kNode.back;
        Node front = kNode.next;

        if (prev == null && front == null) {
            return null;
        } /* check the there is single node in single node the prev and front are null */

        else if (prev == null) {
            return deleteHead(head);
        }/* check the prev is null for delete the head because if we want to delete the head the prev only null front are still there */

        else if (front == null) {
            return deletetail(head);
        }// for delete the tail the front is null aftet the kNode

        else {// other node that have prev and front
            prev.next = front;
            front.back = prev;
            kNode.next = null;
            kNode.back = null;
        }
        return head;

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
        Scanner obj = new Scanner(System.in);
        int[] arr = { 12, 10, 16, 14 };
        Node head = insertatEnd(arr);
        System.out.println("Enter the position");
        int k = obj.nextInt();// delete the 3rd node (16)
        head = deleteKth(head, k);
        print(head);
        obj.close();
    }
}

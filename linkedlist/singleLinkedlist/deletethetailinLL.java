package linkedlist.singleLinkedlist;

import linkedlist.singleLinkedlist.Node;

class Node {
     int data;
     Node next;

     Node (int data1) {
        this.data = data1;
        this.next = null;
     }
}

public class deletethetailinLL {
  public static Node deletethetail(Node head) {
    if (head == null || head.next == null) {
        return head;
    }
    Node temp = head;
    while(temp.next.next!= null) {
        temp = temp.next;
    }
    temp.next = null;
    return head;
  }  

  public static void printLL (Node head) {
    while (head!= null) {
        System.out.println(head.data);
        head = head.next;
    }
  }
  public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);

        head = deletethetail(head);
        // Print the modified linked list
        printLL(head);
  }  
}

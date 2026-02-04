package linkedlist.leetcode;

import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.HashMap;

public class detecttheloop {
    // brute force time complecity O(N * 2 * log(N) )
    // space O(N)
    public static boolean detecthecycle (Node head) {
        HashMap<Node, Integer> mapp = new HashMap<Node, Integer>();
        Node temp = head;
        while (temp!=null) {
            if (mapp.containsKey(temp)) {
                return true;
            }
            mapp.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }
    // optimal approach
    public static boolean detecthecycle1 (Node head) {
        Node slow = head; 
        Node fast = head;
        while (fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
     
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;

        // Check if there is a loop
        // in the linked list
        if (detecthecycle(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
        if (detecthecycle1(head)) {
            System.out.println("Loop detected(usingtortisehare algo)in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
}

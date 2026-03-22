package linkedlist.leetcode;

/*
 * leetcode https://leetcode.com/problems/middle-of-the-linked-list/
 * first find the lenght of the linked list using cnt varable 
 * then move the temp node at the mid of the ll using the (cnt/2) + 1
 * optimal approach 
 * using tortoiseHare algorithm
 * in this algo we move the two pointers slow and fast move the slow by one and fast by two at the end slow reach the middle 
 * and fast reach the end for odd and for even fast reach the null 
 */
class Node {
    int data; 
    Node next;     
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class miidleofll {
    static Node findMiddle(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int mid = count / 2;  // Only count / 2 — no +1 needed
        temp = head;
        while (mid-- > 0) {
            temp = temp.next;
        }

        return temp;
    }

    static Node findMid (Node head) {
        Node slow = head; 
        Node fast = head;   
        while (fast != null && fast.next != null && slow != null) {
            fast = fast.next.next;  
            slow = slow.next;        
        }
        return slow;  
    }
    
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        Node middleNode = findMiddle(head);
        System.out.println("The middle node value is: " + middleNode.data);
        Node middle = findMid(head);
        System.out.println("The middle node value(using tortisHare algo) is: " + middle.data);
    }
}
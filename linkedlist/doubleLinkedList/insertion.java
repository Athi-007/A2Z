package linkedlist.doubleLinkedList;
import java.util.Scanner;
// insert before head 
// insert the end
// insert at given position
class Node {
    int data;
    Node next;
    Node back;

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }

    Node(int data2, Node next2, Node back2) {
        this.data = data2;
        this.next = next2;
        this.back = back2;
    }

}

public class insertion {

    public static Node insertbeforehead(int val, Node head) {
        Node newnode = new Node(val, head, null);
        head.back = newnode;
        return newnode;
    }

    public static Node insertbeforekthelNode (int k , int val , Node head) {
        if (k == 1) {
            return insertbeforehead(val, head);
        }
        Node temp = head;
        int cnt = 0;
        while (temp!= null) {
            cnt++;
            if (cnt == k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newnode = new Node (val,temp,prev);
        temp.back = newnode;
        prev.next = newnode;
        
        return head;
    }


    public static Node insertbeforetail (int val1 , Node head) {
        Node tail = head;
        if (head.next == null) {
            return insertbeforehead(val1, head);
        }
        while (tail.next!=null) {
            tail = tail.next;
        }
        Node prev = tail.back;
        Node newnode = new Node (val1,tail,prev);
        tail.back = newnode;
        prev.next = newnode;

        return head;
    }

    public static void insertbeforeNode (Node node , int val) {
        Node prev = node.back;
        Node newnode = new Node (val,node,prev);
        node.back = newnode;
        prev.next = newnode;
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
        Scanner obj = new Scanner (System.in);
        int[] arr = { 12, 10, 16, 14 };
        Node head = insertatEnd(arr);
        int val = obj.nextInt();
        head = insertbeforehead(val,head);
        print(head);
        int val1 = obj.nextInt();
        insertbeforetail(val1,head);
        print(head);
        int k = obj.nextInt();
        int val2 = obj.nextInt();
        head = insertbeforekthelNode(k, val2, head);
        print(head);
        int val3 = 300;
        insertbeforeNode(head.next, val3);
        print(head);
        obj.close();
    }
}

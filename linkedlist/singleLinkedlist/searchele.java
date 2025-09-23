package linkedlist.singleLinkedlist;
import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node (int data1) {
        this.data = data1;
        this.next = null;
    }
}
public class searchele {
    public static boolean chechLinkedlist (Node head , int val) {
        while (head!= null) {
            if (head.data == val) {
                return true;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int []arr = {10,9,8,7};
        Node head = new Node (arr[0]);
        head.next = new Node (arr[1]);
        head.next.next = new Node (arr[2]);
        head.next.next.next = new Node (arr[3]);

        int val = obj.nextInt();
        if(chechLinkedlist(head,val)){
             System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}

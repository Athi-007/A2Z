package linkedlist.doubleLinkedList;
class Node {
    int data;
    Node next;
    Node back;

    Node (int data1) {
        this.data =  data1;
        this.next = null;
        this.back = null;   
    }

    Node (int data2, Node next2 , Node back2) {
        this.data = data2;
        this.next = next2;
        this.back = back2;
    }

}

public class deletehead {
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
     public static Node deleteHead (Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;

        return head;
     }
     
      public static void print(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,10,16,14};
        Node head = insertatEnd(arr);
        head = deleteHead(head);
        print(head);
    }
    
}

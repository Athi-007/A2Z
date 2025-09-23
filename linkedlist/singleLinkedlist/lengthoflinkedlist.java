package linkedlist.singleLinkedlist;

class Node {
    int data;
    Node next;

    Node (int data1) {
        this.data = data1;
        this.next = null;
    }
}
public class lengthoflinkedlist {

    public static int findlength(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {12,13,14,15};
        Node head = new Node(arr[0]);
        head.next = new Node (arr[1]);
        head.next.next = new Node (arr[2]);
        head.next.next.next = new Node (arr[3]);
        int temp = findlength(head);
        System.out.println(temp);

    }
}


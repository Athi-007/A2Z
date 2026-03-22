import java.util.*;

public class QueueIntro {

    static class ArrayQueue {
        int start;
        int end;
        int currSize;
        int maxSize;
        int[] arr;

        public ArrayQueue() {
            start = -1;
            end = -1;
            currSize = 0;
            maxSize = 10;
            arr = new int[maxSize];
        }

        public void push(int x) {
            if (currSize == maxSize) {
                System.out.println("queue is full will lead to overide the elements");
                return;
            }
            if (currSize == 0) {
                start = 0;
                end = 0;
            } 
            else {
                end = (end + 1) % maxSize;
            }
            arr[end] = x;
            currSize++;
        }

        public int pop() {
            if (currSize == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            int pop = arr[start];
            if (currSize == 0) {
                start = -1;
                end = -1;
            }
            else {
                start =( start + 1) % maxSize;
            }
            currSize--;
            return pop;
        } 

        public int peek() {
            if (currSize == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            int peek = arr[start];
            return peek;
        }

        public boolean isEmpty() {
            if (currSize == 0) {
                return true;
            }
            else {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        String[] commands = { "ArrayQueue", "push", "push",
                "peek", "pop", "isEmpty" };
        int[][] inputs = {{}, {5}, {10}, {}, {}, {}};

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "ArrayQueue":
                    System.out.println("null");
                    break;
                case "push" : 
                    queue.push(inputs[i][0]); 
                    break;   
                case "pop" :
                    System.out.println(queue.pop());
                    break;
                case "peek" : 
                    System.out.println(queue.peek());    
                    break;
                case "isEmpty" : 
                    System.out.println(queue.isEmpty());
                    break;
            }
        }
        
    }

}

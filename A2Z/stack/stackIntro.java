import java.util.*;
public class stackIntro {

    static class ArrayStack {
        private int[] stackArray;
        private int capacity;
        private int topindex;

        ArrayStack(int size) {
            capacity = size;
            stackArray = new int[capacity];
            topindex = -1;
        }

        public void push(int x) {
            if (topindex >= capacity - 1) {
                System.out.println("stack overflow");
                return;
            }
            stackArray[++topindex] = x;
        }

        public int top() {
            if (topindex == -1) {
                System.out.println("stack is empty");
                return - 1;
            }
            return stackArray[topindex];
        }

        public int pop() {
            if (topindex == -1) {
                System.out.println("stack is empty");
                return - 1;
            }
            return stackArray[topindex--];
        }

        public boolean isEmpty() {
            if (topindex == -1)  {
                return true;
            }
            else return false;
        }
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(100);
        List<String> commands = Arrays.asList("ArrayStack", "push", "push", "top", "pop", "isEmpty");
        List<List<Integer>> inputs = Arrays.asList(Arrays.asList() ,Arrays.asList(5) , Arrays.asList(10) , Arrays.asList() , Arrays.asList() , Arrays.asList());

        for (int i = 0; i < commands.size(); i++) {
            switch(commands.get(i)) {
               case "ArrayStack" : 
                  System.out.println("null");
                  break;
               case "push" : 
                  stack.push(inputs.get(i).get(0));
                  System.out.println("null");  
                  break; 
               case "top" :
                  System.out.println(stack.top());   
                  break;
               case "pop" :
                  System.out.println(stack.pop());
                  break;  
               case "isEmpty" : 
                  System.out.println(stack.isEmpty());
                  break;   
            }     
        }
    }
}


// https://leetcode.com/problems/find-the-duplicate-number/solutions/1892921/9-approaches-count-hash-in-place-marked-n2arx
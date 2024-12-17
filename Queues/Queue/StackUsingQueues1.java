package Queue;

import java.util.*;

public class StackUsingQueues1 {
     static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

          static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        //add
         static void push(int data){  //O(n)
            while (!q1.isEmpty()){
                q2.add(q1.remove());
            }
            q1.add(data);
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }

        //remove
         static int pop(){  //O(1)
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.remove();
        }

        //peek
         static int peek(){  //O(1)
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.peek();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

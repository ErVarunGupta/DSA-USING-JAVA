package Deque_DoubleEnedeQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack_Using_Deque {
    static  class Stack{
        Deque<Integer> deque = new ArrayDeque<>();

        //push
        public void push(int data){
            deque.addLast(data);
        }

        //pop
        public int pop(){
            if(deque.isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return deque.removeLast();
        }

        //peek
        public int peek(){
            if(deque.isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("peek : "+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}

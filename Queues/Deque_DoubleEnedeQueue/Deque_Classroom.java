package Deque_DoubleEnedeQueue;

import java.util.*;

public class Deque_Classroom {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.add(5);  // last element is add

        System.out.println(deque);

        deque.removeFirst();
        deque.remove();   //first element is removed
        System.out.println(deque);

        System.out.println("first el : "+deque.getFirst());
        System.out.println("last el : "+deque.getLast());

    }
}

package Queue;

public class QueueUsingLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty(){
        return head == null;
    }

    //add
    public static void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //remove
    public static int remove(){
        if(head == null){
            System.out.println("Queue is empty");
            return -1;
        }
        int front = head.data;
        head = head.next;
        return front;
    }

    //peek
    public static int peek(){
        if(head == null){
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args){
        add(1);
        add(2);
        add(3);

        while (!isEmpty()){
            System.out.println(peek());
            remove();
        }
    }
}

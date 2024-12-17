package Queue;

public class QueueUsingArray {
    static int arr[];
    static int size;
    static int rear;
    static int front;

    QueueUsingArray(int n){
        size = n;
        arr = new int[n];
        rear = -1;
        front = -1;
    }

    public static boolean isEmpty(){
        return rear == -1;
    }

    //add
    public static void add(int data){
        if(rear == size-1){
            System.out.println("Queue is full!");
            return;
        }
        rear = rear+1;
        arr[rear] = data;
    }

    //remove
    public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
         front = arr[0];
        for(int i = 0; i < rear; i++){
            arr[i] = arr[i+1];
        }
        rear = rear-1;
        return front;
    }

    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }


    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);
        add(1);
        add(2);
        add(3);

        while(!isEmpty()){
            System.out.println(peek());
            remove();
        }
    }
}

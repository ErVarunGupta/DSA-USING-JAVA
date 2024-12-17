public class Main {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int data){
            this.val = data;
            this.next = null;
        }
    }
    static ListNode head = null;
    static ListNode add(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return head;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp  = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    static void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    static int dec = 0;
    static int pow = 0;

    static void calDec(ListNode head){
        ListNode temp = head;
        if(temp == null){

            return ;
        }
        calDec(temp.next);
        dec += temp.val * Math.pow(2,pow++);
        System.out.println(dec);
    }
    public static int getDecimalValue(ListNode head) {
//        long binary = 0;

////        while(temp != null){
////            binary = temp.val + binary*10;
////            temp = temp.next;
////        }
//
//
//        System.out.println("binary="+binary);
//        int pow = 0;
//        int dec = 0;
//        while(binary > 0){
//            long digit = binary%10;
//            dec += digit * Math.pow(2,pow);
//            pow++;
//            binary = binary/10;
//        }

         calDec(head);
        return dec;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,1,0,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,1};
        for(int i = 0; i < arr.length; i++){
           head = add(arr[i]);
        }
        display();
        int ans = getDecimalValue(head);
        System.out.println(ans);
    }
}

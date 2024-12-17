package BitManipulation.Assignment;

public class Q2_SwapingWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.println("Before swapping:");
        System.out.println("a = "+a+"\n b = "+b);
        System.out.println("After swapping:");
        swap(a,b);
    }

    public static void swap(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = "+a+"\nb = "+b);
    }
}

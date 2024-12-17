package Basics;

public class Factorial {
    public static int factorial(int n){
        if(n == 0){
            System.out.print(1+" ");
            return 1;
        }
         int fact = n * factorial(n-1);
        System.out.print(fact+" ");
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(" = "+factorial(5));
    }
}

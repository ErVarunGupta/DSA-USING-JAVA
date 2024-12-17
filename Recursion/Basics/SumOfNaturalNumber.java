package Basics;

public class SumOfNaturalNumber {
    public static int sumOfNaturalNumber(int n){
        if(n == 1){
            return 1;
        }
        int sum = n + sumOfNaturalNumber(n-1);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumber(5));
    }
}

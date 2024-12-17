package Patterns;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of  n: ");
        int n = sc.nextInt();
        square(n);
    }
    static void square(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

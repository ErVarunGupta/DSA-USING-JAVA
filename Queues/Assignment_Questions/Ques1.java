package Assignment_Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ques1 {
    static void getBinary(int n){
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            q.add(i);
        }
        while (!q.isEmpty()){
            System.out.println(Integer.toBinaryString(q.remove()));
        }
    }

    static void generateBinary(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while (n > 0){
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1+"0");
            q.add(s2+"1");
            n--;
        }
    }
    public static void main(String[] args) {

        System.out.println("Enter the numeber : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        //getBinary(num);
        generateBinary(num);
    }
}

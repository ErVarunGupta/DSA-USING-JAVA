package Basics.Polymorphism;

public class Overloading { // Compile time Polymorphism or Static Polymorphism
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum(5,6));
        System.out.println(c.sum((float)5.5, (float)9.5));
        System.out.println(c.sum(5, 6, 7));
    }
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

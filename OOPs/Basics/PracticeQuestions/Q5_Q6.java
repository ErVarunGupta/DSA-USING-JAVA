package Basics.PracticeQuestions;

public class Q5_Q6 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print();
       // obj1.print1();   // only call Vehicle class function

        Vehicle obj2 = new Vehicle();
        obj2.print();

        Car obj3 = new Car();
        obj3.print();
    }
}

class Vehicle{
    void print(){
        System.out.println("Base class (Vehicle)");
    }
}

class Car extends Vehicle{
    void print1(){
        System.out.println("Derived class(Car) print1 function");
    }
    void print(){
        System.out.println("Derived class(Car)");
    }
}

package Basics.Abstraction;

/*
-> Cannot create an instance or object of abstarac class.
-> Can have abstract or non-abstract methods.
-> Can have constructor
 */

public class AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();


        Chicken c = new Chicken();
        c.walk();

        Hens hn = new Hens();
        //Animal -> Chicken -> Hens
        hn.run();
    }
}

abstract class Animal{

    //Constructor
    String color;
    Animal(){
        color = "brown";
        System.out.println(color);
        System.out.println("animal constructor called");
    }

    void eat(){
        System.out.println("Animal eats everything");
    }

    abstract void walk();
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor called");
    }

    void changeColor(){
        color = "black";
        System.out.println(color);
    }
//    void eat(){
//        System.out.println("Horse eats grass");
//    }

    void walk(){
        System.out.println("Horse walks on four legs");
    }
}

class Chicken extends Animal{

    Chicken(){
        System.out.println("Chicken constructor called");
    }

    void changeColor(){
        color = "blue";
    }
//    void eat(){
//        System.out.println("Chicken eats danna");
//    }

    void walk(){
        System.out.println("Chicken walk on two legs");
    }
}

class Hens extends Chicken{
    Hens(){
        System.out.println("Hens constructor called");
    }
    void run(){
        System.out.println("hens walk on two legs");
    }
}

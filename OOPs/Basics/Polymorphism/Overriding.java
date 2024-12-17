package Basics.Polymorphism;

public class Overriding { // Runtime Polymorphism or Dynamic Polymorphism
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
        Animal a = new Animal();
        a.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Animal eats everything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Deer eats grass");
    }
}

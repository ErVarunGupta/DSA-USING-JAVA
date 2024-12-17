package Basics.Inheritance;

public class Single {
    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.color = "blue";
//        System.out.println(d.color);
//        d.bark();
//        d.eat();
//        d.breath();


        Animal a = new Dog(); // we can assign child object in parent reference
        a.eat();
        a.breath();
       // a.bark(); // can not call

        //Dog dd = new Animal(); // Runtime error
    }
}

//Base class or Parent class or Super class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

//Derived class or Child class or Sub class

class Dog extends Animal{
    void bark(){
        System.out.println("barks");
        System.out.println("I am in the dog class");
    }
}

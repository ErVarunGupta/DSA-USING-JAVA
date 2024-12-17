package Basics.SuperKeyword;

/* super keyword is used to refer immediate parent class object.
-> to access parent's properties or variable
-> to access parent's functions
-> to access parent's constructor
 */

public class Super {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color ;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal{

    Horse(){
        super.color = "brown";
        //super(); // by default compiler add super(); function
        //super();  // Call to 'super()' must be first statement in constructor body
        System.out.println("Horse constructor is called");
    }
}

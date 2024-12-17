package Basics.Constructor;

/* Rules:-
-> this keyword must be the first line in constructor chaining.
-> order does not matter
-> there must exist at least one constructor that does not use this.

** By using this() keyword for current class constructor.
** By using super() keyword for parent class constructor.
 */

public class ConstructorChaining {
    public static void main(String[] args) {
        Student s = new Student("Varun", 908);
    }
}

class Student{
    Student(){
        System.out.println("Default constructor called");
    }

    Student(String name, int roll){
        this(name);
        System.out.println("Parametrized constructor called");
    }

    Student(String name){
        this();
        System.out.println("only name parameter constructor called");
    }
}

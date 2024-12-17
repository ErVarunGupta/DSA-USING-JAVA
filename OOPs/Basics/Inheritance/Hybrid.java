package Basics.Inheritance;

public class Hybrid {
    public static void main(String[] args) {
        First f = new First();
        f.first();
//        f.second();
//        f.third();
//        f.fourth();

        Second s = new Second();
        s.first();
        s.second();
//        s.third();
//        s.fourth();

        Third t = new Third();
        t.first();
        t.second();
        t.third();
//        t.fourth();

        Fourth fth = new Fourth();
        fth.first();
        fth.second();
//        fth.third();
        fth.fourth();
    }
}

class First{
    void first(){
        System.out.println("I am in the First class");
    }
}

class Second extends First{
    void second(){
        System.out.println("I am in the Second class");
    }
}

class Third extends Second{
    void third(){
        System.out.println("I am in the Third class");
    }
}

class Fourth extends Second{
    void fourth(){
        System.out.println("I am in the fourth class");
    }
}

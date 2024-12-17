package Basics.Inheritance;

public class Multilevel {

    public static void main(String[] args) {
        String arr[] = {"a", "b"};

        System.out.println("in main");
        main(5);

        Test t = new Test();
        t.main(arr);

        A aa = new A();
        aa.first();
//        aa.second();
//        aa.third();

        B bb = new B();
        bb.second();
        bb.first();
//        bb.third();

        C cc = new C();
        cc.third();
        cc.second();
        cc.first();
    }

    public static void main(int a) {
        System.out.println(a);
    }
}

class Test extends Multilevel{
    public static void main(String[] args){
        System.out.println("Test class");
    }
}

class A{
    A(){
        System.out.println("A constructor called");
    }
    void first(){
        System.out.println("I am in class A");
    }
}

class B extends A{
    B(){
        System.out.println("B constructor called");
    }
    void second(){
        System.out.println("I am in class B");
    }
}

class C extends B{
    C(){
        System.out.println("C constructor called");
    }
    void third(){
        System.out.println("I am in class C");
    }
}
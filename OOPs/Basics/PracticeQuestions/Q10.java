package Basics.PracticeQuestions;

public class Q10 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.changeB();
        System.out.println(Test1.a+Test1.b);
    }
}

class Test1{
    static int a = 10;
    static int b;
    static void changeB(){
        b = 3 * a;
    }
}

package Basics.PracticeQuestions;

public class Q9 {
    public static void main(String[] args) {
        Test t = new Test();
        t.set_marks(98);
        System.out.println(Test.marks);
        System.out.println(t.marks);
    }
}

class Test{
    static int marks;
    void set_marks(int marks){
       this.marks = marks;
    }
}

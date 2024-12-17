package Basics.PracticeQuestions;
//Q.1 Find out the correct statements to assign name to object.
//a. s->name = "aman"
//b. Student.name = "aman"
//c. s.name = "aman" -- Right
 public  class Q1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "aman";
    }
}

class Student{
    String name;
    int marks;
}

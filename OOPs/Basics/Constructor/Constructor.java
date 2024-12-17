package Basics.Constructor;

public class Constructor {
    public static void main(String[] args) {
        Test t = new Test();

        Test ttt = new Test("Varun Kumar", 12345);
        Test tt = new Test(ttt);
        //ttt.function();
    }
}

class Test{
    String name;
    int id;

    Test(){
        System.out.println("I am default constructor");
    }
    Test(String name, int id){
        this.name = name;
        this.id = id;
        System.out.println("I am parametrized constructor");
        System.out.println(name+" "+id);
    }
    Test(Test test){
        System.out.println("copy constructor");
    }
}

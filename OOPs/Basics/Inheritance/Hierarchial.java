package Basics.Inheritance;

public class Hierarchial {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.first();
//        aa.second();
//        aa.third();

        BB bb = new BB();
        bb.first();
        bb.second();
//        bb.third();

        CC cc = new CC();
        cc.first();
        cc.third();
//        cc.second();
    }
}

class AA{
    void first(){
        System.out.println("I am in class AA");
    }
}

class BB extends AA{
    void second(){
        System.out.println("I am in class BB");
    }
}

class CC extends AA{
    void third(){
        System.out.println("I am in class CC");
    }
}

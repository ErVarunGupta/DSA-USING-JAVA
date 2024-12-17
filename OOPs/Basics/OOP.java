package Basics;

public class OOP {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.color = "black";
        p.setColor("blue");
        p.setTip(5);
        System.out.println(p.color);
        System.out.println(p.tip);
    }
}


class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}

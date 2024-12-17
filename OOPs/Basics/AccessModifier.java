package Basics;

public class AccessModifier {
    public static void main(String[] args) {
        Students s = new Students();
        s.username = "varungupta";
        s.name = "Varun Kumar";
        s.id = 12345;

        System.out.println(s.id);
        System.out.println(s.name);
        System.out.println(s.username);
        s.function();
        //s.password = "varun@123";  // not allowed out of class
    }
}

class Students{
    private String password = "Varun@123";
    protected String username = "varungupta";
    public String name= "Varun Gupta";
     int id = 123456789;

     public void function(){
         password = "Varun@123";
         System.out.println(password);
         System.out.println("i am private in same class");
     }
}

package Basics;

public class GetterAndSetter {
    public static void main(String[] args) {
        Student s = new Student();
        s.setPassword("Varun@1234");
        s.getPassword();
        s.setId(12345);
        s.getId();

        Students sb = new Students();
        System.out.println(sb.name);
        System.out.println(sb.username);
        System.out.println(sb.id);
    }
}

class Student{
    private String password;
    private int id;

    public void setPassword(String pass){
        password = pass;
    }
    public void setId(int id){
        this.id = id;
    }

    public void getPassword(){
        System.out.println(password);
    }
    public void getId(){
        System.out.println(id);
    }
}

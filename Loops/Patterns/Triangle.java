package Patterns;

public class Triangle {
    public static void main(String[] args) {
        tringle();
    }

    static void tringle(){
        for(int  i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

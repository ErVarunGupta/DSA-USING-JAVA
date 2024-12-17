package Patterns;

public class Triangle1 {
    public static void main(String[] args) {
        triangle1(5);
    }

    static void triangle1(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if(col + row <= n+1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

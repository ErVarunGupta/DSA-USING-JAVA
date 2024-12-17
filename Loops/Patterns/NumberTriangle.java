package Patterns;

public class NumberTriangle {
    public static void main(String[] args) {
        numberTriangle(5);
    }

    static void numberTriangle(int n){
        for(int  i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j <= i){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}

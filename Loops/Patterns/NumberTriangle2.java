package Patterns;

public class NumberTriangle2 {
    public static void main(String[] args) {
        numberTriangle3(5);
    }
    static void numberTriangle3(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j <= i){
                    System.out.print(i+j-1);
                }
            }
            System.out.println();
        }
    }
}

package Patterns;

public class CrossPrint {
    public static void main(String[] args) {
        cross1(5);
    }

    static void cross(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i - j == 0 || i + j == n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void cross1(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if((j == 1 && i <= n)|| (j == n && i <= n) || (i == 1 && j <=n) || (i == 5 && j <= n)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

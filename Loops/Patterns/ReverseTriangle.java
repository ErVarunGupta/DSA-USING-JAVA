package Patterns;

public class ReverseTriangle {
    public static void main(String[] args) {
        reverseTriagle(5);
    }

    static void reverseTriagle(int n){
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                if(col - row >= 0){
                    System.out.print("*");
                }else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}

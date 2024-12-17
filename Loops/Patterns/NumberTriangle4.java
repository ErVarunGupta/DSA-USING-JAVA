package Patterns;

public class NumberTriangle4 {
    public static void main(String[] args) {
        numberTriangle3(5,1);
    }
    static void numberTriangle3(int n,int count){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j <= i){
                    System.out.print(count +" ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}

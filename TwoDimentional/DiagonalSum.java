package TwoDimentional;

public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int sum = 0;
        if(n != m){
            System.out.println("Diagonal sum not possible");
            return 0;
        }else{
//            for(int i = 0; i < n; i++){
//                for(int j = 0; j < m; j++){
//                    if(i == j || (i+j == n-1 && i != j)){
//                        sum += matrix[i][j];
//                    }
//                }
//            }

            for(int i = 0; i < n; i++){
                //primary diagonal
                sum += matrix[i][i];
                //secondary diagonal
                if(i != n -1- i){
                    sum += matrix[i][n-1-i];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11},
               };
        System.out.println(diagonalSum(matrix));
    }
}

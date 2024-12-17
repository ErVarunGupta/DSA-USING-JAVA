package TwoDimentional.Assignment2;

public class Q2_SumOfSecRow {
    public static int sumOfSecRow(int matrix[][]){
        int sum = 0;
        for(int i = 0; i < matrix[0].length; i++){
            sum += matrix[1][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 4, 8},{11, 4, 3},{2, 2, 3}};
        System.out.println(sumOfSecRow(matrix));
    }
}

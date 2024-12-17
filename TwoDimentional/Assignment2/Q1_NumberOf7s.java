package TwoDimentional.Assignment2;

public class Q1_NumberOf7s {
    public static int numberOf7(int matrix[][]){
        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 7){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int matrix[][]= {{1, 3, 7, 8},{7, 5, 6, 8}};
        System.out.println(numberOf7(matrix));
    }
}

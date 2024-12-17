package TwoDimentional.Assignment2;

import java.util.Scanner;

public class Q3_TransposeOfMatrix {
    public static void transpose(int matrix[][]){
        int row = matrix.length;
        int col = matrix[0].length;
        int newMatrix[][] = new int[col][row];
        for (int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                newMatrix[j][i] = matrix[i][j];
            }
        }
        printMatrix(newMatrix);
    }

    public static void printMatrix(int matrix[][]){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the columns : ");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print("Enter data at ("+i+","+j+") : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix : ");
        printMatrix(matrix);
        System.out.println("Transpose Matrix : ");
        transpose(matrix);


    }
}

package TwoDimentional;

public class SearchInSortedMatrix {
    public static boolean stairCaseSearch(int matrix[][] , int key){
//        int row = 0;
//        int col = matrix[0].length-1;
//        while(row < matrix.length && col >=0){
//            if(matrix[row][col] == key){
//                System.out.println("Key found at ("+row+","+col+")");
//                return true;
//            }if(matrix[row][col] > key){
//                col--;
//            }else{
//                row++;
//            }
//        }

        int row = matrix.length-1;
        int col = 0;
        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col] == key){
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            }if(matrix[row][col] > key){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("key not found ");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {17, 27, 37, 48},
                {32, 33, 39, 50}};
        stairCaseSearch(matrix, 37);
    }
}

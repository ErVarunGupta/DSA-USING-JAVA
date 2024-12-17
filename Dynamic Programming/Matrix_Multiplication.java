public class Matrix_Multiplication {

    static void matrix(int M1[][], int M2[][]){
        int m1 = M1.length;
        int n1 = M1[0].length;
        int m2 = M2.length;
        int n2 = M2[0].length;

        int M[][] = new int[m1][n2];

        if(n1 == m2){
            for(int i = 0; i < m1; i++){
                for(int j = 0; j < n2; j++){
                    for(int k = 0; k < n1; k++){
                        M[i][j] += M1[i][k]*M2[k][j];
                    }
                }
            }
        }else{
            System.out.println("Multiplication not possible");
        }


        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[0].length; j++){
                System.out.print(M[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int M1[][] = {{1, 2, 3},{4, 5, 6}};
        int M2[][] = {{1, 2},{3, 4},{5,6}};

        matrix(M1, M2);
    }
}

package Graph_part05;

public class Flood_Fill_Algorithm {
    public static void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgCol){//O(m*n)
        int m = image.length;
        int n = image[0].length;
        if(sr < 0|| sc < 0|| sr >= m|| sc >= n|| vis[sr][sc] || image[sr][sc] != orgCol){
            return;
        }
        image[sr][sc] = color;
        vis[sr][sc] = true;
        //left
        helper(image, sr, sc+1, color, vis, orgCol);
        //right
        helper(image, sr, sr-1, color, vis, orgCol);
        //up
        helper(image, sr-1, sc, color, vis, orgCol);
        //down
        helper(image, sr+1, sc, color, vis, orgCol);
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color){
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {
        int image[][] = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1, sc = 1 , color = 2;
        floodFill(image, sr, sc, color);
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[0].length; j++){
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class Travelling_Salesman {
    static int V = 4;
    static int graph[][] = new int[V][V];
    private static void insertEdge(int u, int v, int w){
        graph[u][v] = w;
    }
    static void createGraph(){
        insertEdge(0, 1, 16);
        insertEdge(0, 2, 11);
        insertEdge(0, 3, 6);
        insertEdge(1, 0, 8);
        insertEdge(1, 2, 13);
        insertEdge(1, 3, 16);
        insertEdge(2, 0, 4);
        insertEdge(2, 1, 7);
        insertEdge(2, 3, 9);
        insertEdge(3, 0, 5);
        insertEdge(3, 1, 12);
        insertEdge(3, 2, 2);
    }

    static int dp[][] = new int[16][4];

    static int VISITED_ALL = (1 << V) - 1;
    static int salesman(int mask, int pos){
        if(mask == VISITED_ALL){
            return graph[pos][0];
        }

        if(dp[mask][pos] != -1){
            return dp[mask][pos];
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < V; i++){
            if((mask & (1 << i)) == 0){
                int newAns = graph[pos][i] + salesman(mask | (1 << i), i);
                ans  = Math.min(ans, newAns);
            }
        }
        dp[mask][pos] = ans;
        return dp[mask][pos];
    }
    public static void main(String[] args) {

        createGraph();

        for(int i = 0; i < dp.length;i++){
            for(int j = 0; j < dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        int res = salesman(1, 0);
        System.out.println(res);
    }
}

public class Dijkstra_Algo {
    static int MAX = 6;
    static int graph[][] = new int[MAX][MAX];

    private static void insertEdge(int graph[][],int u, int v, int w){
        graph[u][v] = w;
    }
    public static void createGraph(){
        insertEdge(graph, 0, 1, 2);
        insertEdge(graph, 0, 2, 4);
        insertEdge(graph, 1, 2, 1);
        insertEdge(graph, 1, 3, 7);
        insertEdge(graph, 2, 4, 3);
        insertEdge(graph, 3, 5, 1);
        insertEdge(graph, 4, 3, 2);
        insertEdge(graph, 4, 5, 5);
    }
    private static int findMinVertex(int dist[], boolean vis[]){
        int minIndex = -1, minVal = Integer.MAX_VALUE;

        for(int i = 0; i < graph.length; i++){
            if(!vis[i] && dist[i] < minVal){
                minIndex = i;
                minVal = dist[i];
            }
        }
        return minIndex;
    }

    public static void dijkstra(int src){
        int dist[] = new int[MAX];//by default 0
        boolean vis[] = new boolean[MAX];//by default false

        for(int i = 0; i  < graph.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }


        for(int i = 0; i < MAX; i++){
            int u = findMinVertex(dist, vis);
            vis[u] = true;

           for(int v = 0; v < MAX; v++){
               if(!vis[v] && dist[u]+graph[u][v] < dist[v] && graph[u][v] != 0){
                   dist[v] = dist[u]+graph[u][v];
               }
           }
        }

        for(int i = 0; i < MAX; i++){
            System.out.print(dist[i]+" ");
        }
    }

    public static void main(String[] args) {
        createGraph();

        dijkstra(0);
    }
}

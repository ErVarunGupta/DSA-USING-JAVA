public class Bellman_Ford_Algo {

    static int V = 6;
    static int E = 8;
    static int edgeCount = 0;
    static Edge edgeList[] = new Edge[E];
    public static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(int s, int d, int w){
        if(edgeCount < E){
            edgeList[edgeCount] = new Edge(s, d, w);
            edgeCount++;
        }
    }

    static void bellmanFord(int src){
        int dist[] = new int[V];
        for(int i = 0; i < V; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for(int i = 0; i < V-1; i++){
            for(int j = 0; j < edgeCount; j++){
                int u = edgeList[j].src;
                int v = edgeList[j].dest;
                int w = edgeList[j].wt;
                if(dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]){
                    dist[v] = dist[u]+w;
                }
            }
        }

        for(int i = 0; i < edgeCount;i++){
            int u = edgeList[i].src;
            int v = edgeList[i].dest;
            int w = edgeList[i].wt;
            if(dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]){
                System.out.println("Exist negative cycle");
                return;
            }
        }

        for(int i = 0; i < V; i++){
            if(dist[i] != Integer.MAX_VALUE){
                System.out.print(dist[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        createGraph(0, 1, 2);
        createGraph(0, 2, 4);
//        createGraph(1, 3, 7);
        createGraph(1, 2, -4);
        createGraph(2, 3, 2);
        createGraph(3, 4, 4);
        createGraph(4, 1, -1);
//        createGraph(4, 5, 5);

        bellmanFord(0);
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class Kruskal_Algo {
    static int V = 4;
    static int graph[][] = new int[V][V];
    private static void insertEdge(int u, int v, int w){
        graph[u][v] = w;
        graph[v][u] = w;
    }
    static void createGraph(){
        insertEdge(0, 1, 10);
        insertEdge(0, 2, 30);
        insertEdge(0, 3, 15);
        insertEdge(1, 3, 40);
        insertEdge(2, 3, 50);
    }

    static int par[] = new int[V];
    static int rank[] = new int[V];
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;
        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
        @Override
        public int compareTo(Edge e2){
            return this.wt - e2.wt;
        }
    }

    static void init(){
        for(int i = 0; i < V; i++){
            par[i] = i;
            rank[i] = 0;
        }
    }
    static int find(int x){
        if(x == par[x]){
            return x;
        }
        return par[x] = find(par[x]);
    }

    static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA] < rank[parB]){
            par[parA] = parB;
        }else{
            par[parB] = parA;
        }
    }

    public static void kruskal(){
        init();
        ArrayList<Edge> edges= new ArrayList<>();
//        ArrayList<Integer> edge = new ArrayList<>();

        for(int i = 0; i < V; i++){
            for(int j = i+1; j < V; j++){
                if(graph[i][j] > 0){
                    edges.add(new Edge(i, j, graph[i][j]));
                }
            }
        }
        Collections.sort(edges);
        int mstCost = 0;
        int count = 0;

        for(int i = 0; count < V-1; i++){
            Edge e = edges.get(i);
            int parA = find(e.src);
            int parB = find(e.dest);

            if(parA != parB){
                union(e.src, e.dest);
                mstCost += e.wt;
                count++;
            }
        }

        System.out.println("final cost = "+mstCost);
//        System.out.println("Edge: "+edge);
    }
    public static void main(String[] args) {
        createGraph();
        kruskal();
    }
}

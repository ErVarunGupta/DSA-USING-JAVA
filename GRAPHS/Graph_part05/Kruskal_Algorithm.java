package Graph_part05;

import java.util.ArrayList;
import java.util.Collections;

public class Kruskal_Algorithm {
    static int n = 4;
    static int par[] = new int[n];
    static int rank[] = new int[n];
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

    public static void createGraph(ArrayList<Edge> edges){
//        for(int i = 0; i < graph.length; i++){
//            graph[i] = new ArrayList<>();
//        }
//
//        graph[0].add(new Edge(0, 1, 10));
//        graph[0].add(new Edge(0, 2, 30));
//        graph[0].add(new Edge(0, 3, 15));
//
//        graph[1].add(new Edge(1, 0, 10));
//        graph[1].add(new Edge(1, 3, 40));
//
//        graph[2].add(new Edge(2, 0, 30));
//        graph[2].add(new Edge(2, 3, 50));
//
//        graph[3].add(new Edge(3, 0, 15));
//        graph[3].add(new Edge(3, 1, 40));
//        graph[3].add(new Edge(3, 2, 50));

        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0,3 , 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    static void init(){
        for(int i = 0; i < n; i++){
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

    public static void kruskalMST(ArrayList<Edge> edges, int V){
        init();
        Collections.sort(edges);    //O(E*logE)
        int mstCost = 0;
        int count = 0;

        for(int i = 0; count < V-1; i++){   //O(V)
            Edge e = edges.get(i);
            //(src, dest, wt)

            int parA = find(e.src); //a = e.src
            int parB = find(e.dest); //b = e.dest
            if(parA != parB){
                union(e.src, e.dest);
                mstCost += e.wt;
                count++;
            }
        }
        System.out.println("final cost = "+mstCost);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        kruskalMST(edges,V);
    }
}

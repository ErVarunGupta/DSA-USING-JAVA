package Graph_Supplemental;

import java.util.ArrayList;

public class Articulation_Point {//O(V+E)
    static class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    static void dfs(ArrayList<Edge>[] graph, int[] dt, int[] low, boolean[] vis, int time, int curr,int par, boolean[] ap){
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            int neigh = e.dest;
            if(neigh == par){
                continue;
            }else if(vis[neigh]){
                low[curr] = Math.min(low[curr], dt[neigh]);
            }else if(!vis[neigh]){
                dfs(graph, dt, low, vis, time, e.dest, curr, ap);
                low[curr] = Math.min(low[curr], low[neigh]);
                if(par != -1 && dt[curr] <= low[neigh]){
                    ap[curr] = true;
//                    System.out.println("Articulation point : "+curr);
                }
                children++;
            }
        }
        if(par == -1 && children > 1){
            ap[curr] = true;
//            System.out.println("Articulation point : "+curr);
        }
    }

    public static void tarjonArticulation(ArrayList<Edge>[] graph, int V){
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        boolean ap[] = new boolean[V];


        for(int i = 0; i < V; i++){
            if(!vis[i]){
                dfs(graph, dt, low, vis, time, i,-1, ap);
            }
        }

        //print all articulation point
        for(int i = 0; i < ap.length; i++){
           if(ap[i]){
               System.out.println("Articulation point : "+i);
           }
        }
    }

    public static void main(String[] args) {
        int  V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        tarjonArticulation(graph, V);
    }
}

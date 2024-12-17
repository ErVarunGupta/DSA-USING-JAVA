package Graph_part04;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims_Algorithm {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pairs implements Comparable<Pairs>{
        int vertex;
        int cost;

        Pairs(int v, int c){
            this.vertex = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pairs p2){
            return this.cost - p2.cost; //cost based sorting
        }

    }

    static void prims(ArrayList<Edge>[] graph, int src){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pairs> pq = new PriorityQueue<>();
        ArrayList<Integer> edge = new ArrayList<>();

        pq.add(new Pairs(src, 0));
        int ans = 0;//MST TOTAL MIN WEIGHT
        //loop
        while(!pq.isEmpty()){
            Pairs curr = pq.remove();
            if(!vis[curr.vertex]){
                vis[curr.vertex] = true;
                //add cost in  MST
                ans += curr.cost;
                edge.add(curr.cost);    // all MST edges
                //all neighbours are add in pq
                for(int i = 0; i < graph[curr.vertex].size(); i++){
                    Edge e = graph[curr.vertex].get(i);
                    pq.add(new Pairs(e.dest, e.wt));//vertex = e.dest, cost = e.wt
                }
            }
        }
        System.out.println("final min cost = "+ans);
        System.out.println("All MST edges : "+edge);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph  = new ArrayList[V];
        createGraph(graph);

        int src = 0;
        prims(graph, src);
    }
}

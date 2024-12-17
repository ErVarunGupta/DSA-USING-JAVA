package Graph_part01;
import java.util.ArrayList;

import static Graph_part01.Crearte_A_Graph.*;
import static Graph_part01.Create_Graph.*;
import static Graph_part01.Traversing.*;
import static Graph_part01.Has_Path.*;

public class Classroom {
    public static class Edge{
        public int src;
        public int dest;
        public int wt;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        //build a graph
        //create();

        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        //traversing a graph
        bfs(graph);
        System.out.println();
        dfs(graph,0, new boolean[V]);
        System.out.println();

//        Hash path
        boolean ans = hashPath(graph, 0, 6, new boolean[V]);
        System.out.println(ans);

    }
}

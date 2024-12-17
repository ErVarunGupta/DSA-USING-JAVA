package Graph_part01;
import Graph_part01.Create_Graph.*;
import Graph_part01.Classroom.*;

import java.util.*;

public class Traversing {
    public static void bfs(ArrayList<Edge>[] graph){      //O(n) == O(V+E)
        Queue<Integer> q = new LinkedList<>();//for storing index
        boolean vis[] = new boolean[graph.length];
        q.add(0); //source = 0

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++){//add neighbor of curr
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    //DFS TRAVERSING
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis){
        System.out.print(curr+" ");
        vis[curr] = true;       //boolean type array

        for(int i = 0; i < graph[curr].size(); i++){//neighbor of curr
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }
}

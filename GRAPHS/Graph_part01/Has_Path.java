package Graph_part01;
import Graph_part01.Classroom.*;

import java.util.ArrayList;

public class Has_Path {
    public static boolean hashPath(ArrayList<Edge>[] graph, int src , int dest, boolean vis[]){
        if(src == dest){
            return true;
        }
        vis[src] = true;
        for(int i = 0; i < graph[src].size(); i++){
            Edge e = graph[src].get(i);
            //e.dest = neighbor
            if(!vis[e.dest] && hashPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }
}

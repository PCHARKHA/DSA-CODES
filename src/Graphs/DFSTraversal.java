package Graphs;
import java.util.*;
public class DFSTraversal {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        //the loop is used to create the graph with the help of the edge class
        //vertex-0
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        //vertex-1
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
        //vertex-2
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));
        //vertex-3
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        //vertex-4
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));
        //vertex-5
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,6,1));
        //vertex-6
        graph[6].add(new Edge(6,5,1));
    }
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        //visit
        System.out.print(curr+" ");
        vis[curr] = true;
        //neighbour
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            //if the neighbour is not visited then call dfs on it 
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        boolean vis[] = new boolean[V];
        dfs(graph, 0, vis);
    }
    
}

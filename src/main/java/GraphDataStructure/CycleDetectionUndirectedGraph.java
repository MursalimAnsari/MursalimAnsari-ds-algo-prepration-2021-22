package GraphDataStructure;

import java.util.ArrayList;

public class CycleDetectionUndirectedGraph {


    public static void main(String[] args) {

      int V = 7;

      // List of List of Integers

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i=0; i<V; i++){

            adj.add(new ArrayList<Integer>());

        }


        addEdge(adj , 0, 1);
        addEdge(adj  , 0, 3);
        addEdge(adj  , 0, 4);
        addEdge(adj  , 1, 2);
//        addEdge(adj  , 2, 4);
//        addEdge(adj  , 3, 4);

        addEdge(adj, 4,5);
        addEdge(adj, 5,6);
        addEdge(adj, 4,6);



        // print the graph...
         printGraph(adj);


        System.out.println("Dfs Traversal Recursive :");
       boolean ans =  isCycle(adj, 0);
        System.out.println(ans);

    }

    private static boolean isCycle(ArrayList<ArrayList<Integer>> adj, int src) {

        boolean[] visited  = new boolean[adj.size()];

        for(int i =0; i<adj.size(); i++){
            if(!visited[i]){
                if (isCycleRecur(adj,visited,i, -1))
                    return true;
            }
        }
        return false;
    }

    private static boolean isCycleRecur(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int src, int parent) {

      visited[src] = true;
       // System.out.println(src);

        for (int u: adj.get(src)){
            if(!visited[u]){
                if (isCycleRecur(adj,visited,u,src))
                    return true;
            } else if (u!=parent)
                return true;
        }
        return false;
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj_list, int u, int v) {

        // undirected graph
        adj_list.get(u).add(v);
        adj_list.get(v).add(u);

    }

    static void printGraph(ArrayList<ArrayList<Integer>>adj){
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Adjacency list of " + i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + "->");
            }
            System.out.println();
        }
    }

}

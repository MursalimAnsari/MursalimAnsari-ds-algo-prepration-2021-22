package GraphDataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphImplUsingAdjList {

    static void addEdge(ArrayList<ArrayList<Integer>> adj_list , int u , int v){

        adj_list.get(u).add(v);
        //for undirected graph
       //adj_list.get(v).add(u);
    }


    private static void bfstraversal(ArrayList<ArrayList<Integer>> adj, int src, int V) {

        //TIME COMPLEXITY  O(V+E)+O(V)~O(V+E)
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];

        for(int i=0; i<V;i++){

        if(visited[i]==false) {

            q.add(i);
            visited[i] = true;

            while (!q.isEmpty()) {

                int v = q.poll();
                System.out.println(v);

                for (int u : adj.get(v)) {
                    if (visited[u] == false) {
                        q.add(u);
                        visited[u] = true;
                    }
                }
            }
        }
        }
    }

    private static void dfsTraversal(ArrayList<ArrayList<Integer>> adj, int src) {
            //TIME COMPLEXITY  O(V+E)
            boolean[] visited = new boolean[adj.size()];

             for (int i=0; i< adj.size();++i){
                 if(!visited[i]){
                     dfsRecursive(i,visited,adj);
                 }
             }


    }

    private static void dfsRecursive(int src, boolean[] visited, ArrayList<ArrayList<Integer>>adj) {

        visited[src]= true;
        System.out.println(src);

        for (int u : adj.get(src)){
            if(!visited[u]){
                dfsRecursive(u,visited,adj);
            }
        }

    }

    private static void dfsIterative(ArrayList<ArrayList<Integer>> adj, int src , int V) {
        //TIME COMPLEXITY  O(V+E)

        Stack<Integer> s = new Stack<>();
        boolean[] visited = new boolean[V];

          for (int i=0; i<V; i++) {

              if (visited[i] == false) {

                  s.push(i);
                  visited[i] = true;


                  while (!s.isEmpty()) {

                      int v = s.peek();
                      s.pop();

                      System.out.println(v);

                      for (int u : adj.get(v)) {

                          if (visited[u] == false) {

                              visited[u] = true;
                              s.push(u);

                          }
                      }

                  }

              }

            }
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



    public static void main(String[] args) {
        int v= 7;

        ArrayList<ArrayList<Integer>> adj_list = new ArrayList<ArrayList<Integer>>();

        for( int i=0; i<v;i++){
            adj_list.add(new ArrayList<Integer>());
        }

//        addEdge(adj_list , 0, 1)
//        addEdge(adj_list , 0, 2);
//        addEdge(adj_list , 0, 3);
//        addEdge(adj_list , 1, 2);
//        addEdge(adj_list , 3, 2);
//        addEdge(adj_list , 3, 4);
//

//        addEdge(adj_list , 0, 1);
//        addEdge(adj_list , 0, 2);
//        addEdge(adj_list , 2, 3);
//        addEdge(adj_list , 4, 5);


        addEdge(adj_list, 0,1);
        addEdge(adj_list, 0,5);
        addEdge(adj_list,1,4);
        addEdge(adj_list, 1,2);
        addEdge(adj_list, 2,3);
        addEdge(adj_list, 2,6);
        addEdge(adj_list, 3,6);
        addEdge(adj_list, 4,0);
        addEdge(adj_list, 5,4);
        addEdge(adj_list,6 ,4);
        addEdge(adj_list, 6,1);


//        printGraph(adj_list);
//
//        System.out.println(adj_list.size());

        System.out.println("Bfs Traversal :" );
        bfstraversal(adj_list,0, v);
//
//
//        System.out.println(" Dfs Traversal Recursive :" );
//        dfsTraversal(adj_list,0);
//
          System.out.println();

        System.out.println("Dfs Traversal Iterative :");

        dfsIterative(adj_list, 0, v);


    }


}

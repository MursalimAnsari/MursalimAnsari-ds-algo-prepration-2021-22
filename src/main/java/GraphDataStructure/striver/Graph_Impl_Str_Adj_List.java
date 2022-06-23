package GraphDataStructure.striver;

// java graph representation using adjacency list for undirected graph
// Non weight graph

/*
      0-----1
     |  \   | \              5-----6
     |   \  |  \    C1       |               C2
     |    \ |   4            |
     |     \|   /            7-----8
     3------2 /

  vertices :   0--1--2--3--4--5--6--7--8
  edges    :   0--1, 0--3, 0--2, 1--4, 1--2, 2--4, 2--3, 7--5, 7--8, 5--6

 */


import java.util.*;

public class Graph_Impl_Str_Adj_List {

    public static void main(String[] args) {

        int v = 9;

        List<List<Integer>> list = buildGraph(v);

       // bfsTraversal(list, v, 0);
      
        dfsTraversalRecursion(list,v,0);
        
       // printGraph(list);

    }

    // TIME COMPLEXITY O(V+E)
    //SPACE COMPLEXITY O(V+E) + O(V)
    private static void dfsTraversalRecursion(List<List<Integer>> list, int V, int src) {

        boolean[] vis = new boolean[V];

        for( int i=0; i<V; i++){

            if(vis[i]==false){
                dfs(list, i, vis);
            }
        }
    }

    private static void dfs(List<List<Integer>> list, int i, boolean[] vis) {

        System.out.print(i+" ");
         vis[i]=true;

        for (Integer u : list.get(i)){
            if (!vis[i]){
                dfs(list,u,vis);
            }
        }
    }



    private static void bfsTraversal(List<List<Integer>> list, int V, int src) {

        Queue<Integer> q= new LinkedList<>();
        boolean[] vis = new boolean[V];

        for(int i=0; i<V; i++){

           if(vis[i]==false){

               q.add(i);
               vis[i]=true;


               while(!q.isEmpty()){

                   int node = q.poll();
                   System.out.print(node +" ");

                   for (Integer u : list.get(node)){

                       if (vis[u]==false){
                           q.add(u);
                           vis[u]=true;

                       }
                   }
               }
           }
        }
    }





    private static List<List<Integer>> buildGraph(int v) {

        List<List<Integer>> adj_list = new ArrayList<>();

        for (int i=0; i<v; i++){
            adj_list.add(new ArrayList<>());
        }

        addEdge(adj_list,0,1);
        addEdge(adj_list,0,3);
        addEdge(adj_list,0,2);
        addEdge(adj_list,1,4);
        addEdge(adj_list,1,2);
        addEdge(adj_list,2,4);
        addEdge(adj_list,2,3);
        addEdge(adj_list,7,5);
        addEdge(adj_list,7,8);
        addEdge(adj_list,5,6);

        return adj_list;
    }

    private static void addEdge(List<List<Integer>> adj_list, int u, int v) {
        adj_list.get(u).add(v);
        adj_list.get(v).add(u);
    }


    private static void printGraph(List<List<Integer>> list) {

        for (int i=0; i< list.size();i++){
            System.out.print(" adjacency list of " +i + ": ");
            for (int j=0; j<list.get(i).size();j++){

                System.out.print(list.get(i).get(j) +" ");
            }
            System.out.println();
        }
    }

}

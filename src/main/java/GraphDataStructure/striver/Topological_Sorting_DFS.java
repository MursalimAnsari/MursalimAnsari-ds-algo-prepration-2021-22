package GraphDataStructure.striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Topological_Sorting_DFS {

   static  int n;
   static ArrayList<ArrayList<Integer>>adj;


 public static void main(String[] args) {

    n=6;
    adj = new ArrayList<>();

    // build graph

  for(int i=0; i<n; i++){

     adj.add(new ArrayList<>());

  }

     adj.get(2).add(3);
     adj.get(3).add(1);
     adj.get(4).add(0);
     adj.get(4).add(1);
     adj.get(5).add(0);
     adj.get(5).add(2);

     topoDfs(n, adj);

}

 private static void topoDfs(int n, ArrayList<ArrayList<Integer>> adj) {

    int vis[]= new int[n];
    Arrays.fill(vis,0);
   Stack<Integer>st= new Stack<>();

    for(int i=0; i<n; i++){

     if(vis[i]==0){
       dfs(i, st, vis);
       }
    }

    System.out.println("Topological sorting: ");
    System.out.println();

    while(!st.isEmpty()){
     int node = st.pop();
     System.out.print(node +" ");
    }
 }


 private static void dfs(int src, Stack<Integer> st, int[] vis) {

        vis[src] =1;
        for(Integer nbr : adj.get(src)){
          if(vis[nbr]==0) {
          dfs(nbr, st, vis);
          }
        }
      st.add(src);
     }
}

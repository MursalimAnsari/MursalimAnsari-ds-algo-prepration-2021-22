package GraphDataStructure.striver;
/*
     Strongly Connected Component : If we can reach from each vertex of a component to every other
     vertex in that component then it is called as SCC.

    NOTE: Single Node is always an SCC.

 */


import java.util.ArrayList;
import java.util.Stack;

public class Strongly_Connected_Components_Kosaraju_Algorithm
{

    static int[] vis;
    static ArrayList<ArrayList<Integer>>adj;
    static int n;

    public static void main(String[] args) {

     adj =new ArrayList<ArrayList<Integer>>();
     n=6;


        // build graph
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<Integer>());
        }

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(1).add(4);
        adj.get(4).add(3);
        adj.get(3).add(5);
        adj.get(5).add(4);


        Strongly_Connected_Components_Kosaraju_Algorithm obj = new Strongly_Connected_Components_Kosaraju_Algorithm();
        obj.kosarajuAlgo(adj,n);

    }

    private void dfs(int node, Stack<Integer>st, ArrayList<ArrayList<Integer>>adj, int[]vis){

        vis[node]=1;
        for(Integer it : adj.get(node)){
            if(vis[it]==0){
                dfs(it, st, adj,vis);
            }
        }
       st.push(node);
    }

    private void kosarajuAlgo(ArrayList<ArrayList<Integer>> adj, int n) {

        // step 1 : build stack using dfs ===> Topological sorting
         vis= new int[n];
        Stack<Integer>st= new Stack<>();

        for (int i=0; i<n; i++){
            if(vis[i]==0){
                dfs(i, st,adj,vis);
            }
        }

        // step 2 :  Transpose of the matrix
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<ArrayList<Integer>>();
        
         transposeMat(transpose);
        
        // step 3 : dfs call on transpose matrix and stack
        while(!st.isEmpty()){

            int node = st.pop();
            if(vis[node]==0){
                System.out.print("SCC: ");
                revDfs(node, transpose,vis);
                System.out.println();
            }
        }
    }

    private void transposeMat(ArrayList<ArrayList<Integer>> transpose) {

        for(int i=0; i<n; i++){
            transpose.add(new ArrayList<Integer>());
        }

        // transpose matrix
        for(int i=0; i<n; i++){
            vis[i]=0;
            for(Integer nbr : adj.get(i)){
                transpose.get(nbr).add(i);
            }
        }

    }

    private void revDfs(int src, ArrayList<ArrayList<Integer>>transpose, int[]vis){
        vis[src]=1;
        System.out.print(src +" ");
        for(Integer it : transpose.get(src)){
            if(vis[it]==0){
                revDfs(it,transpose,vis);
            }
        }
    }

}

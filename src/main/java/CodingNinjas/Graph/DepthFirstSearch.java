package CodingNinjas.Graph;

import java.util.ArrayList;

public class DepthFirstSearch {

    public static void main(String[] args) {
        int v=6;
        int e=7;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();

        depthFirstSearch(v,e,edges);
    }

    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.
        //graph is disconnected
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int countComponenet = 0;
        boolean[] vis = new boolean[v+1];

        for(int i=0; i<v; i++){
            graph.add(new ArrayList<>());
        }

        for(int j=0; j<e; j++){
            graph.get(edges.get(j).get(0)).add(edges.get(j).get(1));
            graph.get(edges.get(j).get(1)).add(edges.get(j).get(0));
        }


        for(int i = 0; i<v; i++){
            if(!vis[i]){
                ArrayList<Integer> dfsTraversal = new ArrayList<>();
                countComponenet++;
                dfs(i, dfsTraversal, vis, graph);
                ans.add(dfsTraversal);
            }
        }
        return ans;
    }
    static void dfs(int node, ArrayList<Integer> dfsTraversal, boolean[]vis, ArrayList<ArrayList<Integer>> graph ){

        dfsTraversal.add(node);
        vis[node]=true;

        for(Integer nbr : graph.get(node)){
            if(vis[nbr] == false){
                dfs(nbr, dfsTraversal, vis, graph);
            }
        }
    }
}

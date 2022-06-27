package CodingNinjas.Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class CycleDetectionUndirectedGraph {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int V = s.nextInt();
        int E = s.nextInt();

        ArrayList<ArrayList<Integer>>edges =  new ArrayList<>();

        for(int i=0; i<V;i++){
            edges.add(new ArrayList<>());
        }

        for(int i=0; i<E; i++ ){

            int u= s.nextInt();
            int v = s.nextInt();

            edges.get(u).add(v);
            edges.get(v).add(u);

        }

        if(dfs(edges,V)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

    }

    public static boolean dfs(ArrayList<ArrayList<Integer>>edges, int v){
        boolean[]vis = new boolean[v];

        for(int i=0; i<v;i++){
            if(vis[i]==false){
                if(checkCycle(i, vis, edges, -1))
                    return true;
            }
        }
        return false;
    }

    public static boolean checkCycle(int node ,boolean[] vis, ArrayList<ArrayList<Integer>>edges, int     parent){

        vis[node]=true;
        for(Integer nbr : edges.get(node)){
            if(!vis[nbr]){
                if(checkCycle(nbr, vis, edges, node)==true){
                    return true;
                } else if(nbr!=parent){
                    return true;
                }
            }
        }
        return false;
    }

}
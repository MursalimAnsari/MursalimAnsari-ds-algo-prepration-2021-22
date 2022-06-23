package CodingNinjas.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class BreadthFirstSearch {

    public static void main(String[] args) {
        int v=8;
        int e=7;
        int[][]edges = new int[v][v];
        breadthFirstSearch(v,edges);
    }


    public static ArrayList<Integer> breadthFirstSearch(int vertex, int edges[][]){

        boolean[] vis = new boolean[vertex];
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<TreeSet<Integer>> graph = new ArrayList<>();
        Queue<Integer> q= new LinkedList<>();


        for(int i= 0 ; i<vertex;i++){
            graph.add(new TreeSet<>());
        }


        for(int j=0; j<edges[0].length;j++){

            int u = edges[0][j];
            int v= edges[1][j];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }


        for(int i =0; i<vertex; i++){
            if(!vis[i]){
                q.add(i);
                vis[i]=true;

                while(!q.isEmpty()){
                    int node = q.poll();
                    res.add(node);
                    for(Integer nbr :graph.get(node)){
                        if(vis[nbr]==false){
                            q.add(nbr);
                            vis[nbr]=true;
                        }
                    }
                }
            }
        }

        return res;
    }

}

package GraphDataStructure.striver;

// undirected graph with weights
// using Adjacency list

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Graph_Impl_Str_Adj_List_weighted {

     static class Pair{

        int vertex;
        int weight;

        public Pair(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {

        int v= 5;
        int e= 7;

       List<List<Pair>> list = buildGraph(v);

    }


    private static List<List<Pair>> buildGraph(int v) {

         List<List<Pair>> adj_list = new ArrayList<>();

         for (int i=0; i<v; i++){
             adj_list.add(new ArrayList<>());
         }

         addEdge(adj_list,0,1,4);
         addEdge(adj_list,0,1,4);
         addEdge(adj_list,0,1,4);
         addEdge(adj_list,0,1,4);
         addEdge(adj_list,0,1,4);
         addEdge(adj_list,0,1,4);
         addEdge(adj_list,0,1,4);

     return adj_list;
    }

    private static void addEdge(List<List<Pair>> adj_list, int u, int v, int w) {

         adj_list.get(u).add(new Pair(v,w));
         // for undirected graph
         adj_list.get(v).add(new Pair(u,w));
    }




}

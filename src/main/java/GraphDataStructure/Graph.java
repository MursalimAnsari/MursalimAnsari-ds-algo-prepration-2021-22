package GraphDataStructure;
/*
      this is the simple implementation of weighted and directed graph
 */

import java.util.ArrayList;
import java.util.List;

public class Graph {


    static class Pair {
        Integer vertex;
        Integer weight;

        Pair(int vertex , int weight){

            this.vertex = vertex;
            this.weight = weight;
        }

    }

    public static List<List<Pair>> buildGraph(int v,  List<List<Pair>> adj){

        for (int i=0; i<v; i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1, 4);
        addEdge(adj, 0, 2, 1);
        addEdge(adj, 2, 1, 2);
        addEdge(adj, 2, 3, 4);
        addEdge(adj, 1, 4, 4);
        addEdge(adj, 3, 4, 4);

        return adj;
    }
     static  void  addEdge(List<List<Pair>>adj, int u, int v, int w){

        // for directed weighted graph
        adj.get(u).add(new Pair(v,w));

     }


     static  void  printGraph(List<List<Pair>>adj){

        for (int i=0;i<adj.size();i++){
            System.out.println("Adjacency List of : " +i);

            for (int j=0; j<adj.get(i).size();j++){
                System.out.println(adj.get(i).get(j).vertex+ " " +adj.get(i).get(j).weight);
            }

            System.out.println();
        }

     }


    public static void main(String[] args) {

        Graph g= new Graph();

        List<List<Pair>> adj = new ArrayList<>();

        g.buildGraph(4 , adj);

        printGraph(adj);


    }

}


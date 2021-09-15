package GraphDataStructure;
/*
      graph implementation using adjacency list

      we are using un weightwd graph here

 */

import java.util.LinkedList;
import java.util.Scanner;

public class Graph_Impl1 {

    private LinkedList<Integer> [] adj;    // array of linked linked list type
    private int V;  // no of vertices
    private int E;  // no of edges

    // create constructor...

    public  Graph_Impl1(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];

        // enter no of vertices

        for (int v = 0;v<V;v++){

            adj[v] = new LinkedList<>();

        }
    }


    public  void  addEdge(int src, int dest){
        // for undirected graph
        adj[src].offer(dest);
        adj[dest].offer(src);
          E++;
        // we can use add method of Collections framework here ...

       // for directed graph
       //adj[src].add(dest);
    }


    public  String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append(V +"vertices " + E + "edges"+ "\n");

        for (int v=0;v<V;v++){
            sb.append(v + ":");

            for(int w : adj[v]){
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

     Graph_Impl1 g = new Graph_Impl1(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,3);
        g.addEdge(2,3);
        System.out.println(g);

    }

}

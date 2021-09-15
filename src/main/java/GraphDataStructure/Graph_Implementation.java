package GraphDataStructure;

/*

     Graph :  Graph is a non linear data structure which is a collection of edges and nodes.

     example :   0------1
                 |      |
                 2------3

                 Using Adjacency Matrix...
 */

import java.util.Scanner;

public class Graph_Implementation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of vertices :");
        int v= sc.nextInt();

        System.out.println("Enter no of edges :");
        int e = sc.nextInt();

        int[][] adj_mat = new int [v][v];

        // take input in matrix...

        for (int i =0; i<e;i++){

            // starting vertex
            int sv = sc.nextInt();

            //end vertex
            int ev = sc.nextInt();

            // insert values in the matrix...
            adj_mat[sv][ev] =1;
            // in case of directed graph we will not write the below condition...
            adj_mat[ev][sv] =1;
        }

        // Print the graph
        print(adj_mat);

    }


    // dfs traversal
      public static void print_graph(int[][]adj_mat, int sv, boolean[] visited){
          System.out.println(sv);
          visited[sv] =true;
          int no_of_vertices = adj_mat.length;
          for (int i=0; i<no_of_vertices;i++){
              if(adj_mat[sv][i] ==1 && visited[i]==false){
                  print_graph(adj_mat,i,visited);
              }
          }
      }

      public static void print(int adj_mat[][] ){
        int no_of_vertices = adj_mat.length;
        boolean[] visited = new boolean[no_of_vertices];
        for (int i=0; i<no_of_vertices;i++){
            if(visited[i]==false){
                print_graph(adj_mat, i, visited);
            }
        }
      }

}

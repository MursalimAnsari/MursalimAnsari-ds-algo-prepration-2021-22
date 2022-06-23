package GraphDataStructure.striver;

// java graph representation using adjacency matrix for undirected graph
// Non weight graph

/*
      0-----1
     |  \   | \
     |   \  |  \
     |    \ |   4
     |     \|   /
     3------2 /

  vertices :   0--1--2--3--4
  edges    :   0--1, 0--2, 0--3, 1--2, 1--4, 2--3, 2--4

 */


public class Graph_Impl_Str_Adj_Mat {

    public static void main(String[] args) {

        int v = 5;
        int e = 7;

       int[][] adj = buildGraph(v);
       printGraph(adj);
    }


    private static int[][] buildGraph(int v) {

       int[][] adj_mat = new int[v][v];

        addEdge(adj_mat,0,1);
        addEdge(adj_mat,0,2);
        addEdge(adj_mat,0,3);
        addEdge(adj_mat,1,2);
        addEdge(adj_mat,1,4);
        addEdge(adj_mat,2,3);
        addEdge(adj_mat,2,4);

        return adj_mat;
    }

    public static void addEdge(int [][]mat, int u, int v){

        mat[u][v] =1;
        mat[v][u] =1;

    }

    private static void printGraph(int[][] adj) {

        for (int i=0; i<adj.length;i++){
            for (int j=0; j<adj[0].length; j++){

                System.out.print(adj[i][j] + " ");

            }
            System.out.println();
        }
    }

}





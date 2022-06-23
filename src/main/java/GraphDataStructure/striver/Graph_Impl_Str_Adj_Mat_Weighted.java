package GraphDataStructure.striver;

public class Graph_Impl_Str_Adj_Mat_Weighted {

    public static void main(String[] args) {

        int v= 5;
        int e= 7;

       int [][] mat= buildGraph(v);

       printGraph(mat);

    }


    private static int[][] buildGraph(int v) {

      int [][] adj_mat = new int[v][v];

        addEdge(adj_mat,0,1,2);
        addEdge(adj_mat,0,2,1);
        addEdge(adj_mat,0,3,4);
        addEdge(adj_mat,1,2,2);
        addEdge(adj_mat,1,4,1);
        addEdge(adj_mat,2,3,3);
        addEdge(adj_mat,2,4,6);

        return adj_mat;
    }

    private static void addEdge(int[][] adj_mat, int u, int v, int w) {

         adj_mat[u][v] =w;
         adj_mat[v][u] =w;

    }

    private static void printGraph(int[][] mat) {

      for (int i=0; i<mat.length;i++){
          for (int j=0; j<mat[0].length; j++){
              System.out.print(mat[i][j] +" ");
          }
          System.out.println();
      }

    }

}

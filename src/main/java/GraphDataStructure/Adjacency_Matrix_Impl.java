package GraphDataStructure;

public class Adjacency_Matrix_Impl {

    private int V;
    private int E;
    private int[][] adj_mat;

    public Adjacency_Matrix_Impl(int nodes) {

       this.V =nodes;
       this.E=0;
       this.adj_mat = new int[nodes][nodes];

    }

    public void addEdge(int src , int dest){

        adj_mat[src][dest]=1;
       // adj_mat[dest][src]=1;
        E++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V + "vertices, " + E + "edges" + "\n");
        for (int v= 0; v<V; v++){
            sb.append(v+ ": ");
            for (int w : adj_mat[v]){
                sb.append(w+ " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    public static void main(String[] args) {

        Adjacency_Matrix_Impl cg = new Adjacency_Matrix_Impl(5);


        cg.addEdge(0, 2);
        cg.addEdge(1, 3);
        cg.addEdge(2, 3);
        cg.addEdge(3, 4);
        cg.addEdge(4, 0);
        cg.addEdge(4, 2);

        System.out.println(cg);


    }
}



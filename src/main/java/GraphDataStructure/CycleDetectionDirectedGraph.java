package GraphDataStructure;

public class CycleDetectionDirectedGraph {

    private int V;
    private int E;
    private int[][] adj_mat;

    public CycleDetectionDirectedGraph(int nodes) {

       this.V =nodes;
       this.E=0;
       this.adj_mat = new int[nodes][nodes];

    }

    public void addEdge(int src , int dest){

        adj_mat[src][dest]=1;
       // adj_mat[dest][src]=1;
        E++;
    }

    public boolean isCycle(int adj_mat[][]){

        int [] visited = new int[V];
        int[] helper = new int[V];

        for (int i=0; i<adj_mat.length;i++){
            if (visited[i]==0){
                if(checkCycle(i, adj_mat, visited, helper)){
                    return true;
                }
            }
        }
  return  false;

    }

    private boolean checkCycle(int src, int[][] adj_mat, int[] visited, int[] helper) {

        visited[src]=1;
        helper[src] =1;

        for (Integer x : adj_mat[src]){
            if (visited[x]==0){

                if (checkCycle(x,adj_mat,visited,helper)==true){
                    return true;
                }
            }   else if (helper[x]==1){
                return true;
            }
        }
          helper[src]=0;
        return false;

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

        CycleDetectionDirectedGraph cg = new CycleDetectionDirectedGraph(5);


        cg.addEdge(0, 2);
        cg.addEdge(1, 3);
        cg.addEdge(2, 3);
        cg.addEdge(3, 4);
        cg.addEdge(4, 0);
        cg.addEdge(4, 2);

        System.out.println(cg);
       boolean ans =  cg.isCycle(cg.adj_mat);
        System.out.println(ans);


    }
}



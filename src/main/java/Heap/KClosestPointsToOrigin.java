package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {

    public static void main(String[] args) {

       // int [][] points = {{3,3},{5,-1},{-2,4}};
       // int k=2;

        int [][] points = {{2,1},{-2,-2}};
        int k = 1;

       int [][] ans = kClosest(points , k);

        for (int[] i : ans) {
            System.out.println("[" + i[0] + "," + i[1] + "]");
        }

//       for(int i=0;i<k;i++){
//              for(int j=0;j<2;j++){
//                  System.out.print(ans[i][j]);
//              }
//          }
    }


    public static int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>((a, b)->distance(b)-distance(a));
        // create a 2d array

        int[][] res= new int[k][2];


        for(int [] point: points){

            maxHeap.add(point);

            if(maxHeap.size()>k){
                int[] temp= maxHeap.remove();
            }
        }

        int size = maxHeap.size();


        for(int i=0;i<size;i++){
            res[i] = maxHeap.remove();

        }


        return res;
    }

    public static int distance(int[] a) {
        int x = a[0], y = a[1];
        return x*x + y*y;
    }


}

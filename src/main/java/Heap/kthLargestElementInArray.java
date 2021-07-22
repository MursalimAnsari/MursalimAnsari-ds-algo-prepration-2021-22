package Heap;

/*
*       min heap =>
*
* */

import java.util.PriorityQueue;

public class kthLargestElementInArray {

    public static void main(String[] args) {
        int arr[] = {7,10,4,3,20,15};
        int k=3;
      int ans =  kthLargestElementInArrayUsingHeap(arr,k);
        System.out.println(ans);

    }

   public static int kthLargestElementInArrayUsingHeap(int[] arr, int k){

       PriorityQueue<Integer>minHeap = new PriorityQueue<>();

       for (int element:arr){

           if(minHeap.size()<k){
               minHeap.add(element);
           } else{
               if(minHeap.size()==k && minHeap.peek()<element){
                   minHeap.poll();
                   minHeap.add(element);
               }
           }

       }

       return minHeap.peek();

    }

}

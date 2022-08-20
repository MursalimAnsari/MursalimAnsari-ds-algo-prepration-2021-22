package Heap;
/*
   Given an array of n elements, where each element is at most k away from its target position,
   devise an algorithm that sorts in O(n log k) time.
   For example, let us consider k is 2, an element at index 7 in the sorted array,
   can be at indexes 5, 6, 7, 8, 9 in the given array.

        Input : arr[] = {6, 5, 3, 2, 8, 10, 9}
          k = 3
        Output : arr[] = {2, 3, 5, 6, 8, 9, 10}

        Input : arr[] = {10, 9, 8, 7, 4, 70, 60, 50}
          k = 4
        Output : arr[] = {4, 7, 8, 9, 10, 50, 60, 70}


        we can use insertion sort but in worst case it will go to O(n*k)  if k>=n then it will go to n^2

*/

import java.util.PriorityQueue;

public class SortANearlySortedArray {

    public static void main(String[] args) {

        int [] arr={6,5,3,2,8,10,9};
        int k=3;

       int[] ans= kSortedArray(arr,k);

         for(int elements : ans){
             System.out.print(elements+"    ");
         }

    }

    private static int[] kSortedArray(int[] arr, int k) {

        // we have to sort in ascending order...

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // add first k elements to minHeap
        for(int i=0;i<k+1;i++){
            minHeap.add(arr[i]);
        }

        // add remaining elements to the heap
        int index=0;
        for (int j=k+1;j<= arr.length-1;j++){
            arr[index++]= minHeap.peek();
            minHeap.poll();
            // add next element to heap

            minHeap.add(arr[j]);
        }

        // pull all remaining elements from heap and add to array
        while(!minHeap.isEmpty()){

            //minHeap.peek();
            arr[index++]= minHeap.poll();
        }
       return arr;
    }

}

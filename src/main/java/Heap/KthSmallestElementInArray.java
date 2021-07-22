package Heap;


import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementInArray {

    public static void main(String[] args) {
        
        int arr[] = {7,10,4,3,20,15};
        int k=3;
        int left =0;
        int right = arr.length-1;

        kthSmallestElementUsingBubbleSort(arr, k);
        int ans=  kthSmallestElementUsingHeap(arr,k);
        System.out.println();
        System.out.println("3rd smallest element is : "+ans);
        
    }

    private static int kthSmallestElementUsingHeap(int[] arr, int k) {

        // O(nlogk) time complexity

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int element:arr){
            if(maxHeap.size()<k){
                maxHeap.add(element);
            } else{

                if(maxHeap.size()==k && maxHeap.peek()>element){
                    maxHeap.poll();
                    maxHeap.add(element);
                }
            }
        }

        return maxHeap.peek();
    }

    private static  void kthSmallestElementUsingBubbleSort(int[] arr, int k) {
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){

                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }

        }

        for (int elements:arr){
            System.out.println(elements);
        }

        System.out.println("3rd smallest element in arr is : " +arr[k-1]);

    }





}

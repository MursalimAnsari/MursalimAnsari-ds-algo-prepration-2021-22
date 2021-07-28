package Heap;

/*
      Given a sorted array arr[] and a value X, find the k closest elements to X in arr[].

       Input: K = 4, X = 35
       arr[] = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56}
       Output: 30 39 42 45


 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class KClosestNumbers {


    public static void main(String[] args) {

        int [] arr= {12, 16, 22, 30, 39, 42, 45, 48, 50, 53, 55, 56};
        int k=4;
        int x= 35;

       List<Integer> ans = kClosestElementsUsingBinarySearch(arr,k,x);

         for (int i=0; i<ans.size();i++){
             System.out.println(ans.get(i));
         }
    }

    public static List<Integer> getSubArray(int []arr , int start, int end){

        List<Integer> res = new LinkedList<>();

        for(int i=start; i<=end;++i){
            res.add(arr[i]);
        }

        return res;

    }


    public static List<Integer> kClosestElementsUsingBinarySearch(int[] arr, int k, int x) {

        if(x<=arr[0]){
            return getSubArray(arr, 0,k-1);
        }

        if(x>=arr[arr.length-1]){
            return getSubArray(arr,arr.length-k,arr.length-1);
        }

        int index = Arrays.binarySearch(arr,x);

        if(index<0){
            index= -1-index;
        }

        int left =Math.max(0,index-k);
        int right= Math.min(index+k,arr.length-1);

        while((right-left+1)>k){
            int absL= Math.abs(arr[left]-x);
            int absR= Math.abs(arr[right]-x);

            if(absL<=absR){
                --right;
            } else{
                ++left;
            }

        }

        return getSubArray(arr,left,right);
    }







}



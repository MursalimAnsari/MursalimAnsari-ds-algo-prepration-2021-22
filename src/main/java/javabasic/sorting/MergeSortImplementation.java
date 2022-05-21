package javabasic.sorting;

import java.util.Arrays;

public class MergeSortImplementation {

    public static void main(String[] args) {


        int arr[] = {-1,3,5,6,-9,0,8,0,8,0,-5,2};

        arr = mergeSortImplementation(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] mergeSortImplementation(int[] arr) {

     if (arr.length==1){
         return arr;
     }

     int mid= arr.length/2;

        int [] left = mergeSortImplementation(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergeSortImplementation(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {

    int[] mergedArray = new int[first.length+second.length];

     int i=0;
     int j=0;
     int k=0;

     while (i<first.length && j<second.length){

         if (first[i]<second[j]){
             mergedArray[k++] = first[i++];

         } else {
             mergedArray[k++] = second[j++];

         }

     }

     while (i<first.length){
         mergedArray[k++] = first[i++];
     }

        while (j<second.length){
            mergedArray[k++] = second[j++];
        }

        return mergedArray;
    }
}


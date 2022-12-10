package arrays.easy;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {

        int arr1[] = {1,3,5};
        int arr2[] = {2,4,6,8,10};


//     int resultArray[] =   mergeSortedArraysBruteForce(arr1,arr2);
//     printArray(resultArray);

       int [] resultArray =  mergeSortedArrays2(arr1,arr2);
       printArray(resultArray);

    }


    private static int[] mergeSortedArraysBruteForce(int[] arr1, int[] arr2) {

     int m= arr1.length;
     int n= arr2.length;

     int [] mergedArray = new int[m+n];
     int mergeArrayLength = mergedArray.length;

     int i=0, j=0,k=0;

     while(i<m){
         mergedArray[k++] =arr1[i++];
     }

        while(j<n){
            mergedArray[k++] =arr2[j++];
        }

//     for (int i=0; i<m; i++){
//
//         mergedArray[k++]= arr1[i];
//     }
//
//        for (int i=0; i<n; i++){
//
//            mergedArray[k++]= arr2[i];
//        }

        Arrays.sort(mergedArray);

        return mergedArray;
    }


    private static int[] mergeSortedArrays2(int[] arr1, int[] arr2) {

        int m= arr1.length;
        int n= arr2.length;

        int [] mergedArray = new int[m+n];

        int i=0,j=0,k=0;

        while (i<m && j<n){
            if (arr1[i]<arr2[j]){
                mergedArray[k] =arr1[i];
                i++;
            } else{
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        // if array2 exhausted...
        while(i<m){
            mergedArray[k++] =arr1[i++];
        }

        // while array1 exhausted...
        while(j<n){
            mergedArray[k++]=arr2[j++];
        }

        return mergedArray;
    }



    private static void printArray( int [] arr){

        for (int element : arr){
            System.out.print(element +" ");
        }

    }

}

package Top100Problems;
/*
   Problem Statement: Given an array of integers. Find the Inversion Count in the array.

 Example :
 I/P  =>    arr[]:  8 7 6 1 9 5 6
 O/P  =>     13
 pairs of inversion : {{8,7},{8,6},{8,1},{8,5},{8,6},{7,6},{7,1},{7,5},{7,6},{9,5},{9,6}}

Conditions given ...
 1.  Inversion Occurs  if(i<j && arr[i]>arr[j])
 2.  Tells us the degree how usorted an array is
 3.  If array is already sorted then its inversion count will be 0.
 4.  If array is sorted in reversed order then its Inversion count will be maximum

1.  Our first approach will be using two nested loops in which will use two pointers and a count
    variable which will track the count of inversions in the array

     int count=0;
      for(int i=0;i<n-1;i++){
       for(int j=i+1;j<n;j++){

         if(arr[i]>arr[j]&&i<j){
            count++;
             // to print pairs
             sout("{"+ arr[i] + " " +arr[j]+"}");
         }
      }
     return count;
     }

 */

import java.util.ArrayList;
import java.util.List;

public class CountInversionsInArray {


    public static void main(String[] args) {

        int arr[]= {8,7,6,1,9,5,6};
        //int[] arr= {5,1,4};
        int ans= countInversion(arr);
        System.out.println(ans);

        System.out.println(countInversionsUsingMergeSort(arr));


    }

    private static int countInversion(int[] arr) {
     int count=0;
     int n=arr.length;

     for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(i<j && arr[i]>arr[j]){
                count++;
                System.out.print("{" +arr[i]+" " +arr[j]+"}"+" ");
            }
        }
    }
        System.out.println(" ");
     return count;
    }

       // Sove the problem Using MergeSort algorithm...
       private static int countInversionsUsingMergeSort(int[] arr) {

        return  countSubArrayInversion(arr,0, arr.length-1);
    }

     private static int countSubArrayInversion(int[] arr, int start, int end) {
        int count =0;
        int mid;

          if(end>start)
          {
              mid =  (end+start) / 2;
              int leftSubArrayInversions=countSubArrayInversion(arr,start,mid);
              int rightSubArrayInversions=countSubArrayInversion(arr,mid+1, end);
              int inversionDueToMerge=mergeSortInversionCount(arr,start,mid+1,end);
              count = leftSubArrayInversions+rightSubArrayInversions+inversionDueToMerge;
        }
       return count;
    }

    private static int mergeSortInversionCount(int[] arr, int start, int mid,int end) {
        List<Integer> sortedArray=new ArrayList<>();

         int left=start;
         int right=mid;
        int inversion=0;

         while ((left<=mid-1 )&& (right<=end)){

             if(arr[left]<=arr[right]){
                 sortedArray.add(arr[left]);
                 left++;
                } else{
                 // to check if arr[left]>middle+1 element then all elements present right to
                 // arr[i] are greater than middle+1
                inversion+= mid-left;
                sortedArray.add(arr[right]);
                right++;
             }

         }

         //copy the remaining elements in left sub array
         for(int index=left;index<mid;index++){
            sortedArray.add(arr[index]);
        }

        //copy the remaining elements in right sub array
        for(int index=right;index<end;index++){
            sortedArray.add(arr[index]);
        }

        //copy back merged elements to original array..
        for(int index=0;index<sortedArray.size();index++){
            int num=sortedArray.get(index);
            arr[start+index]=num;
        }

        return inversion;
    }

}

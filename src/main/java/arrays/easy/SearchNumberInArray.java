package arrays.easy;

import java.util.Arrays;

public class SearchNumberInArray {

    public static void main(String[] args) {

        int [] arr = {1,2,5,2,9,7,8,3,6};
        Arrays.sort(arr);
        // sorted array  : 1,2,2,3,5,6,7,8,9
        int target = 5;

      //System.out.println("The target is found at index: " +findTarget(arr,target));

        int result = searchTargetUsingBinarySearch(arr,target);

        if(result>0){
            System.out.println("target found at index: " +result);
        } else{
            System.out.println("target not present: " +result);
        }

    }


    // for binary search array must be sorted...
    private static int searchTargetUsingBinarySearch(int[] arr, int target) {

       int start =0;
       int end   =arr.length-1;

       while (start<=end){

           int mid= start +(end-start)/2;

           if(arr[mid]==target){
               return mid;
           } else if(arr[mid]>target){

               end =mid-1;
           }else {
               start = mid+1;
           }

       }
      return -1;
    }


    private static int findTarget(int[] arr, int target){

        int answer=-1;

        for(int i=0; i<arr.length; i++){

            if(arr[i]==target){
                answer=i;
                return answer;
            }

        }
        return answer;
    }

}

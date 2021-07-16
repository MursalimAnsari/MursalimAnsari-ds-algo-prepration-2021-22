package SlidingWindow;

/*
*   SubArray: Part of array which is contiguous
*   Example arr[]:  1 3 4 6 1 4 2 8 9
*   Sub array =  {1} {1,3} {1,3,4,6} etc.
*   Not Sub Array {1,4,6,9}
*
*   Problem Statement :  given an array of size n and positive and negative elements stored in it
*   and we to find the sub array of size k whose sum is maximum...
*
*   I/P  arr[]: 3 5 6 8 10 8 2  k=3
*   O/P  26 sub array :  {8,10,8}
*
*   1st Approach :  use two nested loops and find maximum sum of sub array of size k
*   2nd Approach : we can optimize this using sliding window technique
*/




public class MaximumSumContiguousSubArrayOfSizeK {


    public static void main(String[] args) {

       // int[] arr = {3, 5, 6, 8, 10, 8, 2};

        int[] arr ={2, 5, 1, 8, 2, 9, 1};
        int k=3;

       int ans= maximumContiguousSubArraySum(arr,k);
        System.out.println(ans);


    }

    private static int maximumContiguousSubArraySum(int[] arr, int k) {

        int sum=0;
        int n=arr.length;

        for(int i=0;i<n-k;i++){
            int s=0;
            for (int j=i;j<i+k;j++){
                s+=arr[j];
            }
            sum= Math.max(s,sum);
        }

    return sum;
    }


}

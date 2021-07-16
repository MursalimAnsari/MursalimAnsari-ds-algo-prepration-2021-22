package Top100_Problems;

/*
 *  Maximum contiguous sub array sum
 *  problem statement : given an array of size n which contains negative and non negative elements and we have to find the sub array which is having maximum sum
 *  Example :  arr[]: 2 -4 1 9 -6 7 -3   maximum sum is 11 {1,9,-6,7}
 *  Array must contains at least one positive integer
 *  1=> if array has all negative elements : then compare all elements and which has smallest negative sum that will be our max sum
 *  2=> if all elements are positive then find sum from 0 to arr.length-1 that will be our expected sum
 * 1st Approach : using three nested loops
 * 2nd Approach : using two nested loops
 * 3rd Approach : using divide and conquer method
 * 4th Approach : using dynamic programming algorithm Or kadane algorithm
 * */



public class MaximumContiguousSubArraySum {

    public static void main(String[] args) {

       int[] arr = {2, -4, 1, 9, -6, 7, -3};
        //int arr[] ={-1,-2,-3,-4,-5};
        // int[]  arr= {1,2,3};
//        int ans=  maximumContiguousSubArraySumBruteForce(arr);
//        System.out.println(ans);
//        printAllSubArrays(arr);
//        int answer = maxContiguousSubArraySumUsingTwoLoops(arr);
//        System.out.println(answer);
//
//        int res = maxContiguousSubArrayWithKadaneAlgorithm(arr);
//        System.out.println(res);


    }




    private static void printAllSubArrays(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print("{" + arr[k] + "}");
                }
                System.out.println();
            }
        }
    }


    private static int maximumContiguousSubArraySumBruteForce(int[] arr) {
        int n = arr.length;
        int max_sum = Integer.MIN_VALUE;

        // time complexity O(n^3)

             for (int i = 0; i < n; i++) {
              for (int j = i; j < n; j++) {
                   int sum = 0;
                  for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                max_sum = Math.max(sum, max_sum);
            }
        }
       return max_sum;
      }


      // we can find max sum using only to nested loops..

    private static int maxContiguousSubArraySumUsingTwoLoops(int[] arr) {
         int n=arr.length;
        int[] curr_sum= new int[n+1];

        curr_sum[0]=0;
            for(int i=1;i<=n;i++) {
                curr_sum[i] = curr_sum[i - 1] + arr[i - 1];
            }
            int max_sum=Integer.MIN_VALUE;

            for(int i=1;i<=n;i++){
                 int sum=0;
                for (int j=0;j<i;j++){
                 sum = curr_sum[i]-curr_sum[j];
                 max_sum = Math.max(sum,max_sum);
                }
            }
            return max_sum;

    }

    // using kadane's algorithm

    private static int maxContiguousSubArrayWithKadaneAlgorithm(int[] arr) {
        // initialize a variable local curr_sum and assign 0 to it.
        // initialize max_sum and assign 0 to it.
        // traverse the array and update curr_sum to arr[i]
        // check curr_sum<0 if t holds the condition then assign 0 to curr_sum .
        // come out of loop and check max_sum= maximum(max_sum,curr_sum) and return max_sum

        int n= arr.length;
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            curr_sum += arr[i];
            if(curr_sum<0){
                curr_sum=0;
            }

            max_sum = Math.max(curr_sum,max_sum);
        }
        return  max_sum;
    }



}

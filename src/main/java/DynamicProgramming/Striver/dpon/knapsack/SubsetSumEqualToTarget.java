package DynamicProgramming.Striver.dpon.knapsack;


/*
    A subset/subsequence is a contiguous or non-contiguous part of an array,
    where elements appear in the same order as the original array.
    For example, for the

      array: [2,3,1] , the subsequences will be [{2},{3},{1},{2,3},{2,1},{3,1},{2,3,1}} but {3,2}
       is not a subsequence because its elements are not in the same order as the original array.

PROBLEM STATEMENT:
    We are given an array ‘ARR’ with N positive integers. We need to find if there is a subset in “ARR”
    with a sum equal to K.
    If there is, return true else return false.

  Example : arr : [1,2,3,4]
  Target :  6

  O/P : true

  because there is a subset
    [2,4] whose sum is 6

 */


import java.util.Arrays;

public class SubsetSumEqualToTarget {


    public static void main(String[] args) {

        int[] arr = {5,2,4,7,8,4,3};
        int target = 50;

        boolean ans = subsetSumEqualToKRecursion(arr,target);
        System.out.println(ans);

        boolean res = subsetSumEqualToKTabulation(arr,target);
        System.out.println(res);

    }


    // Recursive+Memoized solution
    //Time Complexity : O(n*k)
    // space complexity : O(n*k)+O(n)

    private static boolean subsetSumEqualToKRecursion(int[] arr, int target) {

        int n = arr.length;
        boolean[][] dp = new boolean[n+1][target+1];

       return help(arr, n-1, target,dp);
    }

    private static boolean help(int[] arr, int ind, int target, boolean[][] dp) {

       if(target==0)
           return true;

       if(ind==0) return arr[ind]==target;


       // save previous values present in the answer dp

        if(dp[ind][target]!=false) return dp[ind][target];

      // take
      boolean take = false;

      if(arr[ind]<=target)
      take = help(arr, ind-1, target-arr[ind],dp);


      // notTake
        boolean notTake = help(arr, ind-1, target, dp);

        return dp[ind][target]= take||notTake;
    }

    // tabulation method
    private static boolean subsetSumEqualToKTabulation(int[] arr, int target) {

        int n=arr.length;
        boolean[][] dp = new boolean[n][target+1];

         for (int i=0; i<n; i++){
             dp[i][0]=true;
         }
        if(arr[0]<=target)
            dp[0][arr[0]] = true;

     for(int ind=1; ind<n;ind++){
         for (int k=1; k<target+1;k++){

             boolean notTake = dp[ind-1][k];

             boolean take =false;

             if(arr[ind]<=k)
                 take = dp[ind-1][k-arr[ind]];

             dp[ind][k] = take||notTake;
         }
     }
        return dp[n-1][target];
    }

}

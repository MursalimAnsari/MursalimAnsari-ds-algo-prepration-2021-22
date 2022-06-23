package DynamicProgramming.Striver.dpon1D;

import java.util.Arrays;

public class MaximumSumNonAdjacentElements {

    public static void main(String[] args) {

        int[] nums = {1,2,5,8,11,9};
        int ans =  maxNonContiguousSum(nums);
        System.out.println();
        System.out.println(ans);
        System.out.println();
        int res=findMaxSumTabulation(nums);
        System.out.println(res);
    }

   //recursion : We can have all possible subsequences and then filter out there which subsequences have maximum sum
   //  with nonadjacent elements in the subsequences...
   // Time Complexity : O(2^n)
   // Space Complexity: O(2^n)
    private static int maxNonContiguousSum(int[] nums) {

        int n= nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        return help(nums, n-1,dp);
    }

    private static int help(int[] nums, int index, int[] dp) {

        // base condition

        if(index==0) return nums[index];
        if(index<0) return 0;

        if(dp[index]!=-1) return dp[index];

        // pick
        int pick = nums[index]+help(nums, index-2, dp);

        // pick
        int notPick = 0+help(nums, index-1, dp);

        return dp[index]=Math.max(pick,notPick);
    }

    // tabulation
    // Time Complexity : O(n)
    // Space Complexity: O(n)
private static int  findMaxSumTabulation(int[] nums){

        int n= nums.length;
        int[] dp = new int[n];

    int pick = Integer.MIN_VALUE;
    int notPick= Integer.MIN_VALUE;

        dp[0]= nums[0];

        for(int i=1; i<nums.length; i++){


          pick = nums[i];

                  if(i>1)
                pick  += dp[i-2];

          notPick = dp[i-1];

          dp[i]= Math.max(pick, notPick);
        }

    return dp[n-1];
}

}

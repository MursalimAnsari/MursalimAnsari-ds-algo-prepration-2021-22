package DynamicProgramming.Striver;

/*
    In this problem we are given with the length of rod N, and we have to divide the rod into n no of
    pieces and sell in the market to achieve the maximum profit...

 approach :  we can solve this problem similarly by the subsequences method


 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RodCutting {


    public static void main(String[] args) {

        int N= 5;

        int[] price = {2,5,7,8,10};

      int res=   cutRod(price,N);
        System.out.println(res);
    }


    private static int cutRod(int[] price, int n) {

        // express in terms of indices and solve the problem
       // return f(price, n-1, n);

         int [][] dp = new int[n][price.length+1];


        return fDp(price,n-1,n, dp);
    }


    // memoization...
    private static int fDp(int[] price, int index, int n, int[][]dp) {

        // base case
        if(index==0)
        {
            return n*price[0];
        }

        // base case
        if(dp[index][n]!=-1){
            return dp[index][n];
        }


        int notTake = 0+fDp(price, index-1, n, dp);

        int take = Integer.MIN_VALUE;

        int rodLength = index+1;

        if(rodLength<=n){
            take = price[index]+fDp(price, index, n-rodLength, dp);
        }

        return dp[index][n]= Math.max(take, notTake);

    }



    // recursive solution
    private static int f(int[] price, int index, int n) {

        // base case
        if(index==0)
        {
            return n*price[0];
        }

        int notTake = 0+f(price, index-1, n);

        int take = Integer.MIN_VALUE;

        int rodLength = index+1;

        if(rodLength<=n){
            take = price[index]+f(price, index, n-rodLength);
        }

     return Math.max(take,notTake);

    }

}

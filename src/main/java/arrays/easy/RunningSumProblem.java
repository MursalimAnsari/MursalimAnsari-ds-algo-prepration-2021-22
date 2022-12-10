package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class RunningSumProblem {

    public static void main(String[] args) {

        int arr[] = {1,2,5,4,7};

        int[] ans =findRunningSum(arr);

       for(int i=0; i<ans.length; i++){

           System.out.print(ans[i]+" ");
       }
    }

    private static int[] findRunningSum(int[] arr) {

        int n=arr.length;
        int [] result = new int[n];

        result[0] = arr[0];

        for(int i=1; i<n; i++){

            result[i] = result[i-1]+arr[i];
        }

       return result;

    }

}

package Top100_Problems;

/*

Given an array of integers nums and an integer target, return indices of the two numbers such that
they add up to target. You may assume that each input would have exactly one solution, and you may
not use the same element twice.

You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Input: nums = [3,3], target = 6
Output: [0,1]


 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static void main(String[] args)  {

        int arr[] = {2,3,8,7,11,15,99};
        int target = 22;

//         int [] result =  findSumUsingBruteForce(arr,target);
//         System.out.println("first index : " +result[0] +" , "+ "second index : " +result[1]);

//        int [] result=    findSumHashMap(arr,target);
//        System.out.println("first index : " +result[0] +" , "+ "second index : " +result[1]);



    }



    public static int []  findSumUsingBruteForce(int [] arr, int target) {

       // int ans[] = new int[2];
        int n=arr.length;

        for(int i=0; i<n; i++){ // 2,7,11,15 , target = 13

           for(int j=i+1; j<n; j++){

               if(arr[i]+arr[j]==target){
                    return new int[] {i,j};
               }

           }
        }
        return new int[]{};
    }


    // TIME COMPLEXITY O(N+N), SPACE COMPLEXITY O(N)
    private static int[] findSumHashMap(int[] arr, int target) {

        int n= arr.length;

        // map<key, value>
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++){
            map.put(arr[i],i);
        }

        for(int i=0; i<n; i++){

            if(map.containsKey(target-arr[i])){
               int secondNumber = target - arr[i];
                if(map.containsKey(secondNumber)){
                    return new int[]{i, map.get(secondNumber)};
                }
            }

        }

    return new int[]{};
    }

}

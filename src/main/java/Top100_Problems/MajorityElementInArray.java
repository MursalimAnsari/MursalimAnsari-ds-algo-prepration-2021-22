package Top100_Problems;


/*
        Given an array nums of size n, return the majority element.
        The majority element is the element that appears more than ⌊n / 2⌋ times.
        You may assume that the majority element always exists in the array.

        Input: nums = [2,2,1,1,1,2,2]
        Output: 2

        Input : nums = [1,2,3,4,3,3,]
        Output : no majority element


     1=> using nested loops





 */


import java.util.HashMap;
import java.util.Map;

public class MajorityElementInArray {

    public static void main(String[] args) {

        int [] nums = {2,1,1,1,2,2};
        // int [] nums = {1,2,3,4,3,3,3};
        int n = nums.length;

//        int ans = majorityElementBruteForce(nums, n);
//        System.out.println(ans);


//        int ans =   majorityElementUsingHashMap(nums, n);
//        System.out.println(ans);

         int ans  =  mejorityCountBoyerMoore(nums, n);
        System.out.println(ans);
    }

    private static int  mejorityCountBoyerMoore(int[] nums, int n) {

           int count =0;
           int candidate =0;

           for (int num : nums){

               if(count==0){
                   candidate = num;
               }
               if (candidate==num){
                   count +=1;
               } else {
                   count -=1;
               }
           }
           return candidate;
    }

    private static int majorityElementUsingHashMap(int[] nums, int n) {

        int majorityCount = n/2;

         Map<Integer,Integer> map = new HashMap<>();

         map.put(nums[0],1);

         int maxFrequency = 1;
         int maxElement = nums[0];


         for (int i=1; i<nums.length; i++){

             boolean keyExist = map.containsKey(nums[i]);
             if (keyExist){
                 int existingFreq = map.get(nums[i]);
                 map.put(nums[i],existingFreq+1);
             } else {
                 map.put(nums[i] ,1);
             }

             int fre = map.get(nums[i]);
             if(fre>maxFrequency){
                 maxFrequency = fre;
                 maxElement = nums[i];
             }

         }

         if(maxFrequency>majorityCount){
             return maxElement;
         }

        return -1;
    }

    private static int  majorityElementBruteForce(int[] nums, int n) {

      int majorityCount = n/2;

      for (int num : nums){
          int count =0;

          for (int ele : nums){
              if (ele==num){
                  count+=1;
              }
          }
          if (count>majorityCount){
              return num;
          }
      }
        return -1;
    }



    // Boyer Moore voting machine





}

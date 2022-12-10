package arrays.easy;

import java.util.Arrays;

public class RepeatingNumberInArray {


    public static void main(String[] args) {

      int[] nums = {3,1,3,4,2};

         // using sorting
        System.out.println(findRepeatingNumberUsingSorting(nums));

        // using hashing
        System.out.println(findRepeatingNumberUsingHashing(nums));

        // using fast and slow pointer method
        System.out.println(findRepeatingNumberUsingFast_Slow_Pointer(nums));

    }

    // Time Complexity  O(nlogn)  ::  Space Complexity O(1)
    private static int findRepeatingNumberUsingSorting(int[] nums) {

        Arrays.sort(nums);

        for (int i=0; i<nums.length; i++){
            if(nums[i]==nums[i++]){
                return nums[i];
            }
        }
      return 0;
    }

    // Time Complexity  O(n)  ::  Space Complexity O(n)
    private static int findRepeatingNumberUsingHashing(int[] nums) {

        int [] count= new int[nums.length+1];

        for(int i=0; i<nums.length; i++){

            count[nums[i]]++;

        }

        for(int i=1; i<nums.length;i++){

            if(count[i]>1){
                return i;
            }
        }

    return 0;

  }


    // linked list cycle method ...
    // Time Complexity O(n) ::  Space Complexity O(1)
    private static int findRepeatingNumberUsingFast_Slow_Pointer(int[] nums) {

       int slow = nums[0];
       int fast = nums[0];

       do {
           slow =nums[slow];

           fast = nums[nums[fast]];
       }  while(slow!=fast);

       fast = nums[0];


       while(slow!=fast){
            slow= nums[slow];
            fast=nums[fast];
       }
       return slow;
    }

}

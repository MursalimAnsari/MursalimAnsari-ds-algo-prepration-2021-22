package BinarySearch;

/*
     FACEBOOK PROBLEM...

    Given an array of integers nums sorted in ascending order, find the starting and ending
    position of a given target value. If target is not found in the array, return [-1, -1].
    You must write an algorithm with O(log n) runtime complexity.

    EXAMPLE 1:
    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]

    EXAMPLE 2:
    Input: nums = [5,7,7,8,8,10], target = 6
    Output: [-1,-1]

    EXAMPLE 3:
    Input: nums = [], target = 0
    Output: [-1,-1]

*/



public class FirstAndLastPositionOfElement {


    public static void main(String[] args) {

       int [] nums = {1,2,3,5,7,7,7,7,8,8,9,11,12,15};
         // int[] arr = {1,2,3,4,5,6,7,8,9};
           int target =10;
//        int target = 7;

        //int[] ans = findFirstAndLastPosition(arr, target);
        //binary search
        int[] ans= searchRange(nums, target);

        for (int an : ans) {
            System.out.print(an + " ");
        }


    }


    // using only two for loops
    private static int[] findFirstAndLastPosition(int[] arr, int target) {
         int first = -1;
         int last = -1;
         int[] res = new int[2];

          for(int i=0;i<arr.length;i++){
             if(arr[i]==target) first = i;
         }

          for(int j=arr.length-1;j>0;j--){
              if(arr[j]==target)
               last = j;
             }
           res[0] = first;
           res[1] = last;


          return res;
    }


    // binary search solution...
    // TC => O(logn)
    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
        int first = search(nums, target, true);
        int last = search(nums, target, false);

        ans[0]= first;
        ans[1]= last;

        return ans;
    }

    // helper method to search element
    public static int search(int[] nums, int target, boolean findStartIndex){

        int ans = -1;

        int start= 0;
        int end= nums.length-1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(target<nums[mid]){
                end = mid-1;
            } else if(target>nums[mid]){
                start = mid+1;
            } else{
                // potential answer...
                ans = mid;
                if(findStartIndex)
                    end= mid-1;
                else
                    start = mid+1;
            }
        }
        return ans;
    }

}

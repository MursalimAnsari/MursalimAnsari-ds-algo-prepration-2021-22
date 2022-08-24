package BinarySearch;
/*

   Ceiling Number in sorted Array....
   arr[] :   1 4 5 6 7 12 14 16
   element :  10
   Ceiling Value :  The smallest value greater or equal to the given number...
   O/P :12
   Floor Value : The largest value smaller or equal to the given number...
   O/P :7

 */

public class CeilingAndFloorElement {

    public static void main(String[] args) {
        int [] nums = {1,4,5,6,7,12,14,16};
        int target = 10;
        int ans = ceilingElement(nums , target);
        System.out.println( "The Ceiling Element is " +ans);

        int res = floorElement(nums , target);
        System.out.println( "The Floor Element is " +res);
    }

    private static int ceilingElement(int[] nums, int target) {

        int s = 0;
        int e = nums.length-1;


        if(target > nums[nums.length-1]){
            return -1;
        }

        while(s<=e){
            int mid = s + (e-s)/2;

            if(target==nums[mid]) return mid;

            if(target < nums[mid]) {
                e= mid-1;
            } else{
                s = mid+1;
            }
        }
        return s;
    }


    private static int floorElement(int[] nums, int target) {

        int s = 0;
        int e = nums.length-1;

        if(target>nums[nums.length-1]){
            return -1;
        }

        while(s<=e){
            int mid = s + (e-s)/2;

            if(target==nums[mid]) return mid;

            if(target < nums[mid]) {
                e= mid-1;
            } else{
                s = mid+1;
            }
        }
        return e;
    }

}

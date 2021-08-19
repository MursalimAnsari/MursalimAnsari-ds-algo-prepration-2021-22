package BinarySearch;

/*
   ###### ASKED IN AMAZON INTERVIEW

  Find position of an element in a sorted array of infinite numbers
   Array will be sorted...

  #### NOTE : We will never use the length of the array hence it will be treated as infinite array...

   EXAMPLE :

   arr[] : [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,...]  Infinite elements...
   target : 50;

   Algorithm...

   1: find chunks of elements in the array
   e.g  1,2
     if find element then return true..
     else
     chunk*2
     i.e  2*2 = 4 elements again apply binary search
     if find true
     else increase chunk size
     2*4 = 8 elements...
     and so on till finds the element

 */


public class PositionOfElementInInfiniteArray {

    public static void main(String[] args) {
        int[] nums = {1,45,56,88,99,122,456,678,998,1212,1444,5678,10000,11222};
        int target = 123;

        int ans= infiniteArrayElement(nums, target);
        System.out.println(ans);


    }

    private static int infiniteArrayElement(int[] nums, int target) {

        // first find range
        // first start with box of size 2

        int start =0;
        int end =1;

        // condition for target to lie in the range

        while (target>nums[end]){

            //new start
            int temp = end+1;

            // double the box size...
            // end = pre end + sizeOfBox*2

            end = end + (end-start+1)*2;
            start= temp;

        }

        return  binarySearch(nums, target);
    }

    private static int binarySearch(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(target==nums[mid]) return mid;

            if(target < nums[mid]) {
                e= mid-1;
            } else{
                s = mid+1;
            }
        }

        return -1;
    }


}


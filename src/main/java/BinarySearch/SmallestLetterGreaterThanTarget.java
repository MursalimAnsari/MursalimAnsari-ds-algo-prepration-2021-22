package BinarySearch;

public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {

        char[] nums = {'c','f','j'};
        char target = 'j';

       char ans = nextGreatestLetter(nums, target);
        System.out.println(ans);
    }


   private static char nextGreatestLetter(char[] nums, char target) {


        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;


            if (target < nums[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return nums[s % nums.length];

    }

}

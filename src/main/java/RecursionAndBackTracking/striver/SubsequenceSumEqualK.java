package RecursionAndBackTracking.striver;

import java.util.ArrayList;

public class SubsequenceSumEqualK {


    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,2};
         int k = 5;

        subsequenceSumK(nums,k);

    }

    private static void subsequenceSumK(int[] nums, int k) {

        int n= nums.length;
        ArrayList<Integer> ds = new ArrayList<>();

        // create a helper function
        findSubsequences(0, nums, ds, k, n, 0);

    }

    private static void  findSubsequences(int index, int[] nums, ArrayList<Integer> ds, int k, int size, int sum){

        //base condition
        if (index==size){

            if (k==sum){
                for (int it : ds){
                    System.out.print(it +" ");
                }
                System.out.println();
            }
            return;
        }

        // pick condition
        ds.add(nums[index]);
        sum += nums[index];
        findSubsequences(index+1,nums,ds,k,size,sum);

        //backtrack
        sum -= nums[index];
        ds.remove(ds.size()-1);

        //Not Pick Condition
        findSubsequences(index+1,nums,ds,k,size,sum);
    }

}

package RecursionAndBackTracking.striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {


    public static void main(String[] args) {


        int[] nums = {1,1,1,2,2};
//        int[] nums = {2};
         int target = 4 ;

        List<List<Integer>> result =  combinationSum(nums, target);

        for (List it : result){
            System.out.println(it);
        }
    }

    private static List<List<Integer>> combinationSum(int[] nums, int target) {

     List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

     findCombinationSum(0, nums, target, ans, new ArrayList<>());

   return ans;
    }

    private static void findCombinationSum(int index, int[] nums, int target, List<List<Integer>> ans, ArrayList<Integer> ds) {


        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
         }

           //pick condition
            for (int i=index; i<nums.length; i++){
                if (i > index && nums[i]==nums[i-1])
                    continue;
                if (nums[i]>target)
                    break;
                    ds.add(nums[i]);
                    findCombinationSum(i+1,nums,target-nums[i],ans,ds);
                    //backtrack
                    ds.remove(ds.size()-1);
                }
            }

       }

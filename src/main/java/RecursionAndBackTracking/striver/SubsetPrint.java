package RecursionAndBackTracking.striver;

import java.util.ArrayList;
import java.util.List;

public class SubsetPrint {
    public static void main(String[] args) {

        int[] nums = {1, 2, 2};

        List<List<Integer>>result = subsetsIterative(nums);

        for(List<Integer> list : result){
            System.out.println(list);
        }
    }

    private static List<List<Integer>> subsetsIterative(int[] nums) {

        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        for (int num : nums){
            int n= subsets.size();

            for (int j=0;j<n;j++){
                List<Integer> temp = new ArrayList<>(subsets.get(j));
                temp.add(num);
                subsets.add(temp);
            }
        }
          return subsets;
    }

    // print all subsets using bitwise operators
    // TIME COMPLEXITY : O(2^n * n)
    private static List<List<Integer>> subsets( int[] nums){

        int n = nums.length;

        int subset_count = (1 << n);

        List<List<Integer>> subsets = new ArrayList();

        for (int mask = 0; mask < subset_count; ++mask) {
            List<Integer> subset = new ArrayList();

            for (int i = 0; i < n; ++i) {
                if (((mask >> i) & 1) != 0) {
                    subset.add(nums[i]);
                }
            }

            subsets.add(subset);
        }

        return subsets;
    }


}

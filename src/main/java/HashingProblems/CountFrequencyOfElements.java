package HashingProblems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfElements {


    public static void main(String[] args) {
        int [] nums = {1,2,32,1,3,1,42,4,2,4,2,1,1,3,2,2};

        countElementFrequencyUsingHashing(nums);
    }

    private static void countElementFrequencyUsingHashing(int[] nums) {

        int n=nums.length;

        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for (int i=0; i<n; i++){

            if(frequencyMap.containsKey(nums[i])){
                frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i],0)+1);
            } else {
                frequencyMap.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer,Integer>entry : frequencyMap.entrySet()){
            System.out.println(entry.getKey() + " occur " + entry.getValue() + " times");
        }
    }

    private static void countElementFrequency(int [] nums) {

    int size = nums.length;
    boolean [] frequency = new boolean[size];
        Arrays.fill(frequency, false);

        for (int i=0; i<size; i++){
            if (frequency[i]==true)
                continue;
            int count =1;
            for (int j=i+1; j<size; j++){
                if(nums[i]==nums[j]){
                    frequency[j]=true;
                    count++;
                }
            }
            System.out.println(nums[i]+ " occurs " +count +" times");
        }
    }


}

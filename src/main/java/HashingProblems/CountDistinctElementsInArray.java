package HashingProblems;

import java.util.*;

public class CountDistinctElementsInArray {


    public static void main(String[] args) {

        int [] arr = {2,4,1,4,5,354,3,3,44,6,57,768,6,565,5};
        int n= arr.length;
        int res = countDistinctElementsHashing(arr, n);
        System.out.println(res);

    }


    // Time Complexity O(n)
    // Space Complexity O(n)
    private static int countDistinctElementsHashing(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();

        for (int i=0; i<n; i++){
                 set.add(arr[i]);
            }

    return set.size();
    }



    //TIME COMPLEXITY O(n*logn)
    // Space Complexity O(1)
    private static int countDistinctElements(int[] arr, int n){
        int count =1;
        Arrays.sort(arr);

        for (int i=0; i<n-1; i++){

            if (arr[i]!=arr[i+1]){
                count=count+1;
            }
        }

        return count;
    }

}

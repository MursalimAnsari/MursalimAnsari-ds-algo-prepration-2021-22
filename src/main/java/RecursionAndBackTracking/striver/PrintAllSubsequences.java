package RecursionAndBackTracking;

/*
     Subsequence : A Subsequence is a sequence in which elements are in an order.
                    Subsequence can be contiguous or non-contiguous

           All Subsequences: {2,1,3}   --> {},{2},{1},{3},{2,1},{2,3},{1,3},{2,1,3};
           A SubArray can be a subsequence but a subsequence cannot be SubArray...


           TIME COMPLEXITY --> O(2^n) Using recursion

 */


import java.util.ArrayList;

public class PrintAllSubsequences {

    public static void main(String[] args) {

        int arr[] = {2,1,3};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        subsequencePrint(0,list, arr, n);
        
    }

    private static void subsequencePrint(int index, ArrayList<Integer> list, int[] arr, int n) {

                if(index==n){
                    for (int auto : list){
                        System.out.print(auto +" ");
                    }
                    if(list.size()==0){
                        System.out.println("{}");
                    }
                    System.out.println();
                    return;
                }

        // take the particular index to subsequence
         list.add(arr[index]);
         subsequencePrint(index+1,list,arr,n);
         list.remove(list.size()-1);

        // Not Pick
        subsequencePrint(index+1,list,arr,n);

    }
}

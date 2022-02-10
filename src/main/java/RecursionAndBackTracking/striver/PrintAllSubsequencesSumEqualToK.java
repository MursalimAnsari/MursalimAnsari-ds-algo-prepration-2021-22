package RecursionAndBackTracking.striver;

import java.util.ArrayList;

public class PrintAllSubsequencesSumEqualToK {


    public static void main(String[] args) {

        int arr[] = {1,2,1,2,1};
        int n = arr.length;
        int sum =2;
        ArrayList<Integer> list = new ArrayList<>();

        //subsequenceSumPrint(0,list,0, sum, arr, n);
        //onlySubsequenceWithSumK(0,list,0,sum,arr,n);

        System.out.println(countSubsequencesSumEqualK(0,0,sum,arr,n));

    }

    private static void subsequenceSumPrint(int index, ArrayList<Integer> list,int s,int sum ,int[] arr, int n) {

        if(index==n){
            if(s==sum){
//                for (int auto : list)
//                    System.out.print(auto +" ");
//                    System.out.println();

                System.out.println(list +" ");

            }
                return;
            }

        // take the particular index to subsequence
        //pick
        list.add(arr[index]);
        s+=arr[index];
        subsequenceSumPrint(index+1,list,s,sum,arr,n);
        s-=arr[index];
        list.remove(list.size()-1);

        // Not Pick
        subsequenceSumPrint(index+1,list,s,sum,arr,n);
    }

    // Return the only subsequence whose sum is k

    private static boolean onlySubsequenceWithSumK(int index, ArrayList<Integer> list, int s, int sum, int[] arr, int n) {

        if(index==n) {
            if(s==sum){
                System.out.println(list +"");
                return true;
            } else {
                return false;
            }
        }

        list.add(arr[index]);
        s+=arr[index];
        if(onlySubsequenceWithSumK(index+1,list,s,sum,arr,n)==true) return true;
        s-=arr[index];
        list.remove(list.size()-1);

        if(onlySubsequenceWithSumK(index+1,list,s,sum,arr,n)==true) return true;

        return false;
    }


    // count all subsequences whose sum is k
    private static int countSubsequencesSumEqualK(int index, int s, int sum, int[] arr, int n) {

        // base case
        if(s>sum) return 0;
        //base case
        if(index==n){
            if(s==sum) {
                return 1;
            } else{
                return 0;
            }
        }

        //pick
        s+=arr[index];
        int left = countSubsequencesSumEqualK(index+1,s,sum,arr,n);
        s-=arr[index];

        //Not Pick
        int right = countSubsequencesSumEqualK(index+1,s,sum,arr,n);

        return left+right;
    }

}

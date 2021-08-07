package RecursionAndBackTracking;

public class ReverseArrayUsingRecursion {


    public static void main(String[] args) {


        int [] arr = {1,3,8,5,3,6};
        int i=0;
        int n=arr.length;

        reverseArrayUsingRecursion(arr,i,n);
    }

    private static void reverseArrayUsingRecursion(int[] arr, int i, int n ) {

         //base case
          if(i>=n/2) return;

        swap(arr[i],arr[n-i-1]);
        reverseArrayUsingRecursion(arr, i+1,n-i-2);
    }

    private static void swap(int i, int i1) {
        int temp =i;
        i=i1;
        i1=temp;
    }
}

package RecursionAndBackTracking;

public class ReverseArrayUsingRecursion {


    public static void main(String[] args) {


//        int [] arr = {1,2,3,4,5};
        int[] arr= {2,5,7,1};
        int i=0;
        int n=arr.length;

        reverseArrayUsingRecursion(arr,i,n-1);
        printArray(arr,n);

    }

    private static void reverseArrayUsingRecursion(int[] arr, int i, int n ) {

         //base case
         if(i>=n) return;

         int temp= arr[i];
         arr[i]=arr[n];
         arr[n]=temp;

        reverseArrayUsingRecursion(arr, i+1,n-i-1);
    }

    public static  void printArray(int[]arr, int n){
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

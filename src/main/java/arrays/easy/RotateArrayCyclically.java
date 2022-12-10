package arrays.easy;

public class RotateArrayCyclically {

    public static void main(String[] args) {

         int [] arr = {-1,-3,6,2,5,8};
         int k=2;

        System.out.println("before rotating array: ");
          printArray(arr);

        System.out.println();
          rotate_Array_Right_Method_one(arr, k);
        System.out.println("after rotating array by method one: ");
        printArray(arr);



        System.out.println();
        rotate_Array_Right_Method_Two(arr, k);
        System.out.println("after rotating array by method two: ");
        printArray(arr);

    }

    //TIME COMPLEXITY O(N+N)~O(N)
    private static void rotate_Array_Right_Method_Two(int[] arr, int k) {

        //for cycle greater than the size of array
        int n= arr.length;
        k = k%n;

        reversArray(arr,0,n-1);
        reversArray(arr,0,k-1);
        reversArray(arr,k,n-1);

    }

    private static void reversArray(int[] arr, int start, int end) {

        while(start<end){

            int temp   = arr[start];
            arr[start] = arr[end];
            arr[end]   = temp;
            start++;
            end--;
        }

    }

    //TIME COMPLEXITY :: O(n*k)
    private static void rotate_Array_Right_Method_one(int[] arr, int k) {

        int n = arr.length;

        k = k%n;

        for(int i=0 ; i<k; i++){
            left_Swap_By_One(arr);
        }
    }

    private static void left_Swap_By_One(int[] arr) {

        // for right swap just store arr[0] in temp and start iterating from 1 to n and swap elements...

        int n = arr.length;
        int temp = arr[n-1];

       for(int i=n-2; i>=0; i--){
          arr[i+1] = arr[i];
        }

      arr[0] = temp;

    }

    public static  void printArray(int[] nums){

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] +" ");
        }
    }

}

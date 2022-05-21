package BinarySearch;

public class BinarySearch {


    public static void main(String[] args) {


        int[] arr = {2,3,4,5,6,7,8,9,11,33,45};
          //int target = 9;
          int target = 6;

//        int ans = binarySearchIterative(arr , target);
//        System.out.println(ans);
        int s= 0;
        int e = arr.length-1;

        int res =  binarySearchRecursive(arr , target, s, e);
        System.out.println(res);


    }



    // Recursive Solution
    private static int  binarySearchRecursive(int[] arr, int target , int s, int e) {


         int mid = s + (e-s)/2;

         if(s>e) return -1;

         if(target == arr[mid] )
             return mid;


         if(target>arr[mid]) {
             return binarySearchRecursive(arr, target, mid + 1, e);
         }
           return  binarySearchRecursive(arr, target, s, mid-1);
    }

    // Iterative solution
    private static int binarySearchIterative(int[] arr , int target) {

        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target == arr[mid]) return mid;

            if (target < arr[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return -1;
    }

}

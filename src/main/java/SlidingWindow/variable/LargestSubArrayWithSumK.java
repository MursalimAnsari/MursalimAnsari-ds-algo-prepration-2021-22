package SlidingWindow.variable;

public class  LargestSubArrayWithSumK{

    public static void main(String[] args) {

      // int arr[]= { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
         int arr[]={4,1,1,1,2,3,5};
         int k=5;

        System.out.println(largestSubArrayWithSumK(arr,k));

        System.out.println(largestSubArrayWithSumKSlidingWindow(arr,k));

    }


    private static int largestSubArrayWithSumK(int[] arr, int k) {
        //  arr [] :  4 1 1 1 2 3 5
        //  k=5
        // sub arrays with k =5   {4,1}, {1,1,1,2},{2,3},{5}  largest sub array = {1 1 1 2} len=4

        int n = arr.length;
        int len = 0;
        int max_len = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == k) {
                    len = j - i + 1;
                    max_len = Integer.max(len, max_len);
                }
            }
        }
        return max_len;
    }


    private static int largestSubArrayWithSumKSlidingWindow(int[] arr, int k) {
        //  arr [] :  4 1 1 1 2 3 5
        //  k=5
        // sub arrays with k =5   {4,1}, {1,1,1,2},{2,3},{5}  largest sub array = {1 1 1 2} len=4

        int n =arr.length;
        int i=0,j=0;
        int max_len = Integer.MIN_VALUE;
        int sum =0;

        while (j<n){
          sum+=arr[j];

          if(sum<k){
              j++;
          } else if (sum==k){
              int window = j-i+1;
              max_len = Integer.max(max_len,window);
              j++;
          } else if (sum>k){
              sum-=arr[i];
              i++;
              j++;
          }

        }
        return max_len;
    }

}
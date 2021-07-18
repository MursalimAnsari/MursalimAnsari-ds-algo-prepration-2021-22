package SlidingWindow.fixed;

public class FirstNegativeInWindowOfSizeK {

    public static void main(String[] args) {

        int [] arr={2,3,1,-4,4,-5,7,-1,5};
        int k=3;


           firstNegativeIntegerInWindow(arr,k);
    }

    private static  void firstNegativeIntegerInWindow(int[] arr, int k) {
         int n= arr.length;
        int res[] = new int[n];

        //{2,3,-1,-4,4,-5,7,-1,5} =>

      for(int i=0;i<n-k+1;i++){

          for(int j=i;j<i+k;j++) {

              if (arr[j] < 0) {
                  System.out.print(arr[j] + " ");
                  break;
              }

          }
      }
    }

}

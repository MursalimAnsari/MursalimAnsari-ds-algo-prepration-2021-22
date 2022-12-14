package arrays.easy;

public class MoveZeroesToEnd
{

    public static void main(String[] args) {

        int [] arr = {0,1,0,3,12};

//       int ans[] =  moveZeroes(arr);
//       printArray(ans);

        int [] ans = move_Zeroes_Method_Two(arr);
        System.out.println("moving zeroes to end using two pointer");
        printArray(ans);

    }



    //TIME COMPLEXITY :: O(3n) SPACE COMPLEXITY :: O(n)
    private static int[] moveZeroes(int[] arr) {

      int n= arr.length;
      int[] result = new int[n];

      int x=0;

      for (int i=0; i<n; i++){
          if(arr[i]!=0){
              result[x++] = arr[i];
          }
      }

      for(int i=0; i<n; i++){

          if(arr[i]==0){

              result[x++] = arr[i];
          }
      }

      for (int i=0; i<n; i++){
          arr[i] = result[i];
      }

     return result;
    }

    //TIME COMPLEXITY :: O(n) SPACE COMPLEXITY :: O(1)
    private static void printArray(int[] ans) {

        for (int x : ans){
            System.out.print(x+" ");
        }

    }


    private static int[] move_Zeroes_Method_Two(int[] arr) {


        int n= arr.length;
        int left =0, right=0;

        while(right<n){

            if(arr[right]==0){
                right++;
            } else{
                swap(arr,left,right);
                right++;
                left++;
            }
        }

      return arr;
    }

    private static void swap(int[] arr, int left, int right) {

        int temp =arr[left];
        arr[left]=arr[right];
        arr[right]= temp;
    }


}


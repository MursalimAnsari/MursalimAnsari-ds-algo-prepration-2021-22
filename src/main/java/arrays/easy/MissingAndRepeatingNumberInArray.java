package arrays.easy;

public class MissingAndRepeatingNumberInArray {

    public static void main(String[] args) {

     int[] arr = {4,6,3,2,1,1};

        //int [] result =  findMissingAndRepeatingNumberUsingHashing(arr);
        int [] result =  findMissingAndRepeatingNumberUsingSwapSortMethod(arr);
        System.out.println("missing number: "+result[0] + " , " +"repeating number: " +result[1] );

    }

    private static int[] findMissingAndRepeatingNumberUsingSwapSortMethod(int[] arr) {

          int ans[] = new int[2];

              // ans[1] -> repeating
             //  ans[0] -> missing

           for(int i=0; i< arr.length; i++){

               int element = Math.abs(arr[i]-1);

               if(arr[element]<0){
                   //repeating number
                   ans[1] = element-1;
               } else{

                   arr[element] *= -1;
               }
           }

     for(int i=0; i<arr.length; i++){

         if(arr[i]>0){
             ans[0] = i+1;
         }

     }

     return  ans;
    }


    private static int[] findMissingAndRepeatingNumberUsingHashing(int[] arr) {

        int  n =arr.length;
        int [] ans   = new int[2];
        int [] count = new int[n+1];


        for(int i=0; i<n; i++){

            count[arr[i]]++;
        }

        for (int i=1; i<count.length; i++){

            if(count[i]==0){
                ans[0]= i;
            }

            if(count[i]>1){
                ans[1]=i;
            }
        }

        return ans;

    }


}

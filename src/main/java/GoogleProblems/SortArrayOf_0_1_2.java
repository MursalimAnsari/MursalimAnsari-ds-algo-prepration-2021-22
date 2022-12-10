package GoogleProblems;

class SortArrayOf_0_1_2{

    public static void main(String[] args) {

        int[] nums= {1,0,2,0,1,0,2,0,2,1,0};

          int [] result = sortColors(nums);

          for (int element : result){

              System.out.print(element + " ");
          }

    }


    public static int[] sortColors(int[] nums) {

        int count_0=  0;
        int count_1=  0;
        int count_2=  0;



        for(int i=0; i<nums.length; i++){

            if(nums[i]==0)
                count_0 += 1;

            if(nums[i]==1)
                count_1 +=1;

            if(nums[i]==2)

                count_2 += 1;

        }


        int c=0;


        while(count_0>0){
            nums[c]=0;
            c = c+1;
            count_0 = count_0-1;
        }

        while(count_1>0){
            nums[c]=1;
            c = c+1;
            count_1 = count_1-1;
        }


        while(count_2>0){
            nums[c]=2;
            c = c+1;
            count_2 = count_2-1;
        }

     return nums;

    }




    // solution 2 :: using 3 pointers(Dutch national flag algorithm)
    public static int[] sortColorsUsingThreePointer(int[] arr) {

        int low=0;
        int mid=0;
        int high=arr.length-1;


        /*
       case1:   arr[mid]==0
                low++
                mid++

       case2:  arr[mid]==1
                mid++

       case3:  arr[mid]==2
                high--
       */

        while(mid<=high){

            if( arr[mid]==0)
            {
                swap(arr, low, mid);
                low++;
                mid++;
            }  else if( arr[mid]==2)
            {
                swap(arr, mid, high);
                high--;

            }   else{
                mid++;
            }
        }

      return arr;
    }


    public static void swap(int []arr, int i, int j){

        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]= temp;

    }

}
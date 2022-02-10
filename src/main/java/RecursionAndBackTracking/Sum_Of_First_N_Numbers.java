package RecursionAndBackTracking;


/*
    We can use a for loop but instead of a loop we will use recursion

    we can do it by two ways -->

  1.   by parameter method
  2.   by function

    n=4

    sum = 1+2+3+4  =>  10

 */

public class Sum_Of_First_N_Numbers {


    public static void main(String[] args) {
       int n=6;
       int sum=0;

       printSum(6,sum);
    }

    private static void printSum(int i, int sum) {

        //base case

        if(i<1){

            System.out.println(sum);
            return;
        }


        printSum(i-1,sum+i);
    }

}

package arrays.easy;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingNumberInArray {


    public static void main(String[] args) {


        int[] arr = {3, 1, 2, 5, 6, 7, 8, 9};

        //findMissingNumberUsingSet(arr);
        //System.out.println("missing number is: " +findMissingNumberUsingSumMethod(arr));
        System.out.println("missing number is: " + findMissingNumberUsingXorMethod(arr));
    }

    private static int findMissingNumberUsingXorMethod(int[] arr) {

        // xor all elements of array with xorArrayElement variable
       int xorArrayElement = arr[0];

       for(int i=1; i<arr.length; i++){

           xorArrayElement ^= arr[i];
       }

       int xorAllElement  = 1;

       // xor each element from natural numbers
       for (int i=2; i<=arr.length+1; i++){
           xorAllElement ^= i;
       }

       return  xorArrayElement^xorAllElement;

    }

    private static int findMissingNumberUsingSumMethod(int[] arr) {
        int length = arr.length+1;

        int sum = (length *(length+1))/2;

        for (int i=0; i<arr.length; i++){
            sum -=arr[i];
        }

        return sum;
    }


    //TIME COMPLEXITY O(N)
    // SPACE COMPLEXITY O(N)
    private static void findMissingNumberUsingSet(int [] arr){

        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }


        for (int i=1; i< set.size(); i++){
            if(!set.contains(i)){
                System.out.println("missing number is: " +i);
            }
        }

    }

}



package arrays.easy.sorting;

import java.util.Random;

public class MergeSortImplementation {

    public static void main(String[] args) {

        int[] arr = new int[1000];


        Random random = new Random();

        for (int i=0; i< arr.length; i++){

            arr[i] = random.nextInt(1000);

        }

       // int [] arr = {4,2,1,6,3,8,5,9};

          System.out.println("before sorting: ");
          printArray(arr);
          System.out.println();
          mergeSort(arr);
          System.out.println();
          System.out.println("after sorting: ");
          System.out.println();
          printArray(arr);
          System.out.println();


    }

    private static void mergeSort(int[] arr) {

        int length= arr.length;

         if (arr.length<2){
             return;
         }


         int mid =length/2;

         int leftHalf[] = new int[mid];
         int rightHalf[]= new int[arr.length-mid];

         for(int i=0; i < mid; i++){
             leftHalf[i] = arr[i];
         }

        for(int i=mid; i<arr.length; i++){
            rightHalf[i-mid] = arr[i];
        }


        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);

    }

    private static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {

         int leftSize= leftHalf.length;
         int rightSize= rightHalf.length;

         int i=0, j=0, k=0;

         while(i<leftSize && j<rightSize){
             if(leftHalf[i]<=rightHalf[j]){

                 arr[k] = leftHalf[i];
                 i++;
             } else{

                 arr[k] = rightHalf[j];
                 j++;
             }

             k++;
         }


         while (i<leftSize){
             arr[k] =leftHalf[i];
             i++;
             k++;
         }

         while (j<rightSize){
            arr[k] =rightHalf[j];
            j++;
            k++;
        }

    }


    public static void printArray(int [] arr){

        for(int i=0; i<arr.length;i++){
            System.out.print( arr[i] +" ");
        }

    }

}

package arrays.easy.sorting;

public class SortingAlgorithmsImplementation {

    public static void main(String[] args) {

          int [] arr = {5,3,1,6,4,7,9,8};

//        int arr [] =new int[1000];
//
//        for (int i=0; i<1000;i++){
//
//            arr[i] = i;
//        }

         System.out.println("Before sorting");
         printArray(arr);
        System.out.println();

//         bubble sort
//         System.out.println("bubble sorting :");
//         printArray( bubbleSortImplementation(arr));

//         //selection sort
//         System.out.println("selection sorting :");
//         printArray( selectionSortImplementation(arr))

         //selection sort
         System.out.println("insertion sorting :");
         printArray( insertionSortImplementation(arr));

    }



    // BUBBLE SORT ALGORITHM
    private static int[] bubbleSortImplementation(int[] arr) {

         for(int i=0; i<arr.length; i++){
             for(int j=i+1; j<arr.length; j++){

                 if(arr[i]>arr[j]){
                     swap(arr,i,j);
                 }
             }
         }

         return arr;

    }


    //SELECTION SORT ALGORITHM
    private static int[] selectionSortImplementation(int[] arr) {

        int n= arr.length;

        for (int i=0; i<n; i++){

            int iMin =i;

          for (int j=i+1; j<n-1; j++){

              if(arr[j]<arr[iMin]){
                  iMin = j;
              }

          }

          swap(arr,i, iMin);

        }

        return arr;
    }


    // INSERTION SORT

    private static int[] insertionSortImplementation(int[] arr) {

        int n = arr.length;


        for (int i=1; i<n; i++){

            int current = arr[i];
            int j= i-1;

            while (j>=0 && current<arr[j]){

                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] =current;

        }

        return arr;

    }





    public static void printArray(int [] arr){

        for(int i=0; i<arr.length;i++){
            System.out.print( arr[i] +" ");
        }

    }


    private static void swap(int[] arr, int i, int j) {

        int temp =arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }



}

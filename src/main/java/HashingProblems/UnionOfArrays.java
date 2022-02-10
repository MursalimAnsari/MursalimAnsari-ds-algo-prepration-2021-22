package HashingProblems;
/*
    Array Union :  Use Set
    Condition :   Arrays must be sorted
    int [] arr1 = {1,2,3};
    int [] arr2 = {1,3,5,6};

   Union           -->  [1,2,3,5,6]
   Intersection    -->  [1,3]


 */

import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {


    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {1,3,5,6};
        unionArray(arr1,arr2);
        intersectionArray(arr1,arr2);
    }

    private static void intersectionArray(int[] a, int[] b) {

        int m = a.length;
        int n = b.length;

        int i=0,j =0;
        Set<Integer> in = new HashSet<>();

        while (i<m && j<n){
            if (a[i]<b[j])
                i++;
            else if (a[i]>b[j])
                j++;
            else{
                in.add(a[i]);
                i++;
                j++;
            }
        }
        System.out.println(in);
    }

    private static void unionArray(int[] arr1, int[] arr2) {

        int m = arr1.length;
        int n = arr2.length;

        Set<Integer> set = new HashSet<>();

       for (int i=0; i<m; i++){
           set.add(arr1[i]);
       }

        for (int i=0; i<n; i++){
            set.add(arr2[i]);
        }

        // print all elements
        System.out.println(set);

    }
}

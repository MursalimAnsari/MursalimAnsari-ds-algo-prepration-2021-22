package Top100_Problems;

/*

  we have to find all duplicate elements in an unsorted array
   Example :    arr:  [4,3,2,7,8,2,3,1]
   output:    ans: [2,3]


 */


import java.util.*;

public class FindAllDuplicatesInArray {

    public static void main(String[] args) {

        int [] arr = {4,3,2,7,8,2,3,1};

        List<Integer>ans = findDuplicates(arr);
        System.out.println(ans);

        System.out.println("Duplicate Elements in Array :");

      List<Integer> ans1 =findDuplicates1(arr);
        System.out.println(ans1);

    }

    /*
        {4,3,2,7,8,2,3,1}

        1. iterate over the array
        2. take a variable index
        3. for each arr[i] check element and mark that as -ve at (arr[i]-1)th element
        4. if it is marked -ve twice then it will be a duplicate element

     */

    private static List<Integer> findDuplicates1(int[] arr) {

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<arr.length; i++){

            int index = Math.abs(arr[i])-1;
            int val = arr[index];

            if(val<0){
                list.add(index +1);
            } else{
                arr[index]*= -1;
            }

        }
        return list;
    }

    private static List<Integer> findDuplicates(int[] arr) {

        int n= arr.length;
        List<Integer> list = new ArrayList<>();


        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){

        if (arr[i]==arr[j]){
            list.add(arr[j]);
        }
            }
        }
        Collections.sort(list);
        return list;
    }

}

package Top100_Problems;


/*
 */

import java.util.*;

public class ThreeSumProblem {

          public static void main(String[] args) {

              int [] arr = {-1,2,0,-1,2,4,-3,5,-7};


//              List<List<Integer>> ans= findTripletsWithZeroSum(arr);
//              for (List<Integer> smallList : ans){
//                  System.out.println(smallList);
//              }


              // -7 -3 -1 -1 0 2 2 4 5

              List<List<Integer>> ans= findTripletsWithZeroSumUsingHashmap(arr);

              for (List<Integer> smallList : ans){
                  System.out.println(smallList);
              }

          }

    private static List<List<Integer>> findTripletsWithZeroSumUsingHashmap(int[] arr) {

              Arrays.sort(arr);

              Set<List<Integer>> set = new HashSet<>();

              for (int i=0; i<arr.length-2; i++) {

                  int start =i+1;
                  int end = arr.length-1;

                  while (start < end) {

                      if(arr[start]+arr[end] == -arr[i]){

                       ArrayList<Integer> list= new ArrayList<>(Arrays.asList(arr[start],-arr[i],arr[end]));

                       set.add(list);

                      } else if(arr[start]+arr[end] < (-arr[i])){
                          start++;
                      } else{
                          end--;
                      }
                     start++;
                      end--;
                  }

              }
              return new ArrayList<>(set);
    }

    private static List<List<Integer>> findTripletsWithZeroSum(int[] arr) {

              int n=arr.length;
               Set<List<Integer>> set = new HashSet<>();

              for (int i=0; i<n-1; i++){
                  for(int j=i+1; j<n-1; j++){
                      for(int k=i+1; k<n;k++){

                          if((arr[i]+arr[j]+arr[k]==0) && (i!=j) && (j!=k)){

                          // System.out.println("{" + arr[i] +"," +arr[j] +"," +arr[k] +"}");
                            List<Integer> list = new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k]));
                            set.add(list);
                          }

                      }
                  }

              }
            return new ArrayList<>(set);

          }
      }

/*
 *    Frequency Sort
 *    This Problem is mostly asked in interviews to beginners
 *
 *   I/P  arr[] :  {1,2,3,1,3,4,5,5,3,4,4}
 *   O/P  list :   [3,3,3,4,4,4,1,1,5,5,2] OR [4,4,4,3,3,3,5,5,1,1,2] OR [4,4,4,3,3,3,5,5,1,1,2]
 *
 *   Approaches To Solve
 *    1st :  Use Collections HashMap and find frequencies of each elements and sort according to their decreasing
 *    frequencies then store in a list and print the list...
 *
 *    2nd :  Solve Without Collections   Find all frequencies and compare these frequencies and store them in a matrix
 *            then print all the elements in the matrix
 *
 *    3rd :   Use MaxHeap or MinHeap  First store all elements in a map according to their frequencies and then add
 *            each element to Heap and store them in descending order and print them
 *
 * */



package Heap;
import java.util.*;

import java.util.List;
import java.util.stream.Collectors;


class  Pair implements Comparable<Pair>{

      int value , count , index;

      public Pair(int value, int count, int index) {
          this.value = value;
          this.count = count;
          this.index = index;
      }

      @Override
      public int compareTo(Pair o) {
          if(this.count!=o.count) {
              return o.count - this.count;
          }
          return this.index-o.index;
      }
  }


public class FrequencySort {

    public static void main(String[] args) {
        int arr[]={1,2,1,2,1,4,3,2,4,5};

//        frequencySortUsingCollections(arr);
//        System.out.print(Arrays.toString(arr) +" ");


      int[] ans  =  frequencySortUsingHeap(arr);
      //System.out.print(Arrays.toString(ans) +" ");

    }

    private static int [] frequencySortUsingHeap(int[] arr) {

        Map<Integer, Integer> map =new HashMap<>();
        int [] res = new int[arr.length];

        for(int i=0; i< arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i] , 0)+1);

        }

        // System.out.println(map.entrySet());

        // initialize a max Heap
        PriorityQueue<Map.Entry<Integer,Integer>>
                maxHeap = new PriorityQueue<>((n1,n2)-> n2.getValue()-n1.getValue());

          maxHeap.addAll(map.entrySet());
          System.out.println(maxHeap);





        return res;
    }

    private static void frequencySortUsingCollections(int[] arr) {

        if(arr==null || arr.length<2){
            return;
        }


        Map<Integer,Pair> map = new HashMap<>();

        for (int i=0;i<arr.length;i++){
            map.putIfAbsent(arr[i], new Pair(arr[i],0,i));
             map.get(arr[i]).count++;
        }

      List<Pair> values = map.values().stream().sorted().collect(Collectors.toList());

        int k =0;
            for(Pair data: values){
                for (int j=0; j<data.count; j++){
                    arr[k++]= data.value;
                }
            }
    }
}

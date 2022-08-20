package Heap;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

/*
*   a heap is a tree base ds which stores the values in two orders
*   minHeap =>  A min heap holds the property that the root node have minimum key in all the nodes and so on...
*   maxHeap =>  A max heap holds the property that the root node have maximum key in all the nodes and so on...
 *
 *       elements : {3,6,4,2,5,1,7,9}
 *
 *   maxHeap =======     9
 *                   /      \
                   7          6
*               /    \      /   \
*               5      3    1    4
*            /
*           2
*
* * */


public class HeapImpleUsingPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> maxHeap= new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(3);
        maxHeap.add(6);
      //  System.out.println( minHeap.peek());
        maxHeap.add(4);
        maxHeap.add(2);
        maxHeap.add(5);
        maxHeap.add(1);
        maxHeap.add(7);
        maxHeap.add(9);

        for (Integer integer : maxHeap) {
            System.out.print(integer + " ");
        }


        System.out.println(" ");

        // poll => list nad remove head of queue
        System.out.println("Removed item from heap is :" + maxHeap.poll());


        for (Integer integer : maxHeap) {
            System.out.print(integer + " ");
        }

    }
}

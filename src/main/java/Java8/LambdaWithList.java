package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class LambdaWithList {

    public static void main(String[] args) {

//
//        List<Integer> list = new ArrayList<>();
//
//        list.add(10);
//        list.add(0);
//        list.add(5);
//        list.add(20);
//        list.add(45);
//        list.add(50);
//
//
//        System.out.println("List Elements before sorting :" + list);
//
//
//        // after sorting
//        Collections.sort(list);
//        System.out.println("Sorting Elements in Natural Order :" + list);
//
//
//        // sorting in descending order
//       // Collections.sort(list, new MyComparator());
//
//        // use lambda expression to sort
//        Collections.sort(list, (I1, I2)->(I1>I2) ?-1:(I1<I2)?1:0);
//
//        System.out.println("Sorting Using Lambda :" + list);
//


  int a = 1;
  int b= 12;
        System.out.println(a=b);

    }

}

//     class MyComparator implements Comparator<Integer> {
//
//        @Override
//        public int compare(Integer I1, Integer I2) {
//            return (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0;
//        }
//
//
//    }

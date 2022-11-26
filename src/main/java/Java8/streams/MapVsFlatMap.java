package Java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(2);

       // System.out.println(list);


//        list.remove(list.size()-1);
//        System.out.println(list);

//        List<Integer> collect = list.stream().map(i -> i *2 ).collect(Collectors.toList());
//        System.out.println(collect);


        List<List<Integer>> list1 = new ArrayList<>();

        list1.add(Arrays.asList(1,2,3));
        list1.add(Arrays.asList(3,4,5));
        list1.add(Arrays.asList(6,7,8));

        System.out.println("Before flattening: ");
        System.out.println(list1);

        // using java 8 stream api
        Set<Integer> flatList =
                list1.stream().flatMap(l2-> l2.stream()).collect(Collectors.toSet());


        System.out.println("After flattening: ");
        System.out.println(flatList);


    }

}

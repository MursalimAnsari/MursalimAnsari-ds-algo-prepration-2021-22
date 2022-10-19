package Java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamProblems {

    public static void main(String[] args) {


    List<Integer> list = Arrays.asList(1,2,43,5,4,3,3,2,32);

//    // find all the even numbers in the list
//    list.stream().filter(i->i%2==0).forEach(System.out::println);
//
//    // sort all the numbers in the list using the sorted method
//    System.out.println("sorted list: ");
//    list.stream().sorted().forEach(System.out::println);
//
//
//    // find all distinct elements in the llst
//
//    System.out.println("All distinct elements: ");
//    list.stream().distinct().sorted().forEach(System.out::println);

    // find the count of each element frequency in java

  Map<Integer,Long> map = list.stream().collect(Collectors
                              .groupingBy(Function.identity(),Collectors.counting()));
      System.out.println(map);

    }
}

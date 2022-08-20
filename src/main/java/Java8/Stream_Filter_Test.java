package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_Filter_Test {


    public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1,3,2,3,2,3,5,7,8);

         filterEven(list);
        Set<Integer>res=  filterEvenDuplicate(list);

         //method reference
        // res.forEach(System.out::println);


        List<String> l1= Arrays.asList("Number", "Amber", "John", "Amisha", "Zendaya","greater");
        Long count= countAlphabetStartsWithA(l1);
        count.intValue();
        System.out.println(count);
    }

    private static Long countAlphabetStartsWithA(List<String> l1) {

        Long count = l1.stream().filter(i->i.endsWith("r")).count();

        return count;
    }

    private static Set<Integer> filterEvenDuplicate(List<Integer> list) {

       Set<Integer> ans= list.stream()
                           .filter(i-> Collections
                                   .frequency(list,i)>1)
                                     .collect(Collectors.toSet());

       return ans;
    }

    private static void filterEven(List<Integer> list) {

        List<Integer> ans = list.stream().filter(i-> i%2==0).collect(Collectors.toList());


        //ans.forEach(an-> System.out.println(an));
    }

}

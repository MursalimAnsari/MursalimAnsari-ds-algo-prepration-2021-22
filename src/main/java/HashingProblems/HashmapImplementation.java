package HashingProblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;

public class HashmapImplementation {

    public static void main(String[] args) {

        Map<Integer,Integer> map = new HashMap<>();

        map.put(3,11);
        map.put(6,0); // sorted according to keys not the values...
        map.put(2,34);
        map.put(1,4);

        System.out.println(map.keySet());         // return all keys set
        System.out.println(map.entrySet());       // return all key-value pairs
        System.out.println(map.values());         // return all values
        System.out.println(map.hashCode());       // return a calculated hashcode
        System.out.println(map.isEmpty());        // return boolean value if collection is empty or not
        System.out.println(map.getClass());       // return the class name ex- class.java.util.HashMap
        System.out.println(map.size());           // return size of the map
        System.out.println(map.containsKey(2));   // return true/false if key is present or not
        System.out.println(map.getOrDefault(1,5));                     //
    }
}

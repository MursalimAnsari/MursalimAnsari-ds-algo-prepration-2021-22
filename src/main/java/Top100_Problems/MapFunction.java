package Top100_Problems;

import java.util.HashMap;
import java.util.Map;

public class MapFunction {


    public static void main(String[] args) {
        String str = "mursu-abc-mursu-mno-mursu-pqr";

        String [] arr = str.split("-",0);

        Map<String,Integer> ansMap = findFrequencyofWords(arr);
        System.out.println(ansMap);

    }




    private static Map<String, Integer> findFrequencyofWords(String[] arr) {


        Map<String,Integer> map = new HashMap<>();

           for(int i=0;i<arr.length;i++){
               if(map.containsKey(arr[i])){
                   int count = map.get(arr[i]);
                   map.put(arr[i],count+1);
               } else{
                   map.put(arr[i],1);
               }
    }
       return map;
}
}
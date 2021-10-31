package JavaStrings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirsNonRepeatingCharacterInString {


    public static void main(String[] args) {

        String str = "abcab";

//        int ans =  firstNonRepeatingCharcterBrute(str);
//        System.out.println(ans);

        int ans = firstNonRepeatingCharacterHashMap(str);
         if (ans!=-1){
             System.out.println("Index of first non repeating character in string is: " +ans);
         } else {
             System.out.println("Their no character which is non repeating");
         }

    }

    private static int firstNonRepeatingCharacterHashMap(String str) {

        int len = str.length();

        if (len<2) return -1;

        Map<Character , Integer> map = new HashMap<>();

         for (int i =0; i<len;i++){
           char ch = str.charAt(i);
             map.put(ch, map.getOrDefault(ch,0)+1);
         }


         for (int i=0; i<len;i++){
             char cha = str.charAt(i);
             if (map.get(cha)==1){
                 return i;
             }
         }

      return -1;
    }

    private static int firstNonRepeatingCharcterBrute(String str) {

        for (int i=0; i<str.length();i++){
               boolean foundDuplicate = false;
            for (int j =0; j<str.length();j++){
                if (str.charAt(i)==str.charAt(j) && i!=j){
                    foundDuplicate = true;
                }
            }

            if (!foundDuplicate){
                return i;
            }
        }



   return -1;
    }


}

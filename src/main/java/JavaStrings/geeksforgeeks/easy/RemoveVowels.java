package JavaStrings.geeksforgeeks.easy;

import java.util.Arrays;
import java.util.List;

public class RemoveVowels {

    public static void main(String[] args) {

        String str = "LeetCodeGeeksForGeeks";


       String ans = removeAllVowels(str);
        System.out.println(ans);

    }

    // remove vowels
    private static String removeAllVowels(String str) {

         StringBuffer sb = new StringBuffer(str);
         // create a list of vowels
        Character[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        List<Character> list = Arrays.asList(vowels);
        System.out.println(list);

         for (int i=0; i<sb.length(); i++){

             if (list.contains(sb.charAt(i))){
                 sb.replace(i, i+1,"");
                 i--;
             }
         }


   return sb.toString();
    }

}

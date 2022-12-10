package JavaStrings.geeksforgeeks.easy;

/*
     PROBLEM STATEMENT::

     Given two strings "a" and "b" consisting of lowercase characters.
     The task is to check whether two given strings are an anagram of each other or not.
     An anagram of a string is another string that contains the same characters,
     only the order of characters can be different. For example, act and tac are an anagram of each other.


      Input:a = "geeksforgeeks" , b = "forgeeksgeeks"
      Output: YES

      Explanation: Both the string have same characters with
      same frequency. So, both are anagrams.

 */


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class AnagramFindProblem {

    public static void main(String[] args) {

        String s1 = "cat";
        String s2 = "tac";

        System.out.println(checkAnagram(s1,s2));


    }

    private static boolean checkAnagram(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        String x = s1.toLowerCase();
        String y = s2.toLowerCase();

        if (m!=n) {
            return false;
        }

        char [] ch1 = x.toCharArray();
        char [] ch2 = y.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }

    // 2nd method to find anagram


}

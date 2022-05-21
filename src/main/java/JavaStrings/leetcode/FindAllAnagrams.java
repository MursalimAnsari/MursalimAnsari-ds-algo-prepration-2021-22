package JavaStrings.leetcode;

/*
     Given two strings s and p, return an array of all the start indices of p's anagrams in s.
     You may return the answer in any order.
     An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     typically using all the original letters exactly once.


    Input: s = "cbaebabacd", p = "abc"
    Output: [0,6]
    Explanation:

   The substring with start index = 0 is "cba", which is an anagram of "abc".
   The substring with start index = 6 is "bac", which is an anagram of "abc".

   Input: s = "abab", p = "ab"
   Output: [0,1,2]

 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {

    public static void main(String[] args) {


        String s = "abcabcabc";
        String p = "abc";


        List<Integer> ans = findAnagrams(s, p);
        System.out.println(ans);

    }


    public static List<Integer> findAnagrams(String s, String p) {

        int n = s.length(), m = p.length(), l = 0, r = 0;

        //count array will store the freq count of chars in string p and curCount will
        // store the frequency of lowercase chars between left and right pointers in string s.
        int count[] = new int[26], curCount[] = new int[26];

        List<Integer> res = new ArrayList<>();

        // BASE CASE
        if (p.length()>s.length()){
            return res;
        }

        //storing the frequencies of chars of string p in count array.
        for(char i:p.toCharArray()) count[i-'a']++;
        while(r < n){

            //storing the count of current char at index right in curCount array.
            curCount[s.charAt(r)-'a']++;

            //if chars between left and right are more than size of p than first reduce
            // the count of char where left is pointing in string s and after that move
            // left towards right to reduce the window size.
            if((r-l) >= m) curCount[s.charAt(l++)-'a']--;

            //if frequency of chars of string s between left and right are equal to frequency of
            // all chars in string p than store left in the result list.
            if(Arrays.equals(count, curCount)) res.add(l);

            r++;
        }

        return res;
    }

}

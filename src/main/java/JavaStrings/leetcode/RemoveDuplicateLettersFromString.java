package JavaStrings.leetcode;

import java.util.LinkedList;

public class RemoveDuplicateLettersFromString {


    public static void main(String[] args) {

        String s = "mopno";

       String ans = removeDuplicateLetters(s);
        System.out.println(ans);
    }


   private static String removeDuplicateLetters(String s) {

        // build a frequency map of characters....

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // linkedList to store final res and a boolean array to check presence of all characters

        LinkedList<Character> res = new LinkedList<>();

        boolean[] isAdded = new boolean[26];

        for (char ch : s.toCharArray()) {

            freq[ch - 'a']--;

            if (isAdded[ch - 'a'])
                continue;


            while (!res.isEmpty() && res.getLast() > ch && freq[res.getLast() - 'a'] > 0) {
                isAdded[res.removeLast() - 'a'] = false;
            }

            res.add(ch);
            isAdded[ch - 'a'] = true;

        }

        StringBuilder sb = new StringBuilder();

        while (!res.isEmpty()) {
            sb.append(res.removeFirst());
        }


        return sb.toString();
    }
}

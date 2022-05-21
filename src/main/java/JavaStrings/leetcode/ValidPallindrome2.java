package JavaStrings.leetcode;

/*

      Given a string s, return true if the s can be palindrome after
      deleting at most one character from it


     Input: s = "aba"
     Output: true

    Input: s = "abc"
    Output: false

   Input: s = "abca"
   Output: true
   Explanation: You could delete the character 'c'.



 */




public class ValidPallindrome2 {

    public boolean validPalindrome(String s) {

        int start=0;
        int end = s.length()-1;

        while(start<end){

            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{

                return isPallindrome(s, start+1,end)|| isPallindrome(s, start, end-1);

            }


        }
        return true;

    }

    public boolean isPallindrome(String s, int i, int j){

        while(i<j){

            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }

        }
        return true;
    }




}

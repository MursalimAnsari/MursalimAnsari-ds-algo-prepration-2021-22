package JavaStrings;

public class CheckPalindromeString {


    public static void main(String[] args) {

        String str = "abcdcba";

//        boolean res =checkPalindrome(str);
//        System.out.println(res);

        boolean res = checkPalindromeUsingTwoPointers(str);
        System.out.println(res);

    }

    private static boolean checkPalindromeUsingTwoPointers(String str) {

        int n = str.length()-1;
        int i = 0;

        if(n<2) return true;

        while(i<n){

         if (str.charAt(i) != str.charAt(n)) return false;

         i++;
         n--;
        }

        return true;
    }

    private static boolean checkPalindrome(String str) {


     int len = str.length();


     if(len<2) return true;

     String rev = "";

     for (int i=len-1; i>=0; i--){

         rev += str.charAt(i);
     }

     if (rev.equals(str)) return true;

     return false;
    }





}

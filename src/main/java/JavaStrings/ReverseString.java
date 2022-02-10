package JavaStrings;

public class ReverseString {


    public static void main(String[] args) {

        String str = "abcd";

//       String ans=  reverseStringUsingIterator(str);
//        System.out.println(ans);


        reverseStringUsingRecursion(str);

        // usingSrtring buffer class
        StringBuffer ans = reverseStringUsingStringBuffer(str);
        System.out.println(ans);

    }

    private static StringBuffer reverseStringUsingStringBuffer(String str) {

        StringBuffer sb = new StringBuffer(str);

        return sb.reverse();

    }

    private static void reverseStringUsingRecursion(String str) {


        int len = str.length();

        if(len == 0) return;

        String res = str.substring(1);
        reverseStringUsingRecursion(res);
       // System.out.print(str.charAt(0) + " ");
    }


    //using charAt() method
    private static String reverseStringUsingIterator(String str) {

       int len =  str.length();

        String res = "";

        for (int i=len-1; i>=0; i--){

            res += str.charAt(i);

        }

        return res;
    }

}

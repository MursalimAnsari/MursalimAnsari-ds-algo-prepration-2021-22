package RecursionAndBackTracking;

public class ReverseString {


    public static void main(String[] args) {

        String str = "abcd";

        reverseStringUsingRecursion(str);

    }

    private static void reverseStringUsingRecursion(String str) {

        if(str.length()==0)return;
        String res = str.substring(1);
        reverseStringUsingRecursion(res);
        System.out.print(str.charAt(0)+" ");


    }
}

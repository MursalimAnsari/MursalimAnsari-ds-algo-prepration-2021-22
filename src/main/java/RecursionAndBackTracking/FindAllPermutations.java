package RecursionAndBackTracking;

public class FindAllPermutations {

    public static void main(String[] args) {

//     String str = "abc";

        String str  = "aabc";
     printPermutation(str , "");

    }


    // Printing all permutations of a string...
    private static void printPermutation(String str, String asf) {

        if(str.length()==0) {
            System.out.println(asf);
            return;
        }

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String qlPart = str.substring(0,i);
            String qrPart = str.substring(i+1);

            String res = qlPart+qrPart;

            printPermutation(res, asf+ch);

        }

    }
}

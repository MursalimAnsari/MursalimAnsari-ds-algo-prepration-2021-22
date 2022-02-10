package JavaStrings;

public class FindingSubString {


    public static void main(String[] args) {

        String s = "abc";

//        String s1 =s.substring(1,5);
//        System.out.println(s1); // o/p --> ursa

        printAllSubstringsUsingSubstringMethod(s);
       // printAllSubstrings(s);

    }

    private static void printAllSubstringsUsingSubstringMethod(String s) {

        int len = s.length();

        for(int i=0; i<len; i++){

            for(int j=i+1;j<=len;j++){

                System.out.println(s.substring(i,j));

            }
        }
    }

    // using 3 nested loops...
    private static void printAllSubstrings(String s) {
         int length = s.length();
         char[] str = s.toCharArray();

         for (int i=1; i<=length;i++){
             for (int j=0;j<=length-i; j++){
                 int m =j+i-1;
                 for (int k=j;k<=m;k++){
                     System.out.println(str[k]);
                 }
                 System.out.println();
             }
         }
    }
}

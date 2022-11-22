package interviewquestions;

public class EqualsAndEqualOperatorDiff {

    public static void main(String[] args) {

       String s1= "abc";
       String s2 = new String ("abc");

       // comparing reference of s1 and s2 here
        System.out.println(s1==s2);

        //comparing the content of s1 and s2 bcs String class Override the equals and hashcode methods of object class
        System.out.println(s1.equals(s2));

        String s3 = s1;
        String s4 = "abc";

        // true: s1 and s4 both are referring to the same object in String Constant Pool
        System.out.println(s1==s4);

        // true
        System.out.println(s1.equals(s4));


    }

}

package JavaStrings;

/*

    (==) ->  equal equal operator is used to compare the reference of the strings
    .equals()  -> this method is of object class and is used to compare the contents of the strings...

    Example
    String s1= new String("Abc");
    String s2= new String("Abc");

    sout(s1==s2);  //  retruns false because == points to refenrence of the string and they are differnt strings
    //here and s1 and s2 referencing to different objects hence their address will be different...

    sout(s1.equals(s2)) // return true because the content of both s1 and s2 is same hence they return true...

 */


public class EqualsAndEqualMethodCompare {


    public static void main(String[] args) {

        // String Objects
        String s1 = new String("Mursu");
        String s2 = new String("Mursu");
        System.out.println(s1==s2); // false...

        //String Literals
        String s3 = "Mursu";
        String s4 = "Mursu";
        System.out.println(s3==s4); // true...

        // String Objects
        String s5 = new String("Ans");
        String s6 = new String("Ans");
        System.out.println(s5.equals(s6)); // true...

       // String literals
        String s7 = "Anu";
        String s8 = "Anu";
        System.out.println(s7.equals(s8)); // true...


        //for different strings
        String an = new String("anu");
        String ann = new String("Anu"); // case sensitive hence they will create two different objects
        System.out.println(an.equals(ann)); // false

//        String ax = "abc";
//        String n = "abc";
//        System.out.println(ax.compareTo(n)); // 0
//
//        String z = "mno";
//        String m ="amn";
//        System.out.println(z.compareTo(m)); // 0
//
//
//        String nw = "agc";
//         String nwe = "abc";
//        System.out.println(nw.compareTo(nwe)); // 5

         String a = "a";
         String b = "A";
         System.out.println(a.compareTo(b));
         System.out.println(b.compareTo(a));


    }


}

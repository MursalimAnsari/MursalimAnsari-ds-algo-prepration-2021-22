package JavaStrings;

/*

   In this problem we will just check the immutability of the strings and we wiil find out string literal
   and string object difference....

 */

public class FirstString {


    public static void main(String[] args) {

        // it will create a string object in heap as well as in string constant pool
        String s = new String("Mursalim");
        s.concat("Ansari");
        // it will still print Mursalim because string concatenated is a new object but it has no reference
        //thats why it will not print Mursalim Ansari
        System.out.println(s);


        // here the string is assigning to a new object which has the value "Mursalim Ahmed"
        s= s.concat(" Ahmed");
        System.out.println(s);

        // String Literal
        String firstName = "Mohammad";
        //System.out.println(firstName); // it creates an object in string literal pool and it will not create separate
        // object for the values which are refencing to its object....

        String n1 = " Sameer";
        String n2 = " Amir";

        n1 = firstName.concat(n1);
        System.out.println(n1);

        n2 = firstName.concat(n2);
        System.out.println(n2);

        // here both n1 and n2 are referencing to same object which is firstName and they didn't need
        // to create new object for firstName they can share this...


    }
}

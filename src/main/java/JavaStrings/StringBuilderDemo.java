package JavaStrings;
/*

    String builder class in java used to create mutable strings.
    initial default capacity of a sting builder object is 16, we can modify it...
    String builder is non synchronised that means it is not thread safe

    methods o string builder class

    1. append(boolean b), append(char c),append(char[] ch), append(String s), append(Object o), append(StringBuffer sb)
    2. reverse()
    3. charAt(),
    4. capacity()
    5. delete(), deleteCharAt()
    6. getChars(in src, int srcEnd, char[] dest, int destBegin)
    7. indexOf(String str)
    8. insert(int offset, char c), 	insert(int offset, char[] str),
       insert(int index, char[] str, int offset, int len), 	insert(int offset, String str)
    9. 	lastIndexOf(String str, int fromIndex)
        Returns the index within this string of the last occurrence of the specified substring.
    10. setCharAt(int index, char ch)
        The character at the specified index is set to ch.
    11. substring(int start)
        Returns a new String that contains a subsequence of characters currently contained in this character sequence.
        String	substring(int start, int end)
        Returns a new String that contains a subsequence of characters currently contained in this sequence.


 */


public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("abc");
        stringBuilder.append("mno");
        System.out.println(stringBuilder);

        stringBuilder.deleteCharAt(4);
        System.out.println(stringBuilder);

        stringBuilder.insert(1,"pqr");
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.capacity());

        StringBuilder builder = new StringBuilder("mnopqrstuvwxyz");

        builder.reverse();
        System.out.println(builder);

        builder.replace(2,3,"i");
        System.out.println(builder);


        System.out.println(builder.substring(2));

        System.out.println( builder.substring(3,5));

    }
}

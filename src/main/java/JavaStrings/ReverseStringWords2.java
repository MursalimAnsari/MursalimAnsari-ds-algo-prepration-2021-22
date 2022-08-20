package JavaStrings;

/*   we have given s string we have to reverse the string word by word.

     I/P  :  String str = "hello this is my string"
     O/P  :   outputStr = "string my is this hello"

 */


import java.util.Stack;

public class ReverseStringWords2 {


    public static void main(String[] args) {
        String str = "  hello this is my string    ";
        //  int len = str.length();



        String result = "";
        result += reverseWordsUsingStack(str);
        System.out.println(result.trim());

        String output=  reverseWords(str);
        System.out.println(output.trim());

    }



    private static String  reverseWordsUsingStack(String str) {

        int len = str.length();
        Stack<String> st = new Stack<>();
        String temp = "";
        String  rev = "";

        for (int i=0; i<len;i++) {

            if (str.charAt(i) == ' ') {
                if (temp.length() > 0)
                    st.push(temp);
                     temp = "";

                } else {
                temp = temp + str.charAt(i);
            }
        }

            rev = rev+ temp;


            while (!st.isEmpty()){
                rev = rev + " " +st.pop();
            }


//            if (rev.length()!=0 && rev.charAt(0)==' '){
//                rev = rev.substring(1);
//            }

        return rev.trim();
    }

    private static String reverseWords(String str) {

        int i = str.length()-1;
        String ans = "";

        while (i>=0){

            while(i>=0 && str.charAt(i)== ' ')

                i--;
            int j = i;
            if(i<0)break;

            while(i>=0 && str.charAt(i)!= ' ')
                i--;


            if (ans.isEmpty()){
                ans =ans.concat(str.substring(i+1,j+1));
            } else{
                ans =ans.concat(" " +str.substring(i+1,j+1));
            }
        }
        return ans;
    }

}

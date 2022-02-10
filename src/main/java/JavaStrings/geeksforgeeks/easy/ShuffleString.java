package JavaStrings.geeksforgeeks.easy;

public class ShuffleString {


    public static void main(String[] args) {

        String s = "code";

//        String s = "";
        int[] indices = {3,0,1,2};
        // s--> "odec"

     String ans = shuffleString(s, indices);

        System.out.println(ans);

    }

    private static String shuffleString(String s, int[] indices) {

        int len = s.length();

        // base cases

        if(len==0 || s==null)
            return  "";

        if (indices.length!=len)
            return "";

      char[] chars = new char[s.length()];

      for (int i=0; i<len; i++){
          // find positions where s.charAt(i) will be placed
          int pos = indices[i];
          chars[pos] = s.charAt(i);
      }

      String res = "";
      for (int i=0; i<chars.length; i++){
          res += chars[i];
      }

        return res;
    }
}

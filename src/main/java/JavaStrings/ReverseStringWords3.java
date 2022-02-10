package JavaStrings;

//  s= "good god"
//reversed words Character: "doog dog"


public class ReverseStringWords3 {


    public static void main(String[] args) {

        String str = "Lombok Library";

        String res =  reverseWords(str);
        System.out.println(res);
    }

    private static String reverseWords(String str) {
        //good god
        //reversed word :  doog dog

        String revOutput ="";

         String [] words = str.split(" ");

         for (String word : words){
             String rev = "";

             for (int i =word.length()-1; i>=0; i--){
                 rev += word.charAt(i);
             }
            revOutput += " " +rev;
         }

        return revOutput.trim();
    }

}

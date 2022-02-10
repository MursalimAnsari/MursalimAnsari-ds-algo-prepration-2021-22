package JavaStrings;

/*

  split() -->  split method separates the string values based on some delimiters

   example --> Sting s = "hello world !!!";
   String[] words = s.split("//");


 */

public class SplitMethodInJava {

    public static void main(String[] args) {

//         String s1 = "Hello";
//         String s2 = "Hello";
//         String s3 = new String("Hello");
//
//
//        System.out.println("s1 and s2 " +s1==s2);
//
//       // System.out.println("s1 and s3 "+s1==s3);
//
//       // System.out.println("s1 and s2 "+s1.equals(s2));
//
//       System.out.println("s2 and s3 "+s2.equals(s3));
//       System.out.println("s2 and s3 " +s2==s3);
//

//       String s = "Hello World Motherfucker   !!";
//
//       String[] words  = s.split(" ");
//
//       for (int i =0; i<words.length;i++){
//           System.out.println(words[i]);
//       }


//       String date = "17/08/1998";
//       String[] d = date.split("/");
//
//       for (String word: d){
//           System.out.println(word);
//       }

      int n = 100000;
      long start = System.currentTimeMillis();
//        String s="";

//        for (int i=0; i<=n; i++){
//            s+=i;
//        }
        // 26956 ,milliseconds to execute...

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++){
            sb.append(i);
        }

        long end  = System.currentTimeMillis();
        long duration = end-start;
        System.out.println(duration);
        // 19 milliseconds to execute...

    }

}

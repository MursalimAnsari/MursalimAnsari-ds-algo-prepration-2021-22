package JavaStrings.leetcode;









public class ValidPallindrome1 {


        public boolean isPalindrome(String s) {

            s= s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

           /*
             int start=0;
             int end=s.length()-1;

             while(start<end){
                 if(s.charAt(start++)!=s.charAt(end--)){
                 return false;
             }

         }
            */


            StringBuilder sb = new StringBuilder();

            sb.append(s);

            if(s.equals(sb.reverse().toString())){
                return true;
            }

            return false;
        }


    }



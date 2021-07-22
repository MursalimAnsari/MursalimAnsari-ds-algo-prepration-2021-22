package SlidingWindow.variable;


import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWithKUniqueCharacters {

    public static void main(String[] args) {

        String s = "aabacbebebe";
        int k=3;

         int ans= subStringKUniqueCharacters(s,k);
        System.out.println(ans);

    }

    private static int subStringKUniqueCharacters(String s, int k) {

        int len=s.length();
        int i=0;
        int j=0;
        int max= Integer.MIN_VALUE;
        Map<Character,Integer>map=new LinkedHashMap<>();
        // aabacbebebe
        // store all unique characters in a map

        while(j<len){

          char c=s.charAt(j);

          // check if the value at j is present in map or not
          if(map.containsKey(c)){
              map.put(c,map.get(c)+1);
          }  else{
              map.put(c,1);
          }


          if(map.size()<k){
              j++;
          }
          else if (map.size()==k){
              max = Integer.max(max,j-i+1);
              j++;
          } else  if (map.size()>k){
              while(map.size()>k){
                  char ch = s.charAt(i);
                  map.put(ch, map.get(ch)-1);

                  if(map.get(ch)==0){
                      map.remove(ch);
                  }

                  i++;
              }

               j++;
          }

        }
        return max;
    }
}

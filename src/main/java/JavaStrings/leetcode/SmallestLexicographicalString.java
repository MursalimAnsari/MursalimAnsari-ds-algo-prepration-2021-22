package JavaStrings.leetcode;


import java.util.Arrays;

class SmallestLexicographicalString {
    public String getSmallestString(int n, int k) {

//         char[] ch = new char[n];

//         for(int i=n-1;i>=0;i--){

//             int val = Math.min(26, k-i);

//             ch[i]= (char)('a'+val-1);
//             k -=val;

//         }
//         return new String(ch);


        k -= n;
        int zCount = k/25;
        int val = k%25;
        char[] ch = new char[n];
        Arrays.fill(ch,'a');
        int i=n-1;
        while(zCount>0){
            ch[i--] ='z';
            zCount--;
        }

        if(val>0)
            ch[i--]= (char)('a' + val);

        return new String(ch);
    }
}
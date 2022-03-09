package RecursionAndBackTracking.striver.dp.lcs;

import java.util.Arrays;

public class LongestCommonSubSequence {

    public static void main(String[] args) {

        String s = "abcdgh";
        String k= "achfg";
        int res = lcs(s, k);
        System.out.println(res);

    }

    private static int lcs(String s, String k) {

        int m=s.length();
        int n=k.length();
        int [][] t = new int[1001][1001];
        for (int [] x : t){
            Arrays.fill(x,-1);
        }

       return  findLcsDpT(s,m,k,n,t);
    }


    // Tabulation solution...
    private static  int findLcsDpT(String X, int m, String Y, int n, int[][] t) {

        // to fill 0th column
        for(int i=0; i<m+1; i++)
            t[i][0] = 0;

        // to fill 0th row
        for(int j=0; j<n+1; j++)
            t[0][j] = 0;

        // to fill the entire table
        for (int i=1; i<m+1;i++){
            for (int j=1; j<n+1;j++){
                if(X.charAt(i-1) == Y.charAt(j-1))
                {
                    t[i][j]= 1+t[i-1][j-1];

                }

                else {
                    t[i][j]= Math.max(t[i-1][j], t[i][j-1]);
                }

            }
        }
        return t[m][n];
    }



    // recursive solution
    private static  int findLcs(String X, int m, String Y, int n) {

     if (m==0 || n==0)
         return 0;

     // if last character of each string matches then pick the elements..
        if(X.charAt(m-1) == Y.charAt(n-1))
            return 1+findLcs(X,m-1,Y,n-1);

       else
            return Math.max(findLcs(X,m-1,Y,n), findLcs(X,m,Y,n-1));
    }

  // memoization solution
    private static  int findLcsDp(String X, int m, String Y, int n, int[][] t) {

        if (m==0 || n==0)
            return 0;
        if (t[m][n] != -1)
            return t[m][n];

        // if last character of each string matches then pick the elements..
        if(X.charAt(m-1) == Y.charAt(n-1))
            return  t[m][n] =1+findLcsDp(X,m-1,Y,n-1, t);

        else
            return  t[m][n] = Math.max(findLcsDp(X,m-1,Y,n,t), findLcsDp(X,m,Y,n-1,t));
    }

}

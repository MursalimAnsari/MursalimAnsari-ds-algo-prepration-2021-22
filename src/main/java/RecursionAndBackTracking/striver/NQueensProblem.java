package RecursionAndBackTracking.striver;

import java.util.List;

public class NQueensProblem {


    public static void main(String[] args) {

        nQueen(new boolean[4][4],0,0,4,0,"");
    }

    private static void nQueen(boolean[][] board, int row, int col, int tq, int qpsf, String ans) {

   if(qpsf==tq){
       System.out.println(ans);
       return;
   }

     if(col==board[0].length){
         row++;
         col=0;
     }

     if(row==board.length){
         return;
     }

        // place the queen...
        if(isSafe(board,row,col)){

            // do this
            board[row][col]=true;

            // recursion
            nQueen(board,row,col+1,tq,qpsf+1,ans+"["+ row+" "+col+ "]");

            //backtrack

            board[row][col]=false;

        }

        // Not place the queen

        nQueen(board,row,col+1,tq,qpsf,ans);

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

    // vertically up
     int r=row;
     int c = col;

     while(r>=0){
         if(board[r][c]){
             return false;
         }
         r--;
     }

      //Horizontally left
        r=row;
        c=col-1;
       while(c>=0){
          if(board[r][c]){
              return false;
          }
          c--;
      }

      //Diagonally Left
        r=row-1;
        c=col-1;
        while(r>=0 && c>=0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }

       //diagonally right
        r=row-1;
        c=col+1;
        while (r>=0 && c<board[0].length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}


// LEETCODE SOLUTION  N QUEENS

 /*
     class Solution {

       public List<List<String>> solveNQueens(int n) {

        char[][] board =  new char[n][n];
        for(int i=0;i<n;i++)
            Arrays.fill(board[i],'.');

            List<List<String>> result = new ArrayList<>();
            backtrack(n, board, 0, result);
            return result;
    }


        public void backtrack(int n, char[][] board, int row, List<List<String>> result){

        if(row==n){
             result.add(constructBoard(board));
         return;
        }

        for(int col=0; col<n;col++){

         if(canPlaceQueen(board, row, col)){

            board[row][col]= 'Q';
            backtrack(n, board, row+1,result);
            board[row][col]= '.';
         }
        }
      }

     private boolean canPlaceQueen(char[][] board, int row, int col){

        // column check
        for(int i= row-1; i>=0;i--){
          if(board[i][col]=='Q')
            return false;
          }

          //  upward  diagonal
         for(int i = row-1, j=col-1; i>=0&&j>=0; i--,j--){

            if(board[i][j]=='Q')
            return false;
        }

     for(int i = row-1, j=col+1; i>=0 && j<board.length; i--,j++){

            if(board[i][j]=='Q')
            return false;
        }
         return true;
      }

   private List<String>  constructBoard(char[][] board){

     List<String> result = new ArrayList<>();

     for(int i=0;i<board.length;i++){

      result.add(new String(board[i]));
     }
   return result;
  }
}

*/
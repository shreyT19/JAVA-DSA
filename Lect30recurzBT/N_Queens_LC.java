package Lect30recurzBT;

public class N_Queens_LC {
    public static void main(String[] args){
        int n=4;
        boolean [][] board = new boolean[n][n];
        Queen(0,n,board);
    }
    public static void Queen(int row,int tq , boolean [][] board){

        if(tq==0){
            display(board);
            return;
        }
        if(row==board.length){
            return;
        }

        for (int col = 0; col <board.length; col++) {
            if(isitpossible(row,col,board)==true){
                board[row][col]=true;
                Queen(row+1,tq-1,board);
                board[row][col]=false;
            }
        }
    }

    public static boolean isitpossible(int row, int col, boolean[][] board) {
            //Upper Case
        int r = row;
        while (r >= 0) {
            if (board[r][col] == true) {
                return false;
            }
            r--;
        }

        //left diagonal
        r=row;
        int c = col;
        while(r>=0 && c>=0){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c--;
        }

        //left diagonal
        r=row;
        c=col;
        while(r>=0 && c< board.length){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c++;
        }
return true;
    }

    public static void display(boolean[][] board){

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

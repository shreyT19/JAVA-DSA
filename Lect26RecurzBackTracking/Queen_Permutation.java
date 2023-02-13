package Lect26RecurzBackTracking;

public class Queen_Permutation {
    public static void main(String[] args){

        boolean[] board = new boolean[4];
        int total_queen = 2;
        QP(board,total_queen,0,"");
    }
    public static void QP(boolean[] board, int tq, int qpsf, String ans){

        // tq --> Total Queen
        // qpsf --> Queen placed sooooo far

        if(tq==qpsf){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(board[i]==false){
                board[i]=true;
                QP(board, tq, qpsf+1, ans+"b" + i + "q"+ qpsf +" ");
                board[i]=false; //backtracking (undo)
            }

        }
    }
}

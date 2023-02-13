package Lect26RecurzBackTracking;

public class Queen_Combination {
    public static void main(String[] args){
        boolean [] board = new boolean[4];
        QC(board,2,0,"",0);
    }
    public static void QC(boolean[] board, int tq, int qpsf, String ans,int idx ){
        if(tq==qpsf){
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < board.length; i++) {
if(board[i]==false){
    board[i]=true;
    QC(board,tq,qpsf+1,ans+"b" + i + "q"+ qpsf +" ",i+1);
    board[i]=false;
}
        }
    }

}

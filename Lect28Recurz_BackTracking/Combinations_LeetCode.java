package Lect28Recurz_BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations_LeetCode {
    public static void main(String[] args){
        boolean [] board = new boolean[4];
        List<Integer> list = new ArrayList<>();
        List<List <Integer>> ans = new ArrayList<>();
        QC(board,2,0,0,list,ans);
        System.out.println(ans);


    }
    public static void QC(boolean [] board,int tq,int qpsf,int idx,List<Integer> list,List<List <Integer>> ans){

        if(qpsf==tq){
            // System.out.println(list);
            ans.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = idx; i < board.length; i++) {
            if(board[i]==false){
                board[i]=true;
                list.add(i+1);
                QC(board,tq,qpsf+1,i,list,ans);
                list.remove(list.size()-1);
                board[i]=false;

            }
        }
    }
}

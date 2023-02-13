package Lect28Recurz_BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations_Sum_III_LeetCode {
    public static void main(String[] args) {
        int n=7;
        int k=3;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Combinations(k,n,list,ans,1);
        System.out.println(ans);
    }
    public static void Combinations(int tqsf,int n,List<Integer> list, List<List<Integer>> ans,int idx){

        if(tqsf==0 && n==0){
            ans.add(new ArrayList<Integer>(list));
            return;
        }

        for(int i =idx;i<=9;i++){

            if(n>=i ) {
                list.add(i);
                Combinations(tqsf - 1, n - i, list, ans, i+1);
                list.remove(list.size() - 1);
            }
        }
    }
}
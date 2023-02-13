package Lect28Recurz_BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_LeetCode {
    public static void main(String[] args){
        int [] coin ={2,3,6,7};
        int amount=7;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Combination(coin,amount,list,0,ans);
        System.out.println(ans);


    }
    public static void Combination(int [] coin,int sum, List<Integer> list,int idx,List<List<Integer>> ans){

        if(sum==0){
            // System.out.println(list);
            ans.add(new ArrayList<>(list));

            return;
        }

        for (int i = idx; i < coin.length; i++) {
            if(sum>=coin[i]){
                list.add(coin[i]);
                Combination(coin,sum-coin[i],list,i,ans);
                list.remove(list.size()-1);
            }
        }
    }
}

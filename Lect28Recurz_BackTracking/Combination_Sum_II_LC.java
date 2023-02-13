package Lect28Recurz_BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II_LC {
    public static void main(String[] args){
        int [] arr = {10,1,2,7,6,1,5};

        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int target = 8;
        COM(arr,target,list,ans,0);
        System.out.println(ans);
    }
    public static void COM(int [] arr, int target, List<Integer> list,List<List<Integer>> ans,int idx){


        if(target==0){
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i = idx; i <arr.length; i++) {

            if(i!=idx && arr[i]==arr[i-1]){
                continue;
            }
                if(target>=arr[i]){
                    list.add(arr[i]);
                    COM(arr,target-arr[i],list,ans,i+1);
                    list.remove(list.size()-1);
                }
        }
    }
}

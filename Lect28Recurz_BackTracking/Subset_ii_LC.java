package Lect28Recurz_BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Subset_ii_LC {
    public static void main(String[] args){
        int [] arr ={1,2,2};
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans1 = new ArrayList<>();
        Subset(arr,list,ans1,0);
        System.out.println(ans1);

    }
    public static void Subset(int [] arr, List<Integer> list, List<List<Integer>> ans1,int idx){

        if(arr.length==0){
            ans1.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            if(i!=idx && arr[i]==arr[i+1]){
                continue;
            }
            Subset(arr,list,ans1,i+1);
            list.add(arr[i]);
            Subset(arr,list,ans1,i+1);
            list.remove(list.size()-1);
        }




    }
}

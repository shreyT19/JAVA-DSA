package Lect28Recurz_BackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subsets_LeetCode {
    public static void main(String[] args){
        int [] arr ={1,2,3};
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans1 = new ArrayList<>();
        Subset(arr,0,list,ans1);
        System.out.println(ans1);

    }
    public static void Subset(int [] arr,int i, List<Integer> list, List<List<Integer>> ans1){

        if(i== arr.length){
            ans1.add(new ArrayList<Integer>(list));
            return;
        }


        Subset(arr,i+1,list,ans1);
        list.add(arr[i]);
        Subset(arr,i+1,list,ans1);
        list.remove(list.size()-1);



    }
}

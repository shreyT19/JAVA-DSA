package Lect54Map;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOf2ArraysLC {
    public static void main(String[] args) {

        int [] arr1 = {1,2,2,1};
        int [] arr2 = {2,2};

        int [] ans = intersection(arr1,arr2);

    }
    public static int[] intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> ll = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            } else {
                map.put(arr1[i],1);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if(map.containsKey(arr2[i]) && map.get(arr2[i])>0){
                ll.add(arr2[i]);
                map.put(arr2[i], map.get(arr2[i])-1);
            }
        }
        int [] arr = new int[ll.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ll.get(i);
        }
        return arr;
    }
}

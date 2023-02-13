package Lect31RecurzBT;

import java.util.Arrays;

public class Merge_2_Sorted_Arrays {
    public static void main(String[] args){

        int [] arr1 = {0,1,2,3};

        int [] arr2 = {2,5,6};

        int [] ans = MergeArray(arr1,arr2);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }



    }
    public static int [] MergeArray(int []arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n + m];
        int i = 0;// arr1
        int j = 0;// arr2
        int k = 0;// ans

        while (i < n && j < m) {

            if (arr1[i] <= arr2[j]) {
                ans[k] = arr1[i];
                k++;
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }

        }
        while (i < n) {
            ans[k] = arr1[i];
            k++;
            i++;
        }

        while (j < m) {
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;

    }

}
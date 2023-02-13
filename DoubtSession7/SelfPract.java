package DoubtSession7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SelfPract {
    public static void main(String[] args) {

        int [] arr1= {4,7,8,9,10,15,14};
        int [] arr2 = {1,5,6,7,8};

        int []ans = MergeSortedArays(arr1,arr2);
        Arrays.sort(ans);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }


    }
    public static int [] MergeSortedArays(int [] arr1,int []arr2) {

        int n = arr1.length;
        int m= arr2.length;
        int i=0,j=0,k=0;
        int [] ans = new int[n+m];
        while (i<n && j<m){
            if(arr1[i]<=arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
            } else{
                ans[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<n){
            ans[k]=arr1[i];
            k++;
            i++;
        }
        while(j<m){
            ans[k]=arr2[j];
            k++;
            j++;
        }

        return ans;
    }


}


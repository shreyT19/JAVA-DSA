package Lect19Alist;

import java.util.ArrayList;
import java.util.Scanner;

public class TrialTest {
    public static void main(String[] args) {

        int [] arr ={10,5,2,6};
        int k=100;
        System.out.println(SubArray(arr,k));
    }
    public static int SubArray(int [] arr, int k){
        int si=0;
        int ei=0;

        int count=0;
        int product=1;
        while(ei<arr.length){

            //Grow
            product=product*arr[ei];

            //Shrink
            while (product>=k && si<=ei){
                product=product/arr[si];
                si++;
            }

            count=count+ei-si+1;
            ei++;
        }
        return count;
    }
}


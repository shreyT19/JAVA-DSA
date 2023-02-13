package Lect20SlidingWindow;

import java.util.Scanner;

public class Max_Sum_Of_Window_Size_k {
    public static void main(String[] args){
      //  Scanner scn = new Scanner(System.in);

        int [] arr={1,2,7,5,11,3,2,1};
         int n = 3;

        System.out.println( MaxSum(arr,n));

        System.out.println();


    }
    public static int MaxSum(int [] arr,int n){
        int sum=0;

        //1st WINDOW;
        for(int i=0;i<n;i++){
            sum= sum + arr[i];
        }
        int ans=sum;
        for(int i =n;i<arr.length;i++){
            sum = sum + arr[i] - arr[i-n];
            ans=Math.max(sum,ans);
        }
        return ans;

    }
}

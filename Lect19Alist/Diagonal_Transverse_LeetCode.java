package Lect19Alist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Diagonal_Transverse_LeetCode {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [] [] arr = new int [n][m];
        for(int i = 0; i < arr.length;i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int [] ans = Diagonal(arr);
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }


    }
    public static int[] Diagonal(int [][] arr){
        int n = arr.length;
        int m= arr[0].length;
    int [] ans = new int[n*m];
    int i =0;

        for(int di=0;di<n+m-1;di++){
            int row=0;
            int col=0;
            if(di<m){
                row=0;
                col=di;
            } else {
                col=m-1;
                row=di-m+1;
            }
            ArrayList<Integer> list= new ArrayList<>();

            while(row<n && col>=0){
                list.add(arr[row][col]);
                row++;
                col--;
            }
           if(di%2==0){
               Collections.reverse(list);
           }
            for(int val:list){
                ans[i]=val;
                i++;
            }

        }
        return ans;
    }
}

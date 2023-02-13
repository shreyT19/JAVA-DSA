package Lect23Recurz3;

import java.util.Scanner;

public class All_Indices_HackerBloxs {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scn.nextInt();
        }
        int m = scn.nextInt();
        Indices(arr,0,"",m);

    }
    public static void Indices(int [] arr,int i,String ans,int m){

        if(i== arr.length){
            return;
        }
        if(arr[i]==m){
            System.out.print(i+" ");
        }

        Indices(arr,i+1,ans+arr[i],m);
    }
}

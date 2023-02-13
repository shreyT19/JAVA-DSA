package Lect23Recurz3;

import java.util.Scanner;

public class SelfPractise {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

       int n = scn.nextInt();

        System.out.println(Coin(n,0,""));

    }
    public static int Coin (int n, int current , String ans){

        if(current==n){
            System.out.print(ans + " ");
            return 1;
        }
        if(current>n){
            return 0;
        }

int count =0;
        for(int i=1;i<=n-1;i++){
           count=count+ Coin(n,current+i,ans+i);
        }
return count;
    }
}

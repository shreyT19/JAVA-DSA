package Lect23Recurz3;

import java.util.Scanner;

public class BoardPathUsingForRecurz {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("\n"+ BPfor(n,0,""));
    }
    public static int BPfor(int end,int current, String ans){
        if (current == end) {
            System.out.print(ans + " ");
            return 1;
        }
        if(current>end){
            return 0;
        }
        int count =0;
        for(int i=1;i<=end-1;i++){
            count=count + BPfor(end, current+i,ans+i);
        }
        return count;
    }
}

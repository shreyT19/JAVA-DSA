package DoubtSession7;

import java.util.Scanner;

public class RecursionSubSet {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println("\n"+Subset(arr,0,"",target,0));
    }
    public static int Subset(int [] arr,int i, String ans,int target,int sum) {

        if(i== arr.length){
            if(sum==target) {
                System.out.print(ans);
                return 1;
            }
            return 0;
        }
        int f1 = Subset(arr,i+1,ans+arr[i]+" ",target,sum+arr[i]); //added string
        int f2 = Subset(arr,i+1,ans,target,sum); //empty string

        return f1 + f2;
    }
}

package Lect22Recurz2;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= scn.nextInt();
        }

        int item = scn.nextInt();
        System.out.println(FirstIndex(arr, arr.length-1, item));
    }
    public static int FirstIndex(int []arr, int i,int item){

        if(i<0){
            return -1;
        }

        if(arr[i]==item){
            return i;
        }
        return FirstIndex(arr, i-1, item);
    }
}

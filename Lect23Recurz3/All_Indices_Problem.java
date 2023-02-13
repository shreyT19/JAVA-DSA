package Lect23Recurz3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class All_Indices_Problem {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();

        int []arr = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= scn.nextInt();
        }

        int m = scn.nextInt();
        ArrayList <Integer> list = new ArrayList<>();
        Indices(m,0,arr,list);
        System.out.print("\n" + list);


    }
    public static void Indices(int m, int i, int [] arr, List<Integer> list){


        if(i>= arr.length){
            return;
        }
        if(arr[i]==m){
            list.add(i);
        }



        Indices(m, i + 1, arr,list);


    }

}

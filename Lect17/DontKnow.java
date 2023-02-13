package Lect17;

import java.util.ArrayList;
import java.util.Scanner;

public class DontKnow {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        //Input1
        int n=scn.nextInt();
        int [] arr1 = new int[n];
        for(int i=0;i< arr1.length;i++){
            arr1[i]= scn.nextInt();
        }

        //Input2
        int m= scn.nextInt();
        int [] arr2 = new int[n];
        for(int i=0;i< arr2.length;i++){
            arr2[i]= scn.nextInt();
        }

        ArrayList<Integer> list = Sum(arr1,arr2);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ ", ");
        }
        System.out.println("END");
    }

    public static ArrayList<Integer> Sum(int [] arr1, int [] arr2){
        ArrayList<Integer> list = new ArrayList<>();

        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry =0;

        while(i>=0 || j>=0){
            int sum=0;
            if(i>=0){
                sum = sum +arr1[i];
                i--;
            }
            if(j>=0){
                sum = sum +arr2[j];
                j--;
            }

            sum+=carry;
            list.add(0, sum%10);
            carry=sum/10;
        }

        if(carry>0){
            list.add(0,carry);
        }
        return list;
    }

}

package Lect19Alist;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_Of_Two_Arrays {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();

        }
        System.out.println();

        ArrayList<Integer> ans =Sum(arr, arr1);
        for (int i = 0; i <ans.size(); i++) {
            System.out.print(ans.get(i)+", ");

        }
        System.out.println("END");
    }
    public static ArrayList<Integer> Sum(int [] arr, int [] arr1){

        ArrayList<Integer> ans= new ArrayList<>();

        int i=arr.length-1;
        int j= arr1.length-1;
        int carry=0;

        while(i>=0 || j>=0){
            int sum=0;
            if(i>=0){
                sum = sum+arr[i];
                i--;
            } if(j>=0){
                sum= sum +arr1[j];
                j--;
            }
            sum = sum + carry;
            ans.add(0,sum%10);
            carry=sum/10;

        }
        if(carry>0) {
            ans.add(0, carry);
        }
        return ans;
    }
}

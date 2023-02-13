package Lect20SlidingWindow;

import java.util.Scanner;


import java.util.*;
import java.lang.Math.*;
public class MaxMinArray {

        public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int [] arr = new int[5];
            for(int i =0;i<arr.length;i++){
                arr[i]= scn.nextInt();
            }
            System.out.println(Min_Max(arr));


        }
        public static int [] Min_Max(int [] arr){

            int max = arr[0];
            int min= arr[0];

            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max= arr[i];
                } else if(arr[i]<min){
                    min=arr[i];
                }

            }
            int  [] maxMin = {min, max};
            return maxMin;

        }
    }




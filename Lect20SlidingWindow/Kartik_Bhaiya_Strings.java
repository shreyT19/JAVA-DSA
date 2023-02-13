package Lect20SlidingWindow;

import java.util.Scanner;

public class Kartik_Bhaiya_Strings {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int k= scn.nextInt();
        String str=scn.next();

        int flipA=SubString(str, k, 'a');
        int flipB=SubString(str, k, 'b');
        System.out.println(Math.max(flipA,flipB));



    }
    public static int SubString(String str, int k ,char ch){

        int ei=0;
        int si=0;
        int count =0;
        int flip=0;

        while(ei<str.length()){

            //WINDOW GROW
            if(str.charAt(ei)==ch){
                flip++;
            }


            //WINDOW SHRINK

            while(flip>k & si<=ei){
                if(str.charAt(ei)==ch){
                    flip--;
                }
                si++;
            }
            //ANS CALCULATE
count= Math.max(count, ei-si+1);
            ei++;
        }
        return count;
    }
}

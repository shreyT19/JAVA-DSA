package DoubtSession7;

import java.util.Scanner;

public class Generate_BinaryString {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            String str = scn.next();
            Binary(str, "");
            System.out.println();
        }
    }
    public static void Binary(String ques, String ans){

        if(ques.length()==0){
            System.out.println(ans);
            return;
        }


        char ch = ques.charAt(0);


        if(ch == '?'){
            Binary(ques.substring(1),ans+"0");
            Binary(ques.substring(1),ans+"1");
            }
        else {
            Binary(ques.substring(1),ans+ch);
        }
    }

}

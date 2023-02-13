package Lect16;

import java.util.Scanner;

public class Playing_with_good_Substrings {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(GoodString(str));

    }

   public static int GoodString(String str){
        int ans=0;
        int count =0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(vowel(ch)==true){
                count++;
            } else {
                ans = Math.max(ans,count);
                count=0;
            }
        }
        ans = Math.max(ans,count);
        return ans;
   }

   public static boolean vowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
   }
}

package Lect29RecurzBT;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning_LC {
    public static void main(String[] args){

        String str= "abc";
        List<String> list = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        palStr(str,list,ans);
        System.out.println(ans);
    }
    public static void palStr(String ques, List<String> list , List<List<String>> ans){

        if (ques.length()==0){

            ans.add(new ArrayList<>(list));
            //System.out.println(list);
            return;
        }

        int count =0;
        for (int i = 1; i <= ques.length(); i++) {
            String s =ques.substring(0,i);
            if(isPalindrome(s)) {
                list.add(s);
                palStr(ques.substring(i),list,ans);
                list.remove(list.size()-1);
            }
        }

    }
    public static boolean isPalindrome(String name){
        int i =0;
        int j= name.length()-1;

        while(i<j){
            if(name.charAt(i)!=name.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

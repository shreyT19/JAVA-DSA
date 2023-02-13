package Lect24Recurz4;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_leetcode {
    static String [] keys = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args){


        String str="23";
        List<String> list = new ArrayList<>();
        KeyPad(str,"",list);
        System.out.println(list);
    }
    public static void KeyPad(String ques, String ans, List<String> list) {

        if(ques.length()==0){
           list.add(ans);
            return ;
        }

        char ch = ques.charAt(0);
        String s= keys[ch-48+1];

        for(int i=0;i<s.length();i++){
            KeyPad(ques.substring(1),ans+s.charAt(i),list);
        }

    }
}

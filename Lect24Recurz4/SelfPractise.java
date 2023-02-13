package Lect24Recurz4;


import java.security.Key;

public class SelfPractise {
    static String[] key = {"", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"};
    public static void main(String[] args) {

        String str ="12";
      //  System.out.println(str.substring());
        KeyPad(str,"");
    }
    public static void KeyPad(String ques,String ans){

        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
       char ch = ques.charAt(0);
       String s=key[ch-48];
       for(int i=0;i<s.length();i++){
           KeyPad(ques.substring(1),ans + s.charAt(i));
       }

    }
}

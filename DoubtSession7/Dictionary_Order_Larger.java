package DoubtSession7;

import java.util.*;


public class Dictionary_Order_Larger {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> list = new ArrayList<>();
        Perm(str,"",str,list);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void Perm(String ques, String ans,String orgStr, ArrayList<String> list){

        if(ques.length()==0){
            if(ans.compareTo(orgStr)>0) {
               // System.out.println(ans);
                list.add(ans);
            }
            return;
        }

        for(int i=0;i<ques.length();i++){
            String s = ques.substring(0,i) + ques.substring(i+1);
            char ch = ques.charAt(i);
            Perm(s,ans + ch,orgStr,list);
        }
    }
}
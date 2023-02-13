package DoubtSession7;

public class Replace_all_π {
    public static void main(String[] args){
        String str= "xππpπxx";
        Replace(str,"");

    }
    public static void Replace(String ques, String ans){

        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        if(ch=='π'){
            Replace(ques.substring(1),ans + "3.14");
        }
        else {
            Replace(ques.substring(1),ans+ch);
        }
    }

}

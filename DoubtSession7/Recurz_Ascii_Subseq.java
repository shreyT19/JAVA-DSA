package DoubtSession7;

public class Recurz_Ascii_Subseq {
    public static void main(String[] args){
        String str = "ab";
        System.out.println(ASCII(str,""));

    }
    public static int ASCII(String ques, String ans){

        if(ques.length()==0){
            System.out.println(ans);
            return 1;
        }

        char ch = ques.charAt(0);
        int f1 =ASCII(ques.substring(1),ans);
        int f2 =ASCII(ques.substring(1),ans+ch);
        int f3= ASCII(ques.substring(1),ans + (int)ch);
        return f1 + f2+ f3;
    }
}

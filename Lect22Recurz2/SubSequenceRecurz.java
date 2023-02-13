package Lect22Recurz2;

public class SubSequenceRecurz {
    public static void  main(String[] args){

        String str="abc";
        System.out.print(str.substring(0,2));
        System.out.println();

        int ans =0;
        Subsequence(str,"");
    }
    public static void Subsequence(String ques, String ans){

        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0); //a
        Subsequence(ques.substring(1),ans); //
        Subsequence(ques.substring(1),ans+ch);
    }
}

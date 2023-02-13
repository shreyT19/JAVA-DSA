package Lect24Recurz4;

public class Permutation {
    public static void main(String[] args){

        String str= "abc";
       // System.out.println(str.substring(0,0));
        //System.out.println(str.substring(1));
        Permutation(str,"");


    }
    public static void Permutation(String ques, String ans){


        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<ques.length();i++){

            String s = ques.substring(0,i) + ques.substring(i+1);
            char ch = ques.charAt(i);
            Permutation(s,ans +ch);
        }
    }
}

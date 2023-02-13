package Lect24Recurz4;

public class DuplicatePermutation {
    public static void main(String[] args){

        String str= "abca";
        Permutation(str,"");


    }
    public static void Permutation(String ques, String ans) {


        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < ques.length(); i++) {

            char ch = ques.charAt(i);
            boolean flag =true;
            for (int j = i+1; j < ques.length(); j++) {
                if (ques.charAt(j) == ch) {
                    flag=false;
                    break;
                }

            }
            //flag==false then there shouldn't be a call
                if(flag==true) {
    String s = ques.substring(0, i) + ques.substring(i + 1);

    Permutation(s, ans + ch);
}
        }
    }
}

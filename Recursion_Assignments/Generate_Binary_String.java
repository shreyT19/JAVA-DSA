package Recursion_Assignments;

public class Generate_Binary_String {
    public static void main(String[] args){

    }
    public static void GBS(String ques, String ans){

       char ch = ques.charAt(0);
       if(ch=='?'){
           GBS(ques.substring(1), ans +"0" );
           GBS(ques.substring(1), ans +"1" );
        } else {
           GBS(ques.substring(1), ans + ch );
       }
    }
}

package Lect23Recurz3;

public class SubSequence_Count {
    //static int  count=0;
    public static void  main(String[] args){

        String str="abc";
        int ans =0;
        //Subsequence(str,"");
        //System.out.println("Total :" +  count);
        System.out.println(Subsequence1(str,""));
    }
//    public static void Subsequence(String ques, String ans){
//
//        if(ques.length()==0){
//            System.out.println(ans);
//            count++;
//            return;
//        }
//
//        char ch = ques.charAt(0); //a
//        Subsequence(ques.substring(1),ans); //
//        Subsequence(ques.substring(1),ans+ch);
//    }
    public static int Subsequence1(String ques, String ans){

        if(ques.length()==0){
            System.out.print(ans + " ");

            return 1;
        }

        char ch = ques.charAt(0); //a
        int f1 =Subsequence1(ques.substring(1),ans); //
        int f2=Subsequence1(ques.substring(1),ans+ch);
        return f1+f2;
    }
}

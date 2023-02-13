package DoubtSession7;

public class LexographicalOrderLeetCode {
    public static void main(String[] args){
        int n=13;
        for(int i=1;i<=9;i++) {
            Lex(i, n);
        }
    }
    public static void Lex(int current,int target){

        if(current>target){
            return;
        }
        System.out.print(current + " ");


        for(int i=0;i<=9;i++){
            Lex(current*10 +i,target);
        }
    }
}

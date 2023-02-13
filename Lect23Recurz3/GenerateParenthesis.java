package Lect23Recurz3;

public class GenerateParenthesis {
    public static void main(String[] args){
        int n=3;
        Parenthesis(n,0,0,"");
    }
    public static void Parenthesis(int n, int opening, int ending, String ans){

        if(opening ==n && ending==n){
            System.out.println(ans);
            return;
        }


        if(opening<n){
            Parenthesis(n, opening+1, ending, ans+"(");
        }

        if(ending<opening) {
            Parenthesis(n, opening, ending + 1, ans + ")");
        }
    }
}

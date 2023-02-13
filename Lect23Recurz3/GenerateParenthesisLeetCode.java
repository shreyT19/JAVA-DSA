package Lect23Recurz3;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesisLeetCode {
    public static void main(String[] args){
        int n=3;
        List<String> list = new ArrayList<>();
        ParenthesisLEET(n,0,0,"",list);
        System.out.println(list);
        //return list;
    }
    public static void ParenthesisLEET(int n, int starting, int ending, String ans, List<String> list){

        if(starting==n && ending==n){
           // System.out.println(ans);
            list.add(ans);
            return;
        }


        if(starting<n){
            ParenthesisLEET(n,starting+1,ending,ans + "(",list);
        }


        if(ending<starting){
            ParenthesisLEET(n,starting,ending+1,ans + ")",list);
        }

    }
}

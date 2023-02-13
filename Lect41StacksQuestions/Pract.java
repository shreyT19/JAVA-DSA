package Lect41StacksQuestions;

import java.util.Stack;

public class Pract {
    public static void main(String[] args){
       int [][] graph = {
               {1, 1, 0},
               {0, 1, 0},
               {1, 1, 1}
};

        System.out.println(Celebrity(graph));

    }
    public static int Celebrity(int [][] graph){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            st.push(i);

        }
       while (st.size()>1){
           int a = st.pop();
           int b = st.pop();
           if(graph[a][b]==1){
               st.push(b);
           } else {
               st.push(a);
           }
       }


       int celebrity=st.pop();
        for (int i = 0; i < graph.length; i++) {
            if(i!=celebrity&&(graph[celebrity][i]==1 || graph[i][celebrity]==0)){
                return -1;
            }
        }
        return celebrity;
    }
}

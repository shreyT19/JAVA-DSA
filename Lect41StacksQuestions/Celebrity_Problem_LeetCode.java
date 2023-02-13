package Lect41StacksQuestions;

import java.util.Stack;

public class Celebrity_Problem_LeetCode {
    public static void main(String[] args){
        int [][]arr= {{0,1,1,1},{1,0,1,1},{0,0,0,0},{1,1,1,0}};
       // System.out.println(Celebrity(arr));
    }
    public int Celebrity(int n){

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while(st.size()>1){
            int indexA= st.pop();
            int indexB = st.pop();
            if(knows(indexA,indexB)==true){
                st.push(indexB);
            } else{
                st.push(indexA);
            }
        }
        int candidate=st.pop();
        for (int i = 0; i < n; i++) {
            if(i!=candidate && (knows(i,candidate)==false || knows(candidate,i)==true) ){

                return -1;
            }

        }
        return candidate;
    }

public boolean knows(int a, int b){
        return false;
}
}

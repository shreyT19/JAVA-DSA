package Lect40StacksQPS;

import java.util.Stack;

public class StacksReverse {
    public static void main(String[] args){
        Stack<Integer> st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);
        Reverse(st);
        System.out.println(st);


    }
    public static void Reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int x = st.pop();
        Reverse(st);
        InsertBottom(st,x);
    }
    public static void InsertBottom(Stack<Integer> st,int x){


        if(st.isEmpty()){
            st.push(x);
            return;
        }

        int y = st.pop();
        InsertBottom(st,x);
        st.push(y);
    }
}

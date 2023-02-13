package Lect40StacksQPS;

import java.util.Stack;

public class SelfPract {
    public static void main(String[] args){

        Stack<Integer> st= new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);
        System.out.println("*************");
        ReverseStack(st);
        System.out.println(st);


    }
    public static void ReverseStack(Stack<Integer> st){

        if(st.isEmpty()){
            return;
        }

        int x = st.pop();
        ReverseStack(st);
        BottomElement(st,x);

    }
    public static void BottomElement(Stack<Integer> st, int x){

        if(st.isEmpty()){
            st.push(x);
            return;
        }

        int y = st.pop();
        BottomElement(st,x);
        st.push(y);
    }
}

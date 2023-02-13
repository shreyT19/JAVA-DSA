package Lect41StacksQuestions;

import java.util.Stack;

public class Min_Stack {

    private Stack<Integer> st;
    private int min;

    public Min_Stack(){
        this.st = new Stack<>();
    }

    public void push(int item){

        if(this.st.isEmpty() || this.min<item ){
            if(st.isEmpty()){
                this.st.push(item);
                this.min= item;
            } else{
                this.st.push(item);
            }
        } else {
            int val = 2*item - this.min;
            this.st.push(val);
            this.min= item;
        }

    }
    public int size(){
        return this.st.size();
    }
    public int min(){
        return this.min;
    }
    public int pop() throws Exception{
        if(this.st.isEmpty()){
            throw new Exception("CJB");
        } if(this.st.peek()<this.min){
            int rv = this.st.pop();
            int rd = this.min;
            this.min= 2*this.min-rv;
            return rd;
        }
        else{
            return this.st.pop();
        }

    }
    public int peek() throws Exception{
        if(this.st.isEmpty()){
            throw new Exception("CJB");
        } if(this.st.peek()<this.min){
           return this.min;
        }
        else{
            return this.st.peek() ;
        }
    }
    public void Display(){
        System.out.println(this.st);
    }

}

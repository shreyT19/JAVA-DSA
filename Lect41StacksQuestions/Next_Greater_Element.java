package Lect41StacksQuestions;

import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args){

        int [] arr={11,2,3,23,13,15};
        NextGreater(arr);
        
    }
    public static void NextGreater(int[] arr){
         int []nextG= new int[arr.length];

         Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                int ii= st.pop();
                nextG[ii]=arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty() ){
            int ii= st.pop();
            nextG[ii]=-1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("("+arr[i]+")"+ "-" +"("+ nextG[i]+")");
        }
    }
}

package Lect41StacksQuestions;

import java.util.Stack;

public class HistogramLC {
    public static void main(String[] args){
        int [] arr = {2,3,5,4,6,1,7};

    }
    public static int Area(int []arr){
        Stack<Integer> st = new Stack<>();
int ans=0;


        for (int i = 0; i < arr.length; i++) {
                while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                    int r =i;
                    int h = arr[st.pop()];
                    if(st.isEmpty()){
                        ans= Math.max(ans,h*r);
                    } else {
                        int l =st.peek();
                        ans = Math.max(ans,h*(r-l-1));
                    }
                }
                st.push(i);
            }

return ans;
    }
}

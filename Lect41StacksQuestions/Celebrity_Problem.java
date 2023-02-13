package Lect41StacksQuestions;


import java.util.Stack;

public class Celebrity_Problem {
    public static void main(String[] args){
        int [][]arr= {{0,1,1,1},{1,0,1,1},{0,0,0,0},{1,1,1,0}};
        System.out.println(Celebrity(arr));
    }
    private static int Celebrity(int [][] arr){

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }
        while(st.size()>1){
            int indexA= st.pop();
            int indexB = st.pop();
            if(arr[indexA][indexB]==1){
                st.push(indexB);
            } else{
                st.push(indexA);
            }
        }
        int candidate=st.pop();
        for (int i = 0; i < arr.length; i++) {
            if(i!=candidate && (arr[i][candidate]==0 || arr[candidate][i]==1) ){
                 System.out.println("Aap celebrity nhi ho");
                 //return -1;
            }

        }
        return candidate;
    }

}

package Lect41StacksQuestions;

public class MinStack_Client {
    public static void main(String[] args) throws Exception{
        Min_Stack st = new Min_Stack();

        st.push(5);
        st.push(7);
        st.push(2);
        st.push(9);
        st.push(4);
        st.push(3);
        st.push(8);
        st.push(1);
        st.push(17);
        st.Display();
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.min());

    }
}

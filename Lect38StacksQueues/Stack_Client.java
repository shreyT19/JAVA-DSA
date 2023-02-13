package Lect38StacksQueues;

public class Stack_Client {
    public static void main(String[] args) throws Exception {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.Display();
        System.out.println(s.pop());
        s.Display();
        System.out.println(s.peek());
        s.Display();
        System.out.println(s.pop());
        s.Display();
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.pop());
        s.Display();






//        s.Display();
//        s.Display();
//        s.Display();



    }
}

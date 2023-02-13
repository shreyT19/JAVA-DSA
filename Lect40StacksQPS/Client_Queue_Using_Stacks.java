package Lect40StacksQPS;

public class Client_Queue_Using_Stacks {
    public static void main(String[] args) throws Exception {
        Queue_Using_Stacks qs = new Queue_Using_Stacks();
        qs.Enqueue(10);
        qs.Enqueue(20);
        qs.Enqueue(30);
        qs.Enqueue(40);
        qs.Enqueue(50);
        System.out.println(qs.Dequeue());
        System.out.println(qs.getFront());
    }
}

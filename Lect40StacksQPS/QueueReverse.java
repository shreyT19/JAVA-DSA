package Lect40StacksQPS;

import Lect21Recursion1.Reverse;
import Lect39Inheritsncr.DynamicQueue;

import java.util.Queue;

public class QueueReverse  {
    public static void main(String[] args) throws Exception{
        DynamicQueue dq = new DynamicQueue();
        dq.Enqueue(10);
        dq.Enqueue(20);
        dq.Enqueue(30);
        dq.Enqueue(40);
        dq.Enqueue(50);
        dq.Display();
        System.out.println("**********");
        ReverseQueue(dq);
        dq.Display();

    }
    public static void ReverseQueue(DynamicQueue dq) throws Exception {

        if(dq.isEmpmty()){
            return;
        }


        int x = dq.Dequeue();
        ReverseQueue(dq);
        dq.Enqueue(x);
    }
}

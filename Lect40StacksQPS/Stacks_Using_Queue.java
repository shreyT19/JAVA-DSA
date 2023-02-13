package Lect40StacksQPS;

import Lect39Inheritsncr.DynamicQueue;

public class Stacks_Using_Queue {

    private DynamicQueue data;
    public Stacks_Using_Queue(){
        this.data = new DynamicQueue();
    }
    public boolean isEmpty(){
        return this.data.isEmpmty();
    }
    public int size(){
        return this.data.size();
    }
    public void push(int item) throws  Exception{
        DynamicQueue temp = new DynamicQueue();
        while(!this.data.isEmpmty()){
            temp.Enqueue(this.data.Dequeue());
        }

        this.data.Enqueue(item);

        while (!temp.isEmpmty()){
            this.data.Enqueue(temp.Dequeue());
        }
    }
    public int pop() throws Exception{
        return this.data.Dequeue();
    }
    public int peek() throws Exception{
        return this.data.getFront();
    }
}
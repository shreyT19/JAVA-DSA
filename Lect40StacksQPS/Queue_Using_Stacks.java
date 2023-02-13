package Lect40StacksQPS;


import Lect39Inheritsncr.DynamicQueue;
import Lect39Inheritsncr.DynamicStacks;

public class Queue_Using_Stacks {
    private DynamicStacks data;
     public Queue_Using_Stacks(){
         this.data= new DynamicStacks();

     }
     public boolean isEmpty(){
         return this.data.isEmpty();
     }
     public int size(){
         return this.data.size();
     }
     public void Enqueue(int item) throws Exception{

         this.data.push(item);
     }
    public int Dequeue() throws Exception {
        DynamicStacks temp = new DynamicStacks();
        while (this.data.size() != 1) {
            temp.push(this.data.pop());
        }
        int x = this.data.pop();
        while (temp.size() != 0) {
            this.data.push(temp.pop());
        }
        return x;

    }

    public int getFront() throws Exception {
        DynamicStacks temp = new DynamicStacks();
        while (this.data.size() != 1) {
            temp.push(this.data.pop());
        }
        int x = this.data.peek();
        while (temp.size() != 0) {
            this.data.push(temp.pop());
        }
        return x;

    }

}

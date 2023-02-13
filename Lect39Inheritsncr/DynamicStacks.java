package Lect39Inheritsncr;

import Lect38StacksQueues.Stack;

public class DynamicStacks extends Stack {

    public void push(int item) throws Exception{
        if(super.isFull()){
            int [] arr = new int[2*super.data.length];
            for (int i = 0; i < super.data.length; i++) {
                arr[i]=this.data[i];
            }
            super.data=arr;
        }
        super.push(item);
    }
}

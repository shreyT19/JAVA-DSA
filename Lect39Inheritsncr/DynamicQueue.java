package Lect39Inheritsncr;
import Lect38StacksQueues.Queue;

public class DynamicQueue extends Queue {

    public void Enqueue(int item) throws Exception {
        if(super.isFull()){
            int [] arr = new int[2* super.data.length];
            for (int i=0;i<super.data.length;i++){
                int idx = (super.front+i)%super.data.length;
                arr[i]=super.data[i];

            }
            super.data=arr;
            this.front=0;
        }
        super.Enqueue(item);
    }
}

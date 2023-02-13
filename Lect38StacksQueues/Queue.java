package Lect38StacksQueues;

public class Queue {
    protected int [] data;
    protected int front =0;
    private int size=0;

    public Queue(){
        this.data=new int[5];
    }
    public Queue(int capacity){
        this.data=new int[capacity];
    }
    public boolean isEmpmty(){
        return this.size==0;
    }
    public boolean isFull(){
        return this.size==this.data.length ;
    }
    public int size(){
        return this.size;
    }

    public void Enqueue(int item) throws Exception{

        if(isFull()==true){
            throw new Exception("Khali Queue mein add krna jaruri hai ??");
        }


        //Circular Queue

        int i =(this.size+this.front)%this.data.length;
        this.data[i]=item;
        this.size++;
    }
    public int Dequeue() throws Exception {

        if(isEmpmty()==true){
            throw new Exception("Khali hai pehle add ta kr kuchh....");
        }

       int rv =  this.data[this.front];
        this.front=(this.front+1)%this.data.length;
        this.size--;
        return rv;
    }

    public int getFront() throws Exception{
        if(isEmpmty()==true){
            throw new Exception("Khali hai pehle add ta kr kuchh....");
        }
        return this.data[this.front];
    }
    public void Display(){
        for (int i = 0; i < this.size; i++) {
            int idx = (this.front+i)%this.data.length;
            System.out.print(this.data[idx] +" ");
        }
        System.out.println();
    }


}

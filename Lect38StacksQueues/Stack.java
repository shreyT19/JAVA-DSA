package Lect38StacksQueues;

public class Stack {
    private int top=0;
    protected int [] data;
 public Stack(){
     this.data = new int[5];
    }
    public Stack(int cap){
     this.data=new int[cap];
    }
    public boolean isEmpty(){
     return this.top==0;
    }
    public void push(int item) throws Exception {

     if(isFull()==true){
         throw new Exception("Abe aauakt ke andr reh lomde");
     }
     this.data[this.top]=item;
     this.top++;
    }
    public boolean isFull(){
        return this.top== this.data.length;
    }
    public int pop() throws Exception{

        if(isEmpty()==true){
            throw new Exception("Add ta kr kuchh lomde");
        }

     this.top--;
     return this.data[this.top];
    }
    public int peek(){
     return this.data[this.top-1];
    }
    public  int size(){
     return this.top;
    }
    public void Display(){
        for (int i = 0; i < this.top; i++) {
            System.out.print(this.data[i] + " ");
        }
        System.out.println();
    }
}

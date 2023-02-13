package Lect43LinkedListQPS;

import Lect42LinkedList.LinkedList;

public class Linked_List_Cycle {
    public class Node{
        int data; // value
       Node next; // address

        public Node(int data){
            this.data=data;
        }

    }
    private Node head; //first node head
    private int size;
    private Node tail;
    public void addFirst(int item){
        Node nn = new Node(item);
        if(this.size==0){
            this.head=nn;
            this.tail=nn;
            this.size++;
        }
        else {
            nn.next=this.head;
            this.head=nn;
            this.size++;
        }
    }
    public void addLast(int item){

        Node nn = new Node(item);
        if(this.size==0){
            addFirst(item);
        } else{
            this.tail.next=nn;
            this.tail=nn;
            this.size++;
        }
    }
    public void Cycle(){
        this.tail.next=this.head;
    }
    public boolean hasCycle(){
        Node fast = this.head;
        Node slow = this.head;

        while (fast!=null && fast.next!=null){
            fast= fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }

        return false;

    }


    public void Display(){

        Node temp = this.head;
        while (temp!=null) {
            System.out.print(temp.data + " -->");
            temp = temp.next;
        }
        System.out.println(".");
    }
    public static void main(String [] args){
        Linked_List_Cycle cl = new Linked_List_Cycle();
        cl.addLast(1);
        cl.addLast(2);
        cl.addLast(3);
        cl.addLast(4);
        cl.addLast(5);
        cl.addLast(6);
        cl.addLast(7);
        cl.addLast(8);

        cl.Display();
        cl.Cycle();
        System.out.println(cl.hasCycle());

    }

}

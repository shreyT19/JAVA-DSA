package Lect44StackQPS;



public class Cycle_Removal2 {

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
        this.tail.next=this.head.next.next;
    }
    public Node hasCycle(){
        Node fast = this.head;
        Node slow = this.head;

        while (fast!=null && fast.next!=null){
            fast= fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return slow;
            }
        }

        return null;

    }


    public void Display(){

        Node temp = this.head;
        while (temp!=null) {
            System.out.print(temp.data + " -->");
            temp = temp.next;
        }
        System.out.println(".");
    }









    public void removeCycle2() {
        Node meetup = hasCycle();
        if (meetup == null) {
            return;
        }

        int count = 1;
        Node temp = meetup;
        while (temp.next != meetup) {
            count++;
            temp = temp.next;
        }
        // m steps ahead

        Node fast = head;
        for (int i = 1; i <= count; i++) {
            fast = fast.next;
        }
        Node start = head;
        while (start.next != fast.next) {
            start = start.next;
            fast=fast.next;
        }
        fast.next = null;


    }

























    public static void main(String [] args){
        Cycle_Removal2 cl = new Cycle_Removal2();
        cl.addLast(1);
        cl.addLast(2);
        cl.addLast(3);
        cl.addLast(4);
        cl.addLast(5);
        cl.addLast(6);
        cl.addLast(7);
        cl.addLast(8);



        cl.Cycle();
        cl.removeCycle2();
        cl.Display();



    }
}

package Lect42LinkedList;

public class LinkedList {
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


    public int getFirst() throws Exception{
        if(this.head==null){
            throw new Exception("Khali hai be");

        }
        return this.head.data;
    }

public int getLast() throws Exception{
        if(this.tail==null){
            throw new Exception("Last ha be");

        }
        return this.tail.data;
}

public int removeFirst() throws Exception{

    if(this.head==null){
        throw new Exception("Last hai be !!");
    }

        Node temp = this.head;
        this.head= this.head.next;
        temp.next=null;
        this.size--;
        return temp.data;
}
public int removeLast() throws Exception{
        if(this.tail==null){
            throw new Exception("LinkedList khali hai be !!");
        }

    if(this.size==1){
        return this.getFirst();
    }
    Node temp = this.getNode(this.size-2);

    int rv = tail.data;
    this.tail= temp;
    this.tail.next=null;
    return rv;
}


    public void setAtIndex(int item,int k) throws Exception{
        if(k<0 || k>=size){
            throw new Exception("Index out of bound");
        }
        if(k==0){
             this.addFirst(item);
        } else if (k==this.size){
            this.addLast(item);
        } else {
            Node currentNode = new Node(item);
            Node previousNode = this.getNode(k-1);

            currentNode.next= previousNode.next;
            previousNode.next=currentNode;
            this.size++;
        }
    }









    public int removeAtIndex(int item) throws Exception{

        if(item<0 || item>size){
            throw new Exception("Index out of bound");
        }
        if(item==0){
            return this.removeFirst();
        } else if (item==this.size-1){
                return this.removeLast();
        }

        else {
            Node currentNode = this.getNode(item);

            Node previousNode=getNode(item-1);

            previousNode.next= currentNode.next;
            currentNode.next=null;
            this.size--;
            return currentNode.data;
        }
    }











public int getAtIndex(int k) throws Exception{


        return getNode(k).data;
}
    private Node getNode(int k) throws Exception{
        if(k<0 || k>size){
            throw new Exception("Index out of bound");
        }
        Node temp = head;
        for (int i = 1; i <=k; i++) {
            temp=temp.next;
        }
        return temp;
    }




    public void Display(){

Node temp = this.head;
        while (temp!=null) {
            System.out.print(temp.data + " -->");
            temp = temp.next;
        }
        System.out.println(".");
    }

}

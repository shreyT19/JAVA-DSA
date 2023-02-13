package Lect42LinkedList;

public class LinkedListClient {
    public static void main(String[] args) throws Exception {
       LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.Display();
        System.out.println(ll.removeAtIndex(0));
        ll.Display();
        ll.setAtIndex(70,2);
        ll.Display();

//        System.out.println(ll.getFirst());
//        System.out.println(ll.getLast());
//        ll.Display();
//        ll.removeFirst();
//        ll.Display();
//        ll.removeLast();
//        ll.Display();
    }
}

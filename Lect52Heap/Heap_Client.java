package Lect52Heap;

public class Heap_Client {
    public static void main(String[] args) {

        Heap hp = new Heap();
        hp.add(10);
        hp.add(20);
        hp.add(30);
        hp.add(-10);
        hp.add(-20);
        hp.add(7);
        hp.add(11);

        System.out.println(hp.getMin());

        hp.display();
        System.out.println(hp.remove());
        hp.display();
        System.out.println(hp.remove());
        hp.display();
        System.out.println(hp.remove());

        hp.display();

    }
}

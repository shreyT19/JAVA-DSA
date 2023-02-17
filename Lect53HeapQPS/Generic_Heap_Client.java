package Lect53HeapQPS;

public class Generic_Heap_Client {
    public static void main(String[] args) {
        Generic_Heap<Cars> gh = new Generic_Heap<>();

        gh.add(new Cars(1000,200,"Blue"));
        gh.add(new Cars(2000,400,"Black"));
        gh.add(new Cars(3000,100,"Red"));
        gh.add(new Cars(4000,600,"Green"));
        gh.add(new Cars(5000,700,"Yellow"));

        gh.display();
    }
}

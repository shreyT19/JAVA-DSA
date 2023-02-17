package Lect53HeapQPS;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_MaxElmnt_LC {
    public static void main(String[] args) {
        int k=4;
        int []arr = {3,2,3,1,2,4,5,5,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //Min Heap
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //Max Heap

        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if(pq.peek() <arr[i]){   //Shows element on top of the min heap
                pq.poll();  // Removes data
                pq.add(arr[i]);
            }
        }
        System.out.println(pq.peek());

    }
}

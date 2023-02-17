package Lect53HeapQPS;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Minimum {
    public static void main(String[] args) {

        int []arr = {2,1,3,4};
        System.out.println(Pair_Sum(arr));
    }
    public static int Pair_Sum(int [] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i< arr.length;i++){
            pq.add(arr[i]);
        }
        int sum =0;
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            sum += a + b;
            pq.add(a+b);
        }
        return sum;
    }


}

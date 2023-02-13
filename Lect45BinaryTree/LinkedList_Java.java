package Lect45BinaryTree;

import java.util.LinkedList;

public class LinkedList_Java {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
//        list.addFirst(90);
//        list.add(1,100);
        list.add(40);
        list.add(50);
        list.add(50);
        System.out.println(list);
        System.out.println(list.removeFirst());



    }
}

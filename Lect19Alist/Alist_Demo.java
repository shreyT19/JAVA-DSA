package Lect19Alist;

import java.util.ArrayList;

public class Alist_Demo {
    public static void main(String[] args){

        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(list);

        //Add

        list.add(10);
        list.add(20);
        list.add(40);
        list.add(30);
        System.out.println(list);

        //add at index

        list.add(1,69);
        list.add(5,79);
        System.out.println(list);

        System.out.println(list.size());
        System.out.println();


        //set

        list.set(2,50);
        list.set(4,59);
        System.out.println(list);
        System.out.println();

        //delete an element // range = 0 to n-1
        list.remove(1);
        System.out.println(list);
        System.out.println(list.remove(0));
        System.out.println(list);
        System.out.println();

        //get

        System.out.println(list.get(3));
        System.out.println(list);
        System.out.println();

        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        for(int i = list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //Enhanced For Loop

        for(int var: list){
            System.out.print(var + " ");
        }
        System.out.println();

        int [] arr = {12,24,36};
        for(int t19: arr){
            System.out.print(t19 + " ");
        }

        System.out.println();

        // 2D Array

        int [][] arr1 = new int[3][5];

        for(int [] a1: arr1){
            for(int a2: a1){
                System.out.print(a2 + " ");
            }
        }
    }
}

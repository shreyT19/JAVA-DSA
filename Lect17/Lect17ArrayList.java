package Lect17;

import java.util.ArrayList;
import java.util.Collections;

public class Lect17ArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();  //Wrapper Class
         System.out.println(list.size());
        System.out.println(list);

        //Add
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(60);
        list.add(90);

        System.out.println(list);

        list.add(0,50);
        list.add(1,30);
        System.out.println(list);

        //Set //Overrides the value at given index

        list.set(1,90);
        list.set(6,70);
        System.out.println(list);

        //Remove

        System.out.println(list.remove(1));
        list.remove(1);
        System.out.println(list);


        list.add(list.size(), 69);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}

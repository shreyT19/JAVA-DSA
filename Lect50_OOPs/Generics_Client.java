package Lect50_OOPs;

import java.util.ArrayList;

public class Generics_Client {
    public static void main(String[] args) {
        Genrics_Demo<String,Integer> gd = new Genrics_Demo<>();


        ArrayList list = new ArrayList();
        list.add(10);
        list.add("Shreyansh");
        list.add((69.69));
        System.out.println(list);

    }
}

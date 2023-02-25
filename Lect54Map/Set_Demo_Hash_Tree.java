package Lect54Map;

import java.util.*;

public class Set_Demo_Hash_Tree {
    public static void main(String[] args) {
        // Complexity - O(1)
        HashSet<Integer> set= new HashSet<>();
        set.add(-90);
        set.add(5);
        set.add(90);
        set.add(50);
        set.add(77);
        set.add(50);
        System.out.println(set);
        System.out.println();

        System.out.println(set.remove(90));
        System.out.println(set);
        System.out.println();

        System.out.println(set.remove(80));
        System.out.println(set);
        System.out.println();

        System.out.println(set.contains(-90));
        System.out.println();

        System.out.println(set.contains(80));
        System.out.println();








    //Complexity - log(N)
        TreeSet<Integer> set1= new TreeSet<>();
        set1.add(-90);
        set1.add(5);
        set1.add(90);
        set1.add(50);
        set1.add(77);
        set1.add(50);
//        set1.add(null); //not possible
        System.out.println(set1);
        System.out.println();

        //Complexity - log(N)
        //Insertion order preserved
        LinkedHashSet<Integer> set2= new LinkedHashSet<>();
        set2.add(-90);
        set2.add(5);
        set2.add(90);
        set2.add(50);
        set2.add(77);
        set2.add(50);
        set2.add(null);
        System.out.println(set2);
        System.out.println();
         
    }
}

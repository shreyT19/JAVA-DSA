package Lect54Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_demo {
    public static void main(String[] args) {

        // Prints data in dictionary order
        TreeMap<String,Integer> map = new TreeMap<>();
        // Complexity - log(N)
        map.put("Shreyansh",90);
        map.put("Aryan",89);
        map.put("Susaksham",88);
        map.put("Dheeraj",96);
        map.put("Akhil",95);

        System.out.println(map);

    }
}

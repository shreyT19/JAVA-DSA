package Lect54Map;

import java.util.LinkedHashMap;

public class LinkedHashMap_Demo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        // Complexity - O(1)
        map.put("Shreyansh",90);
        map.put("Aryan",89);
        map.put("Susaksham",88);
        map.put("Dheeraj",96);
        map.put("Akhil",95);

        System.out.println(map);
    }
}

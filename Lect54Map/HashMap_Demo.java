package Lect54Map;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Demo {
    public static void main(String[] args) {
        // Prints data in random order
        HashMap<String,Integer> map = new HashMap<>();
        // Complexity - O(N)

        //Add elements O(1)
        map.put("Shreyansh",90);
        map.put("Aryan",89);
        map.put("Susaksham",88);
        map.put("Dheeraj",96);
        map.put("Akhil",95);

        System.out.println(map);
        System.out.println();
        map.put("Dheeraj",98); //@override toString method
        System.out.println(map);
        System.out.println();

        //Get O(1)

        System.out.println(map.get("Preet"));
        System.out.println(map.get("Dheeraj"));
        System.out.println(map.get("Akhil"));
        System.out.println();

        // ContainsKey

        System.out.println(map.containsKey("Shreyansh"));
        System.out.println(map.containsKey("Preet"));
        System.out.println();

        //Remove
        System.out.println();
        System.out.println(map.remove("Shrey"));
        System.out.println(map.remove("Shreyansh"));
        System.out.println(map);
        System.out.println();
        map.put(null,97);
        System.out.println(map);
    }
}

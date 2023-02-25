package Lect54Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Print_HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        // Complexity - O(N)

        //Add elements O(1)
        map.put("Shreyansh",90);
        map.put("Aryan",89);
        map.put("Susaksham",88);
        map.put("Dheeraj",96);
        map.put("Akhil",95);
        map.put("Preet",95);

        //Way1
        Set<String> key = map.keySet();
        System.out.println(key);
        for(String val:key){
            System.out.println(val + " " + map.get(val));
        }
        System.out.println("***************");
        //Way2
        for(String val: map.keySet()){
            System.out.println(val + " " + map.get(val));
        }
        System.out.println("***************");
        //Way3
        ArrayList<String> ll = new ArrayList<>(map.keySet());
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i) + " " + map.get(ll.get(i)));
        }

    }
}

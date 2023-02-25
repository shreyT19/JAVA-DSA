package Lect54Map;

import java.util.ArrayList;
import java.util.HashMap ;
import java.util.List;

public class Group_Anagrams {
    public static void main(String[] args) {
        String []str ={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            String keyAns= GenerateKey(s);
            if(!map.containsKey(keyAns)){
                map.put(keyAns,new ArrayList<>());
            }
            map.get(keyAns).add(s);
        }
        List<List<String>> ans = new ArrayList<>();
        for(String key: map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
    public static String GenerateKey(String str){
        int [] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch- 'a']=freq[ch- 'a']+1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < freq.length; i++) {
            sb.append(freq[i]+" ");
        }
        return sb.toString();
    }
}

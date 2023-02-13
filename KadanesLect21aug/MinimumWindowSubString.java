package KadanesLect21aug;

import java.io.StringReader;

public class MinimumWindowSubString {
    public static void main(String[] args){
        String s= "ADOBECODEBANC";
        String t= "ABC";
    }
    public static void MinWindow(String s, String t){

        int[] freqT= new int[256];
        int[] freqS= new int[256];

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(0);
            freqT[ch]++;
        }
        int count=0;
        int ws=0;
int si=0;
        for (int ei=0;ei<s.length();ei++){
            char ch = s.charAt(0);
            freqS[ch]++;

            if(freqT[ch]>=freqS[ch]){
                count++;

            }
            // Window

            if(count==t.length()){
                ei= ei-si+1;
            }
        }


    }
}

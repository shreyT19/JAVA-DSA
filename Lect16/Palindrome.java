package Lect16;

public class Palindrome {
    public static void main(String[] args){
        String name = "nitin";

        Palindrome(name);
    }
    public static void Palindrome(String name) {

        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j <= name.length(); j++) {
                String s1 = name.substring(i, j);
                if (isPalindrome(s1) == true) {
                    System.out.println(s1);
                }
            }
        }
    }
    public static boolean isPalindrome(String name){
        int i =0;
        int j= name.length()-1;

        while(i<j){
            if(name.charAt(i)!=name.charAt(j)){
                return false;
            }
            i++;
            j--;
            }
        return true;
        }
}

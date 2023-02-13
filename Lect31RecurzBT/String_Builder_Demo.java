package Lect31RecurzBT;

public class String_Builder_Demo {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        System.out.println(sb);
        sb.append("Hello");
        System.out.println(sb);
        System.out.println();
        sb=sb.reverse();
        System.out.println(sb);
        sb.append("hello00");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        String s = sb.toString();// Builder To String
    }
}

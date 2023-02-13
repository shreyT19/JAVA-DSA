package Lect31RecurzBT;

public class String_Builder_2 {
    public static void main(String[] args){
//        StringBuilder SB = new StringBuilder("Hello");
//        System.out.println(SB.capacity());

    }
    public static void StringPrint(){
        String s ="";
        for (int i=0;i<=s.length();i++){
s = s+i;
            System.out.println(s);
        }
    }
    public static void StringBuilderPrint() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <=10000; i++) {
        sb = sb.append(i);
            System.out.println(sb);
        }
    }
}

package Lect21Recursion1;

public class Reverse {
    public static void main(String[] args){
        int n=5;
        Reverse(n);

    }
    public static void Reverse(int n){

        if(n==0){
            return;
        }

        System.out.println(n);
        Reverse(n-1);

    }
}

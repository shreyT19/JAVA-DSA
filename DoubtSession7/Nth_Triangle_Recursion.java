package DoubtSession7;

public class Nth_Triangle_Recursion {
    public static void main(String[] args){
        int n=3;
        System.out.println(Triangle(n));

    }
    public static int Triangle(int n){

        if(n==0){
            return 0;
        }
        int sum =0;
         sum = n + Triangle(n-1);
        return sum;
    }
}

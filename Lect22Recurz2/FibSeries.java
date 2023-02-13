package Lect22Recurz2;

public class FibSeries {
    public static void main(String[]args){
        int n=7;
        System.out.println(Fib(n));

    }
    public static int Fib(int n){

        if(n==0 || n==1){
            return n;
        }

        int F1 = Fib(n-1);
        int F2 = Fib(n-2);

        return F1+F2;
    }
}

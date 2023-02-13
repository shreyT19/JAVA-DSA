package Lect22Recurz2;

public class Factorial1 {
    public static void main(String[] args) {

        int n = 5;
        System.out.println(Facto(n));

    }

    public static int Facto(int n) {

        //Base Case
        if (n == 0 || n == 1) {
            return 1;
        }

        //smaller case = n-1;
        // ask recursion for (n-1)!
        return Facto(n - 1) * n;

    }
}

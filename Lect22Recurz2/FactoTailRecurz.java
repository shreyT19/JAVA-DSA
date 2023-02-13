package Lect22Recurz2;

public class FactoTailRecurz {
    public static void main(String[] args) {

        int n = 5;
        System.out.println(Facto(n,1));

    }

    public static int Facto(int n,int ans) {

        //Base Case
        if (n == 0 || n == 1) {
            return ans;
        }

        //smaller case = n-1;
        // ask recursion for (n-1)!

        return Facto(n-1, ans *n);

    }
}

package Lect25Recurz5;

public class Lexico_Counting {
    public static void main(String[] args){
        int n=1000;

        printcount(0,n);

    }
    public static void printcount(int curr,int end){

        if (curr > end) {
            return;
        }
        System.out.println(curr);
        int i = 0;
        if (curr == 0) {
            i = 1;
        }

        for (; i <= 9; i++) {
            printcount(curr * 10 + i, end);
        }

    }
}

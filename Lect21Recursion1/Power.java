package Lect21Recursion1;

public class Power {
    public static void main(String[] args){
        int a =12;
        int b=2;
        System.out.println(Power(a,b));

    }
    public static int Power(int a, int b){

        if(b==0){
            return 1;
        }


        int ans = Power(a,b-1); // (a^b-1)
        return ans*a;
    }
}

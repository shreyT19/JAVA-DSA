package Lect23Recurz3;

public class Coin_Toss {

    public static void main(String[] args)
    {

        int n=3;
        System.out.println(CoinToss(n,""));
    }
    public static int CoinToss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return 1;
        }

        int f1 =CoinToss(n-1,ans+"H");
        int f2 = CoinToss(n-1,ans+"T");
        return f1+f2;


    }
}

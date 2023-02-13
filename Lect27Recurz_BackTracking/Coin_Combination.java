package Lect27Recurz_BackTracking;

public class Coin_Combination {
    public static void main(String[] args){

        int [] coin={2,3,5,6};
        int amount =10;
        CoinC(coin,amount," ",0);
    }
    public static void CoinC(int [] coin, int amount,String ans,int idx){
        if(amount==0){
            System.out.println(ans);
            return;
        }

        for (int i = idx; i < coin.length; i++) {
            if(amount>=coin[i]){
                CoinC(coin, amount-coin[i],ans + coin[i],i);
            }
        }
    }
}

package Lect35Prime_Sieve;

public class Check_Prime_Number_n_root_n_tc {
    public static void main(String[] args){



        for (int i =31;i<=40;i++){
            if(isPrime(i)==true){
                System.out.println(i + " is a Prime Number");
            }
        }
    }
    public static boolean isPrime(int n){
        int div =2;
        while (div*div<=n){
            if(n%div==0){
                return false;
            }
            div++;
        }
        return true;
    }
}

package Lect35Prime_Sieve;

public class Prime_Sieve {
    public static void main(String[] args){

       PrimeSieve(10);


    }
    public static void PrimeSieve(int n){

        //true--> NOT A PRIME NUMBER
        //false--> PRIME NUMBER
        boolean [] prime = new boolean[n+1];
        prime[0]=true; //not prime
        prime[1]=true; //not prime

        for (int i = 2; i*i <= n; i++) {
            if(prime[i]==false){

                for (int multiples =2; multiples*i<=n;multiples++){
                    prime[i*multiples]=true;

                }

            }


        }
        for (int i = 2; i <= n; i++) {
            if (prime[i]==false){
                System.out.print(i+ " ");
        }

        }
    }
}

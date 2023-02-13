package Lect32DivideConqMerge;



public class Self_Pract_ii {
    public static void main(String[] args) {

        int n = 13;
        int fact =0;
        for (int i = 2; i < n; i++) {

            if(n%i==0){
                fact++;

            }
        }
        if(fact>=1){
            System.out.println("Not a Prime Number");
        } else {
            System.out.println("Prime Number");
        }
    }
}

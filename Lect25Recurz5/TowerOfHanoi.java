package Lect25Recurz5;

public class TowerOfHanoi {
    public static void main(String[] args){

        int plate =3;  // no of rods/ disks
        TOI(plate,"A","B","C"); // source, help and destinations are the rods. It is fixed i.e 3
    }
    public static void TOI(int n,String s, String h,String d ){

        if(n==0){
            return;
        }
        TOI(n-1,s,d,h); //
        System.out.println("Move " + n + "th disk from " + s + " to " + d);
        TOI(n-1,h,s,d);
    }
}

package Lect39Inheritsncr;

public class Method_Overloading {
    public static void main(String[] args){

        System.out.println(add(2,4));
        System.out.println(add(2,4,6));
        System.out.println(add(2,4,3.7));
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b,int c){
        return a+b+c;
    }
    public static int add(int a, int b,double c){
        return (int) (a+b+c);
    }
}

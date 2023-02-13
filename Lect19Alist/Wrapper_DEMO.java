package Lect19Alist;

public class Wrapper_DEMO {
    public static void main(String[] args){

        Integer a =100;
        int a1=10;

        System.out.println(a);
        System.out.println(a1);

        Short s1=78;
        Byte b1=19;

        System.out.println(s1);
        System.out.println(b1);

        a=a1; //Autoboxing - Primitive value is stored in Wrapper (int --> Integer)
        System.out.println(a);
        Integer ii=18;
        int i =8;
        i=ii; // Unboxing - Wrapper class value is stored in primitive (Integer --> int)

        System.out.println(i);
        System.out.println(ii);

        Integer d1= 12;
        Integer d2 = 12;
        System.out.println(d1==d2);

        Integer c1= 129;
        Integer c2 = 129;
        System.out.println(c1==c2);

    }
}

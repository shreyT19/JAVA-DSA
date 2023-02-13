package Lect39Inheritsncr;

public class Client {
    public static void main(String[] args){


        //Method Overriding - When there exists same function in Parent class and child class ,
        // the child class overrides the parent class.




        //case1
        System.out.println();
        System.out.println("Case 1");
        System.out.println();
        Parent obj=new Parent();
        System.out.println(obj.d); //1
        System.out.println(obj.d1);//10
        obj.fun(); //Fun in P
        obj.fun1(); //Fun in P

        //case2 -Compiler always checks for the left hand side. JVM checks for RHS..
        //So by defualt Parent obj will be accessed;
        // To access Child obj we need to typecast
        System.out.println();
        System.out.println("Case 2");
        System.out.println();

        Parent obj1= new Child();
        System.out.println(obj1.d); //1
        System.out.println(obj1.d1); //10
        System.out.println(((Child)(obj1)).d2);//20
        System.out.println(((Child)(obj1)).d);//2

        // JVM checks the "new"
        obj1.fun(); //Fun in C because of Method Overriding(Applies only to function)
        obj1.fun1(); //Fun in P
        ((Child)(obj1)).fun2(); //Fun in C



        //case3 -    Not allowed
        System.out.println();
        System.out.println("Case 3");
        System.out.println();
       // Child obj2 = new Parent();



        //Case4
        System.out.println();
        System.out.println("Case 4");
        System.out.println();
        Child obj3  = new Child();
        System.out.println(obj3.d);
        System.out.println(((Parent)obj3).d);
        System.out.println(obj3.d1);
        System.out.println(obj3.d2);
        obj3.fun();
        obj3.fun1();
        obj3.fun2();

    }
}

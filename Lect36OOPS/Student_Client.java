package Lect36OOPS;

public class Student_Client {
    public static void main(String[] args){
//        Student s = new Student();
//        s.name = "Shreyansh";
//        s.age=20;
//        System.out.println("His name is " + s.name + " and age is " +s.age);
//        Student s1 = new Student();
//        s1.name = "Aryan";
//        s1.age=10;
//        System.out.println("His name is " + s1.name + " and age is " +s1.age);
//
//        System.out.println();
//        s.introduce_yourself();
//        s1.introduce_yourself();

        Student s2 = new Student();
        Student s3 = new Student();
        s2.name = "Aryan";
        s2.age=10;
        s3.name = "Shreyansh";
        s3.age=11;

//        System.out.println(s2.name + " " + s2.age);
//        System.out.println(s3.name + " " + s3.age);
//        System.out.println("..............");
//        Test1(s2,s3);
//        System.out.println(s2.name + " " + s2.age);
//        System.out.println(s3.name + " " + s3.age);


        int my_age = 20;
        String my_name = "C";
        Test3(s2, s3.age, s3.name, my_age, my_name);
        System.out.println(s2.name + " " + s2.age);
        System.out.println(s3.name + " " + s3.age);
//        System.out.println(my_name + " " + my_age);

    }
    public static void Test3(Student s, int age, String name, int myAge, String myName) {
        s.age = 0;
        s.name = "_";
        age = 0;
        name = "_";
        myAge = 0;
        myName = "_";
    }
    public static void Test1(Student s2, Student s3) {
        Student t = s2;
        s2 = s3;
        s3 = t;

    }
    public static void Test2(Student s2 , Student s3){
        s2 = new Student();

        int temp = s2.age;
        s2.age= s3.age;
        s3.age= temp;

        s3 = new Student();
        String tempA = s2.name;
        s2.name= s3.name;
        s3.name= tempA;

    }
}

package Lect36OOPS;

public class Student {
    String name;
    int age;

    public void introduce_yourself(){
        String name = "Archis";
        System.out.println( name + " is a tomper and his age is "+ age );
        System.out.println( this.name + " is a tomper and his age is "+ this.age );
    }
}

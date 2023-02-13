package Lect37OOPS;

public class Person {
   private String name="akhil";
    private int age = 29;

    //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void fun(){
        int AdhaarNum = 901657;
        System.out.println(this.age + " " + this.name + " " + AdhaarNum);
    }

    //Setter
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    //Getter

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
}

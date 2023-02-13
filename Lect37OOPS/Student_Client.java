package Lect37OOPS;

public class Student_Client {
    public static void main(String[] args)  {
        Student s = new Student("Aryan",21);
        s.setName1("Yadav");
        s.setAge1(-29);

        System.out.println(s.getAge1() + " " + s.getName1());
    }

}

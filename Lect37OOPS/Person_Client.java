package Lect37OOPS;

public class Person_Client {
    public static void main(String[] args){
        Person p = new Person("Preet",69);
        p.setAge(19);
        p.setName("Dheemraj");
        System.out.println(p.getName());
        p.fun();
    }
}

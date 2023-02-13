package Lect50_OOPs;

public interface StackInterface extends DSAInterface{

    void push();
    int pop();
    int size();
    public static final int val=9;


    // After Java V8
    default void sayHey(){
        System.out.println("HelloMF");
    }
    public static void sayHey1(){
        System.out.println("Hemlo");

    }

    // After Java V8
    private int fun(){
        return 69;
    }
}

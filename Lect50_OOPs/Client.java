package Lect50_OOPs;

public class Client {
    public static void main(String[] args) {
        StackInterface_Client cs = new StackInterface_Client();
        cs.pop();
        cs.Display();
        System.out.println(StackInterface.val);
    }
}

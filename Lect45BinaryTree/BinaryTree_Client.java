package Lect45BinaryTree;

public class BinaryTree_Client {
    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        bt.Display();


        // Input : - 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false

        System.out.println(bt.max());
        System.out.println(bt.find(72));

        System.out.println(bt.height());
    }
}

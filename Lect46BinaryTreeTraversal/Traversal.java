package Lect46BinaryTreeTraversal;

import Lect45BinaryTree.BinaryTree;

import java.util.LinkedList;
import java.util.Scanner;

public class Traversal {
    Scanner scn = new Scanner(System.in);
    public class Node{
        int data;
        Node right;
        Node left;
    }
    private Node root;
    public Traversal(){

        this.root = createTree();
    }

    private Node createTree() {
        int item = scn.nextInt();
        Node nn = new Node();
        nn.data=item;
        boolean hasLeftChild= scn.nextBoolean();
        if(hasLeftChild==true){
            nn.left=createTree();
        }
        boolean hasRightChild= scn.nextBoolean();
        if(hasRightChild==true){
            nn.right=createTree();
        }
        return nn;
    }

    public void Display(){
        Display(this.root);
    }



    private void Display(Node nn){

        if(nn == null){
            return;
        }
        String str="";
        str = str + nn.data;
        str = "<--" +str+"-->";

        //LeftSide
        if(nn.left!=null){
            str= nn.left.data + str ;
        } else {
            str = "." + str;
        }

        //RightSide
        if(nn.right!=null){
            str=  str + nn.right.data ;
        } else {
            str = str + "." ;
        }

        System.out.println(str);
        Display(nn.left);
        Display(nn.right);
    }




    //max data item in a tree

    public int max(){
        return max(this.root);
    }
    private int max(Node nn){

        if(nn==null){
            return Integer.MIN_VALUE;
        }

        int leftMax = max(nn.left);
        int rightMax = max(nn.right);

        return Math.max(leftMax,Math.max(rightMax,nn.data));
    }





    //Find element
    public boolean find(int item){
        return find(this.root,item);
    }
    private boolean find(Node nn, int item){

        if(nn==null){
            return false;
        }
        if(nn.data==item){
            return true;
        }

        return find(nn.left,item) || find(nn.right,item);
    }


    //Height
    public int height(){
        return height(this.root);
    }
    private int height(Node nn){

        if(nn==null){
            return -1;
        }


        int leftHeight = height(nn.left);
        int rightHeight = height(nn.right);


        return Math.max(leftHeight,rightHeight)+1;
    }





    public void PreOrder(){
        PreOrder(this.root);
        System.out.println();
    }

    private void PreOrder(Node nn){
        if(nn==null){
            return;
        }
        System.out.print(nn.data+" ");
        PreOrder(nn.left);
        PreOrder(nn.right);
    }



    public void PostOrder(){
        PostOrder(this.root);
        System.out.println();
    }

    private void PostOrder(Node nn){
        if(nn==null){
            return;
        }

        PostOrder(nn.left);
        PostOrder(nn.right );
        System.out.print(nn.data + " ");
    }


    public void InOrder(){
        InOrder(this.root);
        System.out.println();
    }

    private void InOrder(Node nn){
        if(nn==null){
            return;
        }

        InOrder(nn.left);
        System.out.print(nn.data + " ");
        InOrder(nn.right );

    }






    public void LevelOrder(){
        LinkedList<Node> queue= new LinkedList<>();
        queue.add(this.root);

        while(!queue.isEmpty()){
            Node rv= queue.remove();
            System.out.print(rv.data +" ");
            if(rv.left!=null){
                queue.add(rv.left);
            }
            if(rv.right!=null){
                queue.add(rv.right);
            }

        }
        System.out.println();



    }



}

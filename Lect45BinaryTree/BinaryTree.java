package Lect45BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    Scanner scn = new Scanner(System.in);
    public class Node{
        int data;
        Node right;
        Node left;
    }
    private Node root;
    public BinaryTree(){

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










}

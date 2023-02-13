package Lect49TreeQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level_Order_BuildTree {
    Scanner scn = new Scanner(System.in);
    public class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;

    public Level_Order_BuildTree(){
         CreateTree();
    }


    private void CreateTree(){
        Queue<Node> qq = new LinkedList<>();
        int item = scn.nextInt();
        Node nn = new Node();
        nn.data=item;
        qq.add(nn);
        while(!qq.isEmpty()){
            Node rv = qq.remove();
            int c1= scn.nextInt();
            int c2= scn.nextInt();
            if(c1!=-1){
                Node new1 = new Node();
                new1.data=c1;
                rv.left=new1;
                qq.add(new1);
            }
            if(c2!=-1){
                Node new1 = new Node();
                new1.data=c1;
                rv.left=new1;
                qq.add(new1);
            }
        }

    }
}

package Recursion_Assignments;

import java.util.Scanner;

public class Rat_Chase_Cheeses {
    static boolean f= false;
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        char [][] maze = new char[n][m];
        for (int i = 0; i < maze.length; i++) {
            String s = scn.next();
            for (int j = 0; j < maze[0].length; j++) {
                maze[i][j]=s.charAt(j);
            }
            if(f == false){
                System.out.println("NO PATH FOUND");
            }

        }


        int [][] ans = new int[n][m];


        Rat(maze,0,0,ans);
    }
    public static void Rat(char[][] maze, int cr,int cc,int [][] ans){ //cc- current column cr-current row

        if(cr== maze.length-1 && cc == maze[0].length-1){
            if(maze[cr][cc]=='O') {
                f=true;
                ans[cr][cc]=1;
                display(ans);
                ans[cr][cc]=0;
            }

            return;
        }
        if(cr<0 || cr>= maze.length || cc<0 || cc>= maze[0].length || maze[cr][cc]=='X'){
            return;
        }
        int [] r = {0,-1,0,1};
        int [] c = {1,0,-1,0};

        //For 4 directions
       // Rat(maze,cr,cc+1,ans); //right
       // Rat(maze,cr-1,cc,ans);  //up
       // Rat(maze,cr,cc-1,ans);  //left
       // Rat(maze,cr+1,cc,ans);  //down

        maze[cr][cc]='X';
        ans[cr][cc]=1;
        // for n number of directions
         for (int i = 0; i < c.length; i++) {
            Rat(maze,cr+r[i],cc+c[i],ans);
        }
        maze[cr][cc]='O';
        ans[cr][cc]= 0;
    }
    public static void display(int [][] ans){
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

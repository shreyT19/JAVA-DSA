package Lect24Recurz4;

import java.util.Scanner;

public class Maze_Path_2D_Diagonal
{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        System.out.println("\n"+MazePath(n-1,m-1,0,0,"") );
        //printPath(n-1,m-1,0,0," ");


    }
    public static int MazePath(int endRow, int endColumn,int currRow,int currColm, String ans){

        if(currRow==endRow && currColm==endColumn){
            System.out.print(ans + " ");
            return 1;
        }
        int count1=0;
        int count2=0;
        int count3=0;

        if(currRow<endRow) {
           count1= MazePath(endRow, endColumn, currRow + 1, currColm, ans + "V");
        }
        if(currColm<endColumn) {
           count2= MazePath(endRow, endColumn, currRow, currColm + 1, ans + "H");
        }
        if(currColm<endColumn && currRow<endRow){
            count3=MazePath(endRow, endColumn, currRow+1, currColm + 1, ans + "D");
        }
        return count1+count2+count3;
    }
}
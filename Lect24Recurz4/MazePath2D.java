package Lect24Recurz4;

public class MazePath2D {
    public static void main(String[] args){
        int n=3;
        int m=3;
        printPath(n-1,m-1,0,0,"");
        System.out.println();
        System.out.println(printPathCount(n-1,m-1,0,0,""));

    }
    public static void printPath(int endRow, int endColumn,int currRow,int currColm, String ans){

        if(currRow==endRow && currColm==endColumn){
            System.out.println(ans);
            return;
        }
        if(currRow>endRow || currColm>endColumn){
            return;
        }

       printPath(endRow, endColumn, currRow,currColm+1,ans + "H");
        printPath(endRow, endColumn, currRow+1,currColm,ans + "V");



    }
    public static int printPathCount(int endRow, int endColumn,int currRow,int currColm, String ans){

        if(currRow==endRow && currColm==endColumn){
            System.out.println(ans);
            return 1;
        }
        if(currRow>endRow || currColm>endColumn){
            return 0;
        }

        int f1= printPathCount(endRow, endColumn, currRow,currColm+1,ans + "H");
        int f2 =  printPathCount(endRow, endColumn, currRow+1,currColm,ans + "V");

        return f1+f2;

    }
}

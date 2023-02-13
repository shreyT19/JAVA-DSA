package Lect30recurzBT;

public class Word_Search_LC {
    public static void main(String[] args){


        char [][] maze = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};

        String word="ABCB";
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if(maze[i][j]==word.charAt(0)) {
                    boolean ans = findWORD(maze, i, j, word, 0);
                    if (ans == true) {
                        System.out.println(ans);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }
    public static void Word_Search(char[][] maze,int cr,int cc,int idx){



    }
    public static boolean findWORD(char[][] maze,int cr,int cc, String word, int idx){

        if(idx== word.length()){
            return true;
        }


        if(cc<0 || cr<0 || cc>= maze[0].length || cr>= maze.length || maze[cr][cc]!=word.charAt(idx)){
            return false;
        }

        int []r = {-1,0, 0,1};
        int [] c ={0,-1,1,0};

        maze[cr][cc]='*';
        for (int i = 0; i < c.length; i++) {

            boolean ans= findWORD(maze,cr+r[i],cc+c[i],word,idx+1);
            if(ans==true){
                return ans;
            }
        }

        maze[cr][cc]=word.charAt(idx);
        return false;
    }
}

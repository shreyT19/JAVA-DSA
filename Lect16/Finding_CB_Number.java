package Lect16;

public class Finding_CB_Number {
    public static void main(String[] args) {

        String str = "81615";
        PrintSubString(str);

    }

    public static int PrintSubString(String str) {

        int count =0;
        for (int len = 1; len <= str.length(); len++) {
            for (int si = 0; si <= str.length() - len; si++) {
                int ei = si + len;
                String s = str.substring(si, ei);
                boolean[] Visited;
            }
        }
        return count;
    }
    public static boolean isVisited(boolean [] Visited, int si, int ei) {
        for(int i = si; i <= ei;i++) {
            if(Visited[i] == true) {
                return true;
            }
        }
        return false;
    }

    public static boolean CBNumber(long n) {
        if(n == 0 || n == 1) {
            return false;
        }
        int [] Arr = {2,3,5,7,11,13,17,19,23,29};
        for(int i = 0; i <Arr.length; i++) {
            if(n == Arr[i]) {
                return true;
            }
        }
        for(int i = 0 ; i < Arr.length ; i++) {
            if(n % Arr[i]==0) {
                return false;
            }
        }
        return true;
    }
}
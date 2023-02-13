package Lect24Recurz4;


public class Nokia_KeyPad {
    static String[] key = {"", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"};

    public static void main(String[] args) {
        String str = "12";
        System.out.println( "\n"+keyPad(str, ""));
    }

    public static int keyPad(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.print(ans + " ");
            return 1;
        }

        char ch = ques.charAt(0);
        String pressKey = key[ch - 48]; //48 is the ascii value for 0 (i.e 49-48==1st index)
        int count =0;
        for (int i = 0; i < pressKey.length(); i++) {
           count = count + keyPad(ques.substring(1), ans + pressKey.charAt(i));
        }
        return count;
    }
}

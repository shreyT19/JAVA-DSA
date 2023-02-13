package Lect19Alist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_userinput {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<4;i++){
            list.add(scn.nextInt());
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }

    }
}

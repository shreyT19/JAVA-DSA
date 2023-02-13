package Lect17;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_2 {
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        Scanner scn = new Scanner(System.in);

        int n=5;

        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            list.add(a);
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println("E_F_L");
        for(int val:list){
            System.out.print(val+ " ");
        }
    }
}

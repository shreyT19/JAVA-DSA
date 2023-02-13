package Lect51comparatorsVScomparables;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortEmployees {

    String name;
    int salary;

    public SortEmployees(String name, int salary){
        this.name=name;
        this.salary=salary;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();

        SortEmployees [] employee = new SortEmployees[n];
        for(int i=0;i<n;i++){
            String str = scn.next();
            int s = scn.nextInt();
            employee[i]= new SortEmployees(str,s);
        }

        Arrays.sort(employee, new Comparator<SortEmployees>() {
            @Override
            public int compare(SortEmployees o1, SortEmployees o2) {

                if(o1.salary==o2.salary){
                    return o1.name.compareTo(o2.name);
                }else {
                    return o2.salary - o1.salary;
                }
            }
        });

        for (int i = 0; i < n; i++) {
            if(employee[i].salary>=n){
                System.out.println(employee[i].name + " " + employee[i].salary);
            }
        }
    }

}

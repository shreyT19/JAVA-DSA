package Lect50_OOPs;

public class Functions_Demo {
    public static void main(String[] args) {
        int [] arr= {10,20,30,40,50};
        display(arr);
        String[] arr1 = {"Aryan","Susaksham","Dheeraj","Akhil"};
//        display(arr1);
    }
    public static<T> void display(int [] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}

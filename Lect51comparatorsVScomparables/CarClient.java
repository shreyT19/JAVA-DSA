package Lect51comparatorsVScomparables;

import java.util.Arrays;
import java.util.Comparator;

public class CarClient {
    public static void main(String[] args) {
        Cars [] car= new Cars[5];
        car[0]= new Cars(600, 100, "Red");
        car[1]= new Cars(700, 190, "Blue");
        car[2]= new Cars(800, 120, "Green");
        car[3]= new Cars(900, 160, "Black");
        car[4]= new Cars(1000, 180, "Yellow");

Display(car);
        System.out.println("*****************");
//        Sort(car,new CarComparatorPrice());
//        Sort(car,new CarComparatorColor());
//        Sort(car,new CarComparatorSpeed());

        Arrays.sort(car, new Comparator<Cars>(){
            public int compare(Cars o1, Cars o2){
                return o2.price-o1.price;
            }
        });
        Display(car);


    }
    public static void Display(Cars[] car){
        for(int i = 0; i < car.length; i++) {
            System.out.println(car[i] + " ");
        }

    }

    //Comparator
    public static <Shreyansh> void Sort(Shreyansh [] arr, Comparator<Shreyansh> com){
        for(int turn =1;turn< arr.length;turn++){
            for (int i = 0; i < arr.length-turn; i++) {
                if(com.compare(arr[i],arr[i+1])>0){
                    Shreyansh  temp= arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }

//Comparable

//    public static <Shreyansh implements Comparable<Shreyansh>> void Sort(Shreyansh [] arr){
//        for(int turn =1;turn< arr.length;turn++){
//            for (int i = 0; i < arr.length-turn; i++) {
//                if(arr[i].compareTo(arr[i+1])>0){
//                    Shreyansh  temp= arr[i];
//                    arr[i]= arr[i+1];
//                    arr[i+1]=temp;
//                }
//            }
//        }
//    }


}

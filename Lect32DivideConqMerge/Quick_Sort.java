package Lect32DivideConqMerge;

public class Quick_Sort {
    public static void main(String[] args){

        int [] arr = {7,5,3,1,9,4};

        int ans  =QuickSort(arr,0,arr.length-1);
        System.out.println("Index of the element is " + ans);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();



    }
    public static int QuickSort(int [] arr,int low, int high) {

        int lastElement = arr[high];
        int presentIndex = low;


        for (int i = low; i < high; i++) {
            if(arr[i]<=lastElement){
                int temp = arr[i];
                arr[i]=arr[presentIndex];
                arr[presentIndex]=temp;
                presentIndex++;
            }
        }
        int temp = arr[presentIndex];
        arr[presentIndex]=arr[high];
        arr[high]=temp;

        return presentIndex;
    }
}

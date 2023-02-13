package Lect18Binary;

import java.util.Arrays;
import java.util.Scanner;

public class AgreesiveCOW {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int nos = scn.nextInt();
        int noc= scn.nextInt();
        int [] stall = new int[nos];
        for(int i =0;i<stall.length;i++) {
            stall[i]=scn.nextInt();
        }
        Arrays.sort(stall);
        System.out.println(AGRCOW(stall,noc));
    }

    public static int AGRCOW(int[] arr, int noc) {

        int low = 0;
        int high = arr[arr.length-1] - arr[0]; //9-1
        int ans=0;
        while (low <= high) {
            int mid = (low+high)/2;
            if(isitpossible(arr,noc,mid)){
                mid=ans;
                low=mid+1;
            } else {
                high=mid-1;
            }

        }
        return ans;


    }
    public static boolean isitpossible(int [] arr,int noc, int mid ){
        int cows=1;
        int position = arr[0];
        int i=1;
        while(i<arr.length){
            if(arr[i]-position>=mid){
                 cows++;
                 position=arr[i];
            }
            if(cows==noc){
                return true;
            }
            i++;
        }
        return false;
    }
}

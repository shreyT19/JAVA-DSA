package Lect32DivideConqMerge;

public class Merge_Sort {
    public static void main(String[] args){
        int [] arr= {7,3,2,15,7,1};

       int []ans1= mergeSort(arr,0, arr.length-1);
        for (int i = 0; i < ans1.length; i++) {
            System.out.print(ans1[i]+" ");
        }
    }
    public static int [] mergeSort(int [] arr,int low,int high){

        if(low==high){
            int [] lastAns = new int[1];   // As while breaking the array elements , we will end up getting one element at the end
            lastAns[0]=arr[low];
            return lastAns;
        }
        int mid=(low+high)/2;
        int []first_sorted_arr_part = mergeSort(arr,low,mid);
        int []second_sorted_arr_part = mergeSort(arr,mid+1,high);


        return MergeSortedArays(first_sorted_arr_part,second_sorted_arr_part);
    }
    public static int [] MergeSortedArays(int [] arr1,int []arr2) {

        int n = arr1.length;
        int m= arr2.length;
        int i=0,j=0,k=0;
        int [] ans = new int[n+m];
        while (i<n && j<m){
            if(arr1[i]<=arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
            } else{
                ans[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<n){
            ans[k]=arr1[i];
            k++;
            i++;
        }
        while(j<m){
            ans[k]=arr2[j];
            k++;
            j++;
        }

        return ans;
    }

}

package Lect20SlidingWindow;

public class Subarray_Product_Less_Than_K {
    public static void main(String[] args){
        int [] arr={1,2,3,4,2,3};
        int k=10;

        System.out.println(SubProduct(arr,k));
    }
    public static int SubProduct(int[] arr, int k) {
        int si=0;
        int ei=0;
        int product=1;
        int ans=0;
        while(ei<arr.length){

            //Window Grow

            product=product*arr[ei];
            //Window Shrink
            while(product>=k && si<=ei){
                product=product/arr[si];
                si++;

            }
            //Ans Calculate

            ans = ans + ei-si+1 ;
            ei++;

        }
        return ans;
    }
}

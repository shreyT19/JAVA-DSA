package KadanesLect21aug;

public class Maximum_Sum_Circular_Subarray {
    public static void main(String[] args){
        int [] arr={5,-3,5};
        System.out.println(Circular_Sum(arr));
    }
    public static int Circular_Sum(int [] arr){
        int linear_sum=MaxSum(arr);
        int total_sum=0;
        for(int i=0;i< arr.length;i++){
            total_sum+=arr[i];
            arr[i]*=-1;
        }
        int mid_sum=MaxSum(arr);
        int cir_sum= total_sum+mid_sum;
        if(cir_sum==0){
            return linear_sum;
        }
        return Math.max(linear_sum,cir_sum);
    }
    public static int MaxSum(int [] arr){

        int ans= Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
            ans= Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }


}

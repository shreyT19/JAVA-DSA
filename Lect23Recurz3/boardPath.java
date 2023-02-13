package Lect23Recurz3;



public class boardPath {
    public static void main(String[] args){
        int destination=4;
        System.out.println("\n" + BP(destination,0,""));

    }
    public static int BP(int end , int current,String ans){

        if(current==end){
            System.out.print(ans+ " ");
            return 1;
        }
        if(current>end){
            return 0;
        }

        int jump1=BP(end, current+1,ans +1);
        int jump2=BP(end, current+2,ans +2);
        int jump3=BP(end, current+3,ans +3);

        return jump1+jump2+jump3;
    }
}

package Lect52Heap;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> data= new ArrayList<>();

    public void add(int item){
        this.data.add(item);

        upheapify(this.data.size()-1);

    }
    private void upheapify(int childIndex){
        int parentIndex = (childIndex-1)/2;

        if(this.data.get(parentIndex)>this.data.get(childIndex)){
            swap(parentIndex,childIndex);
            upheapify(parentIndex);
        }
    }

    public void swap(int i, int j){
        int iData = this.data.get(i);
        int jData = this.data.get(j);

        this.data.set(i,jData);
        this.data.set(j,iData);
    }




    public int remove(){

        swap(0,this.data.size()-1);
        int rv = this.data.remove(this.data.size()-1);
        downheapify(0);
        return rv;
    }

    private void downheapify(int parentIndex){

        int LeftChildIndex = 2 * parentIndex +1;
        int RightChildIndex = 2 * parentIndex +2;

        int min = parentIndex;

        if(LeftChildIndex< this.data.size() && this.data.get(LeftChildIndex)<this.data.get(min)){
            min=LeftChildIndex;
        }

        if(RightChildIndex< this.data.size() && this.data.get(RightChildIndex)<this.data.get(min)){
            min=RightChildIndex;
        }

        if(min != parentIndex){
            swap(min,parentIndex);
            downheapify(min);
        }


    }



    public int getMin(){
        return this.data.get(0);
    }

    public int size(){
        return this.data.size();
    }

    public void display(){
        System.out.println(this.data);
    }


}

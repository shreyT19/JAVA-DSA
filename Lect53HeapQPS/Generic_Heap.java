package Lect53HeapQPS;

import java.util.ArrayList;
import java.util.Comparator;

public class Generic_Heap<Shreyansh extends Comparable<Shreyansh>> {

        private ArrayList<Shreyansh> data= new ArrayList<>();

        public void add(Shreyansh item){
            this.data.add(item);

            upheapify(this.data.size()-1);

        }
        private void upheapify(int childIndex){
            int parentIndex = (childIndex-1)/2;

//            if(this.data.get(parentIndex)>this.data.get(childIndex)){
            if(isLarger(this.data.get(parentIndex), this.data.get(childIndex))>0){
                swap(parentIndex,childIndex);
                upheapify(parentIndex);
            }
        }

        public void swap(int i, int j){
            Shreyansh iData = this.data.get(i);
            Shreyansh jData = this.data.get(j);

            this.data.set(i,jData);
            this.data.set(j,iData);
        }




        public Shreyansh remove(){

            swap(0,this.data.size()-1);
            Shreyansh rv = this.data.remove(this.data.size()-1);
            downheapify(0);
            return rv;
        }

        private void downheapify(int parentIndex){

            int LeftChildIndex = 2 * parentIndex +1;
            int RightChildIndex = 2 * parentIndex +2;

            int min = parentIndex;

            if(LeftChildIndex< this.data.size() && isLarger(this.data.get(LeftChildIndex),this.data.get(min))>0){
                min=LeftChildIndex;
            }

            if(RightChildIndex< this.data.size() && isLarger(this.data.get(RightChildIndex),this.data.get(min))>0){
                min=RightChildIndex;
            }

            if(min != parentIndex){
                swap(min,parentIndex);
                downheapify(min);
            }


        }



        public Shreyansh getMin(){
            return this.data.get(0);
        }

        public int size(){
            return this.data.size();
        }

        public void display(){
            System.out.println(this.data);
        }

        public int isLarger(Shreyansh o1, Shreyansh o2){
            return o1.compareTo(o2);
        }

}

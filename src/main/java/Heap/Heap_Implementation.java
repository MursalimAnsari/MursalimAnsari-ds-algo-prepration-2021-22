package Heap;

import java.util.ArrayList;





public class Heap_Implementation {

   private static ArrayList<Integer> data;

    public static void main(String[] args) {

        //Heap_Implementation obj= new Heap_Implementation();

        data = new ArrayList<>();



    }



    // O(logn)
    public void add(int val){
        data.add(val);
        upheapify(data.size()-1);

    }

    private void upheapify(int i) {

        int parent_i = (i-1)/2;

        if(data.get(i)<parent_i){
            swap(i, parent_i);
            upheapify(parent_i);
        }

    }

    private void swap(int a, int b) {

        int x = data.get(a);
        int y= data.get(b);
        data.set(a,x);
        data.set(b,y);
    }

    // O(logn)
    public int remove(){
        if(this.size()==0){
            System.out.println("Underflow");
            return -1;
        }
        swap(0, data.size()-1);
        int val = data.remove(data.size()-1);
        downheapify(0);
        return val;
    }

    private void downheapify(int pi) {

        int min=pi;

        int left_i = 2*pi+1;
        if(left_i<data.size() &&  data.get(left_i)<data.get(min)){
            min=left_i;
        }

        int right_i = 2*pi+2;
        if(right_i<data.size() &&  data.get(right_i)<data.get(min)){
            min=right_i;
        }

        if (min!=pi){
            swap(pi, min);
            downheapify(min);
        }

    }

    // O(1)
    public int peek(){
    if(this.size()==0){
        System.out.println("Underflow");
        return -1;
       }
    return data.get(0);
  }


    public int size(){
        return data.size();
    }

}

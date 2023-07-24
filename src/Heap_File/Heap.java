package Heap_File;

import java.util.ArrayList;
import java.util.List;

public class Heap {

    List<Integer> nodes;
    public Heap() {
        this.nodes = new ArrayList<>();
        this.nodes.add(Integer.MIN_VALUE);
    }

    public void buildMinHeap(int [] arr){

//        Bottom Up Traversal
        for (int i = arr.length-1 ; i >= 0; i--) {
            this.nodes.add(arr[i]);
        }

//        DownHeapify for min
        for (int i = (this.nodes.size()-1)/2; i >=1 ; i--) {
            downHeapify(i,this.nodes.size());
        }

    }

    public void buildMaxHeap(int [] arr){

//        Bottom Up Traversal
        for (int i = arr.length-1 ; i >= 0; i--) {
            this.nodes.add(arr[i]);
        }

//        DownHeapify for Max
        for (int i = (this.nodes.size()-1)/2; i >=1 ; i--) {
            downHeapifyMax(i, nodes.size());
        }

    }


    public int top(){
        return this.nodes.get(1);
    }
    public void insert(int val){
        this.nodes.add(val);
        int currI=this.nodes.size()-1;
        int parentI = currI/2;
        while(currI>1 && this.nodes.get(parentI)>this.nodes.get(currI)){

            int temp = this.nodes.get(parentI);
            this.nodes.set(parentI,this.nodes.get(currI));
            this.nodes.set(currI,temp);

            currI=parentI;
            parentI=currI/2;
        }
    }

    public void downHeapify(int currI, int size) {

        int minI = currI;
        int leftC = currI*2;
        int rightC = (currI*2) +1;

        if (leftC < size && nodes.get(minI) > nodes.get(leftC)){
            minI=leftC;
        }

        if(rightC < size && nodes.get(minI) > nodes.get(rightC)){
            minI=rightC;
        }

        if(minI!=currI){
            int temp = this.nodes.get(minI);
            this.nodes.set(minI,this.nodes.get(currI));
            this.nodes.set(currI,temp);

            downHeapify(minI,size);
        }

    }

    public void downHeapifyMax(int currI, int size) {

        int maxI = currI;
        int leftC = currI*2;
        int rightC = (currI*2) +1;

        if (leftC < size && nodes.get(maxI) < nodes.get(leftC)){
            maxI=leftC;
        }

        if(rightC < size && nodes.get(maxI) < nodes.get(rightC)){
            maxI=rightC;
        }

        if(maxI!=currI){
            int temp = this.nodes.get(maxI);
            this.nodes.set(maxI,this.nodes.get(currI));
            this.nodes.set(currI,temp);

            downHeapifyMax(maxI,size);
        }

    }

//  remember you have to build it with max heap before sorting it using heap sort if you use this outside of class.
    public void heapsort(){
        int vSize = this.nodes.size();
        while (vSize>1){
            int temp = nodes.get(1);
            nodes.set(1,nodes.get(vSize-1));
            nodes.set(vSize-1,temp);
            vSize--;
            downHeapifyMax(1,vSize);
        }
    }
    public int poll(){

        int lastI = this.nodes.size()-1;
        int temp = this.top();
        this.nodes.set(1,this.nodes.get(lastI));
        this.nodes.set(lastI,temp);

        int rV = this.nodes.remove(lastI);

        downHeapify(1,this.nodes.size());

        return rV;
    }


    public static void main(String[] args) {
        Heap h = new Heap();
        h.insert(10);
        h.insert(20);
        h.insert(30);
        h.insert(5);
        h.insert(3);

        System.out.println(h.nodes);

        int val = h.poll();

        System.out.println(h.nodes+" "+val);

//        building min heap from array.

        Heap minh = new Heap();
//        int [] arr = {3,5,10,20,30};
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        minh.buildMinHeap(arr);
        System.out.println(minh.nodes);

//        building max heap from array.

        Heap maxh = new Heap();
        int [] arr2 = {2,1,0,4,3};
        maxh.buildMaxHeap(arr2);
        System.out.println(maxh.nodes);
        maxh.heapsort();
        System.out.println(maxh.nodes);

    }

}


package Heap_File;

public class Top_K_Elements {
    public static void main(String[] args) {
        int [] arr = {20,30,60,50,10,55,57,40};
        int k = 3;

//        using maxheap

//        Heap h = new Heap();
//        h.buildMaxHeap(arr);
//        System.out.println(h.nodes);
//        int k=4;
//        while(k-->0){
//            System.out.println(h.poll());
//        }



        kLargeElements(arr,arr.length,k);
    }

    public static void kLargeElements(int [] arr, int len , int k){
        Heap pq = new Heap();
        for (int i = 0; i < k; i++) {
            pq.insert(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {

            if(pq.top()<arr[i]){
                pq.poll();
                pq.insert(arr[i]);
            }
        }
        System.out.println(pq.nodes);
    }


}

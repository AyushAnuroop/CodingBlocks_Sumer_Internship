package Queues;

public class Queue_Using_Array {
    int [] data;
    int front;
    int size; // the number of elements present in the queue

    public Queue_Using_Array() {
        this.data = new int[5];
        this.front = 0;
        this.size = 0;
    }

    public Queue_Using_Array(int capicity) {
        this.data = new int [capicity];
        this.front=0;
        this.size=0;
    }


}

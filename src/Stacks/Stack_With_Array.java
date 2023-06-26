package Stacks;

import java.util.Arrays;

public class Stack_With_Array {
    int [] data;
    int tos;
    public Stack_With_Array() {
        this.data = new int[5];
        this.tos=-1;
    }


    public Stack_With_Array(int capacity) {
        this.data = new int[capacity];
        this.tos=-1;
    }

    public void push(int val) throws Exception{
        if(tos+1 == this.data.length) {
            throw new Exception("Stack is Full");
        }
        this.tos++;
        this.data[tos]=val;
    }

    public int pop() throws Exception{
        if(tos==-1) {
            throw new Exception("Stack is Empty");
        }
        this.tos--;
        return this.data[tos+1];
    }
    public int size (){
        return this.tos+1;
    }

    public boolean isEmpty(){
        return this.tos==-1;
    }

    public int peek(){
        return this.data[tos+1];
    }

    public void display(){
        for (int i = tos; i >=0 ; i--) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }



    public static void main(String[] args) throws Exception {

        Stack_With_Array st = new Stack_With_Array(3);
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        System.out.println(st.size());
        System.out.println(st.pop());
        st.push(40);
        st.display();
        st.push(50);
    }
}

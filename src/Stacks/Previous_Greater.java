package Stacks;

import java.util.Stack;

public class Previous_Greater {
    public static void main(String[] args) {
        int [] arr = {15, 10, 18, 12, 4, 6, 2, 8};
        int n = arr.length;
        prevGreater(arr,n);
    }

    private static void prevGreater(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            while(!s.isEmpty() && arr[i]>=s.peek())
                s.pop();
            if(s.isEmpty())
                System.out.print(-1+" ");
            else
                System.out.print(s.peek()+" ");
            s.push(arr[i]);
        }
    }
}

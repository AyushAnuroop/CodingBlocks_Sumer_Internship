package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Find_the_greater_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        circularGreater(arr,n);
    }

    private static void circularGreater(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int [] res = new int[n];
        for (int i = 2*n-1; i >=0; i--) {
            while(!s.isEmpty() && arr[i%n]>=s.peek())
                s.pop();

            if (s.isEmpty())
                res[i%n] = -1;
            else
                res[i%n] = s.peek();
            s.push(arr[i%n]);
        }

        for (int ele :
                res) {
            System.out.print(ele+" ");
        }
    }
}

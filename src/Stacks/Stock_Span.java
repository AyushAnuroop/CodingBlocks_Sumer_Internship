package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Stock_Span {
    public static void stockSpan(int[] arr, int n){
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            int span = s.isEmpty() ? i+1 : i-s.peek() ;
            System.out.print(span+" ");
            s.push(i);
        }
        System.out.println("END");
    }

//    Brute Force Approach
    private static void stockSpan2(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int span=1;
            for (int j = i-1; j>=0 && arr[j]<=arr[i] ; j--) {
                span++;
            }
            System.out.print(span+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
//        int [] arr = {13,15,12,14,16,8,6,4,10,30};
//        int n = arr.length;
        stockSpan(arr,n);
        stockSpan2(arr,n);
    }
}

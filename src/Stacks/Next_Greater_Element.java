package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }

//            nextGreater(arr,n);
            nextGreater2(arr,n);
        }
    }

//    Brute Force.
    private static void nextGreater2(int[] arr, int n) {
        int j=0;
        for(int i=0 ; i<n ; i++){
            for (j = i; j < n; j++) {
                if(arr[j]>arr[i]){
                    System.out.println(arr[i]+","+arr[j]);
                    break;
                }
            }
            if (j==n) {
                System.out.println(arr[i]+","+-1);
            }
        }
    }

//      11 13 21 3
//      11 9 13 21 3
    private static void nextGreater(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            if(s.isEmpty())
                s.push(arr[i]);

        }
    }
}

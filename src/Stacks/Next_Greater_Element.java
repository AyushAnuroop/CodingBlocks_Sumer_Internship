package Stacks;

import java.util.*;

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
            nextGreater(arr,n);
            System.out.println("=========");
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

//      11 13 21 3 ==> 13,21,-1,-1
//      11 9 13 21 3 ==>13, 13, 21, -1,-1
    private static void nextGreater(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = n-1; i >=0; i--) {
            while(!s.isEmpty() && arr[i]>s.peek())
                s.pop();
            if(s.isEmpty())
                list.add(arr[i]+" "+-1);
            else
                list.add(arr[i]+" "+s.peek());
            s.push(arr[i]);
        }
        Collections.reverse(list);
        for (String str : list) {
            System.out.println(str);
        }
    }
}

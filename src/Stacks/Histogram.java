package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
//        Brute Force
        histogram2(arr,n);

//        Efficient
        int [] prevS ;
        int [] nextS ;
        prevS = prevSmaller(arr,n);
        nextS= nextSmaller(arr,n);
        histogram3(prevS,nextS,arr,n);

//        Efficient Approach
        histogram(arr,n);
    }
//    Efficient approach


    private static void histogram(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int max=0;
        int curr;
        int top;
        for (int i = 1; i < n; i++) {
            while (!s.isEmpty() && arr[i]<=arr[s.peek()]){
                top = s.pop();
                curr = arr[top]*(s.isEmpty() ? i : (i-s.peek()-1));
                max=Math.max(curr,max);
            }
            s.push(i);
        }
        while (!s.isEmpty()){
            top=s.pop();
            curr=arr[top]*(s.isEmpty() ? n : (n-s.peek()-1));
            max=Math.max(curr,max);
        }
        System.out.println(max);
    }

    //    Better Approach
    private static void histogram3(int[] ps, int[] ns, int[] arr, int n) {
        int curr=0,max=0;
        for (int i = 0; i < n; i++) {
            curr=arr[i];
            curr+=(i-ps[i]-1)*arr[i];
            curr+=(ns[i]-i-1)*arr[i];
            max=Math.max(curr,max);
        }
        System.out.println(max);
    }
    private static int[] nextSmaller(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int [] res = new int [n];
        for (int i = n-1; i >=0; i--) {
            while(!s.isEmpty() && arr[i]<=s.peek())
                s.pop();
            if(s.isEmpty())
                res[i]=n+1;
            else
                res[i]=s.peek();
            s.push(arr[i]);
        }
        return res;
    }

    private static int[] prevSmaller(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int [] res = new int [n];
        for (int i = 0; i < n; i++) {
            while(!s.isEmpty() && arr[i]<=s.peek())
                s.pop();
            if(s.isEmpty())
                res[i]=-1;
            else
                res[i]=s.peek();
            s.push(arr[i]);
        }
        return res;
    }


    //    Brute Force Approach.
    private static void histogram2(int[] arr, int n) {
        int max=0;
        for (int i = 0; i < n; i++) {
            int ans=arr[i];
            for (int j = i-1; j >=0; j--) {
                if(arr[i]<=arr[j]) {
                    ans += arr[i];
                }
                else
                    break;
            }
            for (int j = i+1; j < n; j++) {
                if(arr[i]<=arr[j]) {
                    ans += arr[i];
                }
                else
                    break;
            }
            max=Math.max(max,ans);
        }
        System.out.println(max);
    }

}

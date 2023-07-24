package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class Next_Smaller_Element {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        int [] res ;
        res = nextSmaller(arr,n);
        System.out.println(Arrays.toString(res));
    }

    private static int[] nextSmaller(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int [] res = new int [n];
        for (int i = n-1; i >=0; i--) {
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

}

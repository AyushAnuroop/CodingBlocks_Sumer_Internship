package Recursion;

public class Print_Array {

    public static void print(int[] arr , int s) {
        if(s==arr.length)
            return ;
        System.out.print(arr[s]+" ");
        print(arr, s+1);
    }
    public static void print2(int [] arr, int s, int e) {
        if(s>e)
            return ;
        int mid = (s+e)/2;
        print2(arr, s, mid-1);
        System.out.print(arr[mid]+" ");
        print2(arr, mid+1, e);
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        print(arr, 0);
        System.out.println();
        print2(arr, 0, arr.length-1);
    }
}

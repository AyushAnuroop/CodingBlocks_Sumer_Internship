package Recursion;

public class First_And_Last_Occurence {

    public static int firstIndex(int [] arr, int s, int target) {
        if(arr.length==s)
            return -1;
        if(arr[s]==target)
            return s;
        int res = firstIndex(arr, s+1, target);
        return res;
    }

    public static int lastIndex(int [] arr, int e, int target) {

        if(e==arr.length)
            return -1;
        int res = lastIndex(arr, e+1, target);
        if(res==-1 && arr[e]==target)
            return e;
        return res;
    }
    
    public static void main(String[] args) {
        int [] arr = {10,20,30,10,50,23,54,56,23,67,45,23,45};
        int firstIndex = firstIndex(arr, 0, 10);
        System.out.println(firstIndex);
        int lastIndex = lastIndex(arr, 0, 10);
        System.out.println(lastIndex);
    }
}

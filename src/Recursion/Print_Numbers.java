package Recursion;

public class Print_Numbers {
    public static void ascend(int n) {
        if(n==0)
            return;
        ascend(n-1);
        System.out.print(n+" ");
    }
    public static void descend(int n) {
        if(n==0)
            return;
        System.out.print(n+" ");
        descend(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        ascend(n);
        System.out.println();
        descend(n);
    }
}

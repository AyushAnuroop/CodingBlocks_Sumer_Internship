package Recursion;

public class Climbing_Stairs_K_Steps {

    public static int stairs(int ci, int n, int k) {
        if(ci==n)
            return 1;
        if(ci>n)
            return 0;
        int ans=0;
        for(int i=1 ; i<=k ; i++){
            ans += stairs(ci+i, n, k);
        }
        return ans;
    }
    public static int stairs2(int n, int k) {
        if(n==0)
            return 1;
        if(n<0)
            return 0;
        int ans=0;
        for(int i=1 ; i<=k ; i++){
            ans += stairs2(n-i, k);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        int k=2;
        int res = stairs(0, n ,k);
        System.out.println(res);
        System.out.println();
        System.out.println(stairs2(n, k));
    }
}

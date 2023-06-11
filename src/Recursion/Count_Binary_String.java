package Recursion;

public class Count_Binary_String {


    public static int sol(int n) {
        if(n==1)
            return 2;
        if(n==2)
            return 3;
        int res = sol(n-1)+sol(n-2);
        return res;
    }
    public static int countBin(String s, int n) {
        if(s.length()>=2 && s.charAt(s.length()-1)=='1' && s.charAt(s.length()-2)=='1')
            return 0;
        if(n==1 || s.length()==n)
            return 1;
        int a = countBin(s+"1", n);
        int b = countBin(s+"0", n);
        return a+b;
    }
    public static void main(String[] args) {
        int n=10 ;
        System.out.println(sol(n));
        System.out.println(countBin("",n));
    }
}

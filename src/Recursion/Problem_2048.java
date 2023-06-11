package Recursion;

public class Problem_2048 {

    static String [] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void printName(int n) {
        if(n==0)
            return;
        printName(n/10);
        int digit=n%10;
        System.out.print(arr[digit]+" ");
    }
    public static void main(String[] args) {
        int n=2048;
        printName(n);
    }
}

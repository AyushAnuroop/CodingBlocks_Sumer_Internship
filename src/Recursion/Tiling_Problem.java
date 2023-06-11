package Recursion;

public class Tiling_Problem {

    public static int tiles(int n) {
        if(n<=2)
            return n;
        int a = tiles(n-1);
        int b = tiles(n-2);
        return a+b;
    }
    public static void main(String[] args) {
        int n = 7 ; //size of nx2 board;
        System.out.println(tiles(n));
    }
}

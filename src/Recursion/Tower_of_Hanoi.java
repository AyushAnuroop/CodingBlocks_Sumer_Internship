package Recursion;

public class Tower_of_Hanoi {

    public static int solver(int n, char src, char aux, char dest) {
        if(n==0)
            return 1;
        int a = solver(n-1, src, dest, aux);
        System.out.println("Move "+n+"thfrom "+src+" to "+dest);
        int b = solver(n-1, aux, src, dest);
        return a+b;
    }
    public static void main(String[] args) {
        int n=2 ; //Number of Discs.
        int count  = solver(n, 'A', 'B', 'C');
        System.out.println(count);
    }
}

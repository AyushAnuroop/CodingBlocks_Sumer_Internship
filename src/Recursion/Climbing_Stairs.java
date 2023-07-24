package Recursion;// Write a program to count and print the total number of ways possible for a person to climb the stairs
// with one and two steps at a time.

public class Climbing_Stairs {

    // more efficient with recursion
    public static int climbStair(int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        int one = climbStair(n - 1);
        int two = climbStair(n - 2);
//        int res = one + two;
        return one+two;
    }

    // Using Recursion
    public static int climb(String s, int curr, int n) {
        if (n == curr) {
            System.out.println(s);
            return 1;
        }
        if (n < curr)
            return 0;
        int one = climb(s + "1", curr + 1, n);
        int two = climb(s + "2", curr + 2, n);
        int res = one + two;
        return res;
    }

    // Using Dynamic Programming
    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 30; // number of stairs.
//        System.out.println("\n" + climb("", 0, n));
        System.out.println(climbStairs(n));
//        System.out.println(climbStair(n));
    }
}

package GLA_CP_2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MMA_Fighter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] fighter = new int[n];
        for (int i = 0; i < n; i++) {
            fighter[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        strongerFighter(fighter,n,k);
    }

    private static void strongerFighter(int[] fighter, int n, int k) {
        Deque<Integer> q = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        for (int j = 0; j <k-1; j++) {
            q.addLast(fighter[j]);
            max = Math.max(max,q.getLast());
        }

        for (int i = k-1; i <n; i++) {
            q.addLast(fighter[i]);
            max = Math.max(max,q.getLast());
            System.out.print(max+" ");
            q.pollFirst();
        }
    }
}

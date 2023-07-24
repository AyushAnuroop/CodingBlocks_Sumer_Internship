package Stacks;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Importance_Of_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int [] process = new int [n];
        ArrayList<Integer> order = new ArrayList<>();
        for (int i = 0; i < n*2; i++) {
            if(i<n)
//                process.add(sc.nextInt());
//            else
                order.add(sc.nextInt());
        }
//        int time = timeTaken(process,order);
    }

    private static int timeTaken(ArrayList<Integer> process, ArrayList<Integer> order) {
        Stack<Integer> s = new Stack<>();
        int time=0;
        int i=0;
        while (order.isEmpty()){
            if(process.get(i).equals(order.get(0))) {
                order.remove(0);
                process.remove(0);
                time++;
            }
            else {
                process.add(process.remove(0));
            }
        }

        return 0;
    }
}

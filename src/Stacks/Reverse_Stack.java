package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_Stack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<>();
        while(n-->0)
            s.push(sc.nextInt());
        s=reversal(s,new Stack<Integer>());
        while(!s.isEmpty())
            System.out.print(s.pop()+" ");
    }

    private static Stack<Integer> reversal(Stack<Integer> s, Stack<Integer> temp) {
        if(s.isEmpty()) {
            return temp;
        }
        temp.push(s.pop());
        reversal(s,temp);
        return temp;
    }
}

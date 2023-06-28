package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Delete_Middle_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = (int)Math.ceil(n/2f);
        Stack <Integer> s = new Stack<>();
        while(n-->0){
            s.push(sc.nextInt());
        }
        deleteMid(s,mid);
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

    private static void deleteMid(Stack<Integer> s, int mid) {
        if(s.size()==mid){
            s.pop();
            return;
        }
        int ele = s.pop();
        deleteMid(s,mid);
        s.push(ele);
    }
}

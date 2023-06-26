package Stacks;

import java.util.Stack;

//push(item) - use to push item in the stack. return type int
//pop(item) - use to delete the element from the top of the stack , return type int
//size() - use to find the count of elements
//isEmpty() - use to find the stack is empty or not.
//peek() - use to check which element is present at the top.

public class Stack_Implementation {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.push(2));
        System.out.println(s);
    }
}

package Stacks;

import java.util.Stack;

public class Balanced_Parenthesis {
    public static void main(String[] args) {
        String str = "({[]})()";
        if(checkBalance(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

//    for matching brackets.
    public static boolean match(char a ,char b){
        return ((a==')' && b=='(') || (a=='}' && b=='{') || (a==']' && b=='['));
    }
    private static boolean checkBalance(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
//            if open bracket then push it to stack.
            if(ch=='(' || ch=='{' || ch=='[')
                s.push(ch);

            else {

//                if s.isEmpty is true means closing bracket is first which makes it unbalanced.
//                if the top of the stack bracket and closing bracket didn't match means unbalanced
                if(s.isEmpty() || !match(ch,s.peek()))
                    return false;

//                else it means that the bracket matches so pop the tos bracket.
                else
                    s.pop();
            }
        }
//        if the stack is empty means that the string is balanced.
        return s.isEmpty();
    }
}

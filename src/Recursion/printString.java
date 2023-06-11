package Recursion;

public class printString {
    public static void print(String s, int i) {
        if(s.length()==i)
            return;
        System.out.print(s.charAt(i));
        print(s, i+1);
    }
    public static void print2(String s) {
        if(s.length()==0)
            return;
        System.out.println(s.charAt(0));
        print2(s.substring(1));
    }
    public static void main(String[] args) {
        String st = "Java";
        print(st,0);
        print2(st);
    }
}

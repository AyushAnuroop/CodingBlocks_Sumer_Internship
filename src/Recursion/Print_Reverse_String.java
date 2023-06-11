package Recursion;

public class Print_Reverse_String {
    public static void print(String s) {
        if(s.length()==0)
            return ;
        System.out.print(s.charAt(s.length()-1));
        print(s.substring(0,s.length()-1));
    }
    public static void print2(String s) {
        if(s.length()==0)
            return ;
        print2(s.substring(1));
        System.out.print(s.charAt(0));
    }
    public static void main(String[] args) {
        String st = "Classes";
        print(st);
        System.out.println();
        print2(st);
    }
}

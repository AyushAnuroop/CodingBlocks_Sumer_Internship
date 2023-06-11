package Recursion;

public class Count_Length {
    public static int length(String s) {
        if(s.isEmpty())
            return 0;
        int curr_len= length(s.substring(1));
        int res=curr_len+1;
        return res ;
    }
    public static void main(String[] args) {
        String st= "Coding";
        System.out.println(length(st));
    }
}

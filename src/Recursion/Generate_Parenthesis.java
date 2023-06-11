package Recursion;

public class Generate_Parenthesis {

    public static void genrate(String s,int open, int close, int n) {
        if(open==n && close==n){            //it isn't necessariy to metion open==n case.
            System.out.println(s); 
            return ;
        }
        if(open<n)
            genrate(s+"(", open+1, close, n);
        if(close<open)
            genrate(s+")", open, close+1, n);
    }
    public static void main(String[] args) {
        int n=3;
        genrate("",0,0,n);
    }
}

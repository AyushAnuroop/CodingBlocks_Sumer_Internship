package Recursion;

public class Subsequences {

    public static int subsequence(String ques, String ans) {
        if(ques.isEmpty()){
            System.out.print(ans+" ");
            return 1;
        }
        int b = subsequence(ques.substring(1), ans+ques.charAt(0));
        int a = subsequence(ques.substring(1), ans);
        return a+b;
    }
    public static void main(String[] args) {
        String str = "abcd";
        int num = subsequence(str, "");
        System.out.println("\n"+num);
    }
}

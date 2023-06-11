package Recursion;

public class Ascii_Subsequences {

    public static int  asciiSubseq(String ques, String ans) {
        if(ques.isEmpty()){
            System.out.print(ans+" ");
            return 1;
        }
        int a = asciiSubseq(ques.substring(1), ans);
        int b = asciiSubseq(ques.substring(1), ans+ques.charAt(0));
        int c = asciiSubseq(ques.substring(1), ans+(int)(ques.charAt(0)));
        return a+b+c;
    }
    public static void main(String[] args) {
        String str = "ab";
        System.out.println("\n"+asciiSubseq(str, ""));
    }
}

//  b 98 a ab a98 97 97b 9798
// 9
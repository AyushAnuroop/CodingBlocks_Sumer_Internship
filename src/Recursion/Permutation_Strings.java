package Recursion;

public class Permutation_Strings {

    public static void permutations(String ques, String ans) {
        if(ques.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i=0 ; i<ques.length() ; i++){
            char cch = ques.charAt(i);
            String temp = ques.substring(0, i)+ques.substring(i+1);
            permutations(temp, ans+cch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permutations(str, "");
    }
}

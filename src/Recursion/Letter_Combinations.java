package Recursion;

public class Letter_Combinations {

    static String [] key = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; 

    public static void phone(String num,String ans) {
        if(num.isEmpty()){
            System.out.println(ans);
            return;
        }
        int digit = num.charAt(0)-48;
        String s = key[digit];
        for(int i=0 ; i<s.length() ; i++){
            phone(num.substring(1), ans+s.charAt(i));
        }
    }
    public static void main(String[] args) {
        String num = "";
        phone(num, "");

    }
}

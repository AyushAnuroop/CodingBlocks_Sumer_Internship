package Recursion;

public class Replace_All_Pi {

    public static String replace(String s, String ans) {    
        if(s.length()<=1){
            return ans+s.charAt(0);
        }
        if((s.charAt(0)=='p' && s.charAt(1)=='i'))
            return replace(s.substring(2), ans+"3.14");
        else    
            return replace(s.substring(1), ans+s.charAt(0));
    }
    
    public static void main(String[] args) {
        String str = "apipipippxxi";
//        String str = "penpineappleapplepen";
        System.out.println(replace(str,""));
    }
}

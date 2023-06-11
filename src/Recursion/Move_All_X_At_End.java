package Recursion;

public class Move_All_X_At_End {

    public static String moveX(String ques, String ans,int c) {
        
        if(ques.isEmpty()){
            for(int i=1 ; i<=c ; i++)
                ans=ans+"x";
            return ans;
        }
        char ch = ques.charAt(0);
        if(ch=='x')
            return moveX(ques.substring(1), ans, c+1);
        else
            return moveX(ques.substring(1), ans+ch, c);
    }


    public static String move(String s) {
        if(s.length()<=1)
            return s;
        String rem = s.substring(1);
        rem = move(rem);
        if(s.charAt(0)=='x')
            return rem+'x';
        else    
            return s.charAt(0)+rem;
    }


    public static void main(String[] args) {
        String str = "axBxxcxdxghjx";
        System.out.println(moveX(str, "",0));
        System.out.println(move(str));
    }
}

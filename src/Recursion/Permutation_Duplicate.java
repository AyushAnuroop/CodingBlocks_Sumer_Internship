package Recursion;

public class Permutation_Duplicate {
    

    public static void perm_dup(String ques, String ans) {
        if(ques.isEmpty()){
            System.out.println(ans);
            return ;
        }
        for(int i=0 ; i<ques.length(); i++){
            char ch = ques.charAt(i);
            boolean flag = true;
            for(int j=i+1;j<ques.length();j++){
                if(ques.charAt(j)==ch){
                    flag=false;
                    break;
                }
            }
            if(flag){
                String temp = ques.substring(0,i)+ques.substring(i+1);
                perm_dup(temp, ans+ch);
            }
        }
    }
    public static void main(String[] args) {
        String str = "aabc";
        perm_dup(str, "");
    }
}

package Recursion;

public class Duplicate_Character_Formatting {
    public static void duplicate(String ques, String ans){
		if(ques.isEmpty()){
			System.out.println(ans);
			return ;
		}
		if(ques.length()>=2 && ques.charAt(0)==ques.charAt(1))
			duplicate(ques.substring(1),ans+ques.charAt(0)+"*");
		else
			duplicate(ques.substring(1),ans+ques.charAt(0));
	}
    public static void main(String[] args) {
        String s = "mississippi";
        duplicate(s, "");
    }
}


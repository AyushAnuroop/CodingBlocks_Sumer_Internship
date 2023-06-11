package Recursion;

import java.util.*;
public class Mapped_Strings {
	public static char ascii(String s){
        int val = Integer.parseInt(s);
        if(val>=1 && val<=26){
            return (char)(val+64);
        }
        return '!';
    }

    public static ArrayList<String> codes(String ques, String ans, ArrayList<String> list)  {
        if(ques.length()==0){
            // System.out.println(ans);
            list.add(ans);
            return list;
        }
        ArrayList <String> temp = new ArrayList<>(list);
        if(ascii(ques.substring(0,1))!='!'){
            temp = codes(ques.substring(1), ans+ascii(ques.substring(0,1)),list);
        }
        if(ques.length()>=2 && ascii(ques.substring(0,2))!='!'){
            temp = codes(ques.substring(2), ans+ascii(ques.substring(0,2)),list);
        }
        return temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		String str = sc.next();

		for(String s : codes(str,"",new ArrayList<String>())){
			System.out.println(s);
		}
        sc.close();
    	// System.out.println(codes(str,"",new ArrayList<String>()));
		// Your Code Here
    }
}
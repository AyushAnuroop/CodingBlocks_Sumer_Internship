package Recursion;

import java.util.ArrayList;

public class Codes_of_String {

    public static char ascii(String s){
        int val = Integer.parseInt(s);
        if(val>=1 && val<=26){
            return (char)(val+96);
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
    public static void main(String[] args) {
        String str = "1125";
        System.out.println(codes(str, "", new ArrayList<String>()));
        // System.out.println(codes(str, ""));
    }
}

// [aabe, aay, ale, kbe, ky]
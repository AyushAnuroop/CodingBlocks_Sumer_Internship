package Recursion;

public class Convert_String_to_Integer {

    public static int convert(String s) {
        if(s.isEmpty())
            return 0;
        int digit = convert(s.substring(0,s.length()-1));
        int val = digit*10+s.charAt(s.length()-1)-48;
        return val;
    }
    public static void main(String[] args) {
        String str="1234";
        Object res = convert(str);              //can be use to store any value of data type.
        System.out.println(res);
        System.out.println(res.getClass());     //this method is used to show which class does the object belongs to.
        
    }
}

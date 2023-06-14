package Deep_Dive_Recursion;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class Dictionary_Order_Smaller {
    private static void smallerOrder(String ques, String ans, String comp) {

        if(ans.compareTo(comp)<0 && ques.isEmpty()){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String temp = ques.substring(0,i)+ques.substring(i+1);
                smallerOrder(temp, ans+ch, comp);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char [] arr = input.toCharArray();
        Arrays.sort(arr);
        String s = new String(arr);
        smallerOrder(s,"",input);

    }

}

package Deep_Dive_Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class Tricky_Permutation {

    public static void main(String[] args) {
        String str = "aba";

        ArrayList<String> permList = trickPermut(str, "", new ArrayList<String>());
        Collections.sort(permList);
        System.out.println(permList);

    }

    public static ArrayList<String> trickPermut(String str, String ans, ArrayList<String> list) {
        if(str.isEmpty()){
            list.add(ans);
            return list;
        }
        ArrayList <String> temp = new ArrayList<>(list);
        for(int i=0 ; i< str.length() ; i++){
            char ch = str.charAt(i);
            boolean flag = true;
            for (int j = i+1; j < str.length(); j++) {
                if(ch==str.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                String t = str.substring(0,i)+str.substring(i+1);
                temp = trickPermut(t, ans+ch, temp);
            }
        }
        return temp;
    }
}

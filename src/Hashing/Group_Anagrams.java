package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {
    public static void main(String[] args) {
        String [] list = {"eat","tea","tan","ate","nat","bat","tan"};
        anagram(list,list.length);
    }

    private static void anagram(String[] list, int n) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            char [] s = list[i].toCharArray();
            Arrays.sort(s);
            String st = new String(s);
            if(map.containsKey(st)){
                List<String> l = map.get(st);
                l.add(list[i]);
                map.put(st, l);
            }
            else{
                List<String> l = new LinkedList<>();
                l.add(list[i]);
                map.put(st,l);
            }
        }

        System.out.println(map.values());
    }
}

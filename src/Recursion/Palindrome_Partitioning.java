package Recursion;

import java.util.ArrayList;
public class Palindrome_Partitioning {


    public static boolean isPalindrome(String piece) {
        int s=0;
        int e=piece.length()-1;
        while(s<=e){
            if(piece.charAt(s)!=piece.charAt(e))
                return false;
            s++;
            e--;
        }
        return true;
    }
    public static void partition(String table , String bag, ArrayList<String> bag_AL) {
        if(table.isEmpty()){
            System.out.println(bag);
            System.out.println(bag_AL);
            System.out.println("============");
            return;
        }
        for(int chakku=1 ; chakku<=table.length() ; chakku++){
            String piece = table.substring(0, chakku);
            String remain = table.substring(chakku);
            if(isPalindrome(piece)==true){
                bag_AL.add(piece);
                partition(remain, bag+"-"+piece, bag_AL);
                bag_AL.remove(bag_AL.size()-1);
            }
        }
    }

    public static void partition2(String table , String bag, ArrayList<String> bag_AL) {
        if(table.isEmpty()){
            System.out.println(bag);
            System.out.println(bag_AL);
            System.out.println("============");
            return;
        }
        for(int chakku=1 ; chakku<=table.length() ; chakku++){
            String piece = table.substring(0, chakku);
            String remain = table.substring(chakku);
            if(isPalindrome(piece)){
            ArrayList <String> nn_AL_bag = new ArrayList<>(bag_AL);
            nn_AL_bag.add(piece);
            partition2(remain, bag+"-"+piece, nn_AL_bag);
            }
        }
    }
    public static void main(String[] args) {
        String st = "abbc";
        partition2(st, "",new ArrayList<String>());
        // System.out.println(isPalindrome(st));
    }    
}

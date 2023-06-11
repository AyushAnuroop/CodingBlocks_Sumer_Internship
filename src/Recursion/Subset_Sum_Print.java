package Recursion;

import java.util.*;

public class Subset_Sum_Print {

    public static List<String> subset(int [] arr, int n, int sum, String s, List<String> list) {
        if(n==-1){
            if(sum==0)
                list.add(s);
            return list;
        }
        
        List<String> temp = new ArrayList<String>(list);
        temp = subset(arr, n-1, sum-arr[n], s+arr[n]+" ", temp);
        temp = subset(arr, n-1, sum, s, temp);
        temp.sort((s1, s2) -> s1.length() - s2.length());
        return temp;
    }
    public static void main(String[] args) {
        int [] arr = {1,4,6,5,3};
        int target = 10;
        System.out.println(subset(arr, arr.length-1, target, "", new ArrayList<String>()));
    }

}

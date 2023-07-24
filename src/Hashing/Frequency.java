package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        int [] arr = {100,10,2,1000,2,1000,10,10};
        int n = arr.length;
        freq(arr,n);
    }

    private static void freq(int[] arr, int n) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        System.out.println(map);
    }
    
}

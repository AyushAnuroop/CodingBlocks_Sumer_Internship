package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum{
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int n = arr.length;
        int target = 9;
        int[] i = twoSum(arr,n,target);
        System.out.println(Arrays.toString(i));
    }

    public static int[] twoSum(int[] arr, int n, int target) {
        int [] res = {-1,-1};
        HashMap<Integer,Integer> HM = new HashMap<>();
        for (int index = 0; index < arr.length; index++) {
            HM.put(arr[index], index);
        }

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int b = target-a;  
            if(HM.containsKey(b) && HM.get(b)!=i){
                res[0]=i;
                res[1]=HM.get(b);
                return res;
            }
        }
        return res;
    }
}
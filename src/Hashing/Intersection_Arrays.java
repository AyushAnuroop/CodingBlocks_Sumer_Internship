package Hashing;

import java.util.HashMap;

public class Intersection_Arrays {
    public static void main(String[] args) {
        int [] a = {1,3,7,9,4,6,9,0,6,3,2,5,7,8,9,6,4,2};
        int [] b = {3,6,3,8,2,5,3,1};
        //int [] res = 
        intersection(a,b);
    }

    public static void intersection(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> HM = new HashMap<>();
        for(int ali : nums2){

            int prevFreq = 0;
            if(HM.containsKey(ali)){
                prevFreq = HM.get(ali);
            }
            HM.put(ali, prevFreq+1);
        } 
        System.out.println(HM);
        for(int ali : nums1){
            if(HM.containsKey(ali)){
                System.out.print(ali+" ");
                int prevFreq = HM.get(ali);
                HM.put(ali,prevFreq-1);
            }
        }
    }
}

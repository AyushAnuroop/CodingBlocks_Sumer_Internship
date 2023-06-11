package Recursion;

import java.util.ArrayList;

public class All_Indices_Problem {

    public static ArrayList<Integer> indices(int [] arr,ArrayList<Integer>index, int i, int target) {
        if(i==arr.length)
            return index;
        ArrayList <Integer> temp = new ArrayList<>(); 
        if(target==arr[i]){
            index.add(i);
        }
        temp = indices(arr, index, i+1, target);
        return temp ;
    }
    public static void main(String[] args) {
        int target = 2;
        int [] arr = {1,2,7,4,8,2,5,3,7,2,6,1,2};
        System.out.println(indices(arr, new ArrayList<Integer>(), 0, target).toString());
    }
}

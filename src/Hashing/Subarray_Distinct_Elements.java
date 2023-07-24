package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class Subarray_Distinct_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        totalSubarray(arr,n);
        sc.close();
    }

    public static void totalSubarray(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
 
        int left = 0, totalsum = 0;
 
        for (int right = 0; right < n; right++)
        {
            while (left < n && !set.contains(arr[left]))
            {
                set.add(arr[left]);
                left++;
            }
 
            totalsum += ((left - right) * (left - right + 1)) / 2;
 
            set.remove(arr[right]);
        }
        System.out.println(totalsum);
    }
}

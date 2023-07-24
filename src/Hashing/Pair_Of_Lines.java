package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Pair_Of_Lines {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        linePairs(arr,n,m,c);
        sc.close();

    }

    public static void linePairs(int arr[], int n, int m, int c){
        int count = 0;

        HashMap<Integer,Integer> freq = new HashMap<>();
         
        for(int i=0;i<n;i++){
            if(freq.get(arr[i])==null){
                freq.put(arr[i],1);
            }else{
                freq.put(arr[i],freq.get(arr[i])+1);
            }
        }
         
        for (int i = 0; i < n; i++)
        {
            int xCoordinate = arr[i];
            int yCoordinate = (m * arr[i] + c);
             
            if (freq.get(yCoordinate) !=null)
                count += freq.get(yCoordinate);
            if (xCoordinate == yCoordinate)
                count--;
        }
        System.out.println(count);
    }
}

package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class Exist_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            // int [] arr = new int [n];
            HashSet<Integer> set = new HashSet<>();
            for(int i=0 ; i<n ; i++){
                // arr[i]=sc.nextInt();
                set.add(sc.nextInt());
                
            }
            int q = sc.nextInt();
            System.out.println();
            while(q-->0){
                if(set.contains(sc.nextInt())){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
        sc.close();
    }
}

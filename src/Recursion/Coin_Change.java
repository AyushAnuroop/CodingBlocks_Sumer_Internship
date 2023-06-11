package Recursion;

public class Coin_Change {

    public static void coinChange(int i, int[] arr, int amt, String s) {
        if(amt==0){
            System.out.println(s);
            return ;
        }
        if(amt<0 || i==arr.length)
            return ;
        coinChange(i+1, arr, amt, s);
        coinChange(i,arr,amt-arr[i],s+arr[i]);
    }

    public static void coinChange2(int prev, int A, int[] coins, String s) {

        if(A==0){
            System.out.println(s);
            return ;
        }
        if(A<0)
            return ;

        for(int curr=prev+1 ; curr<coins.length ; curr++){
            coinChange2(curr, A-coins[curr], coins, s+coins[curr]);
        }
        
    }

    public static void coinChange3(int prev, int A, int[] coins, String s) {

        if(A==0){
            System.out.println(s);
            return ;
        }
        if(A<0)
            return ;

        for(int curr=prev ; curr<coins.length ; curr++){
            coinChange3(curr, A-coins[curr], coins, s+coins[curr]);
        }
        
    }
    public static void main(String[] args) {
        int [] arr = {3,2,1};
        int amt = 5;
        // coinChange(0,arr,amt,"");
        coinChange2(0, amt, arr, "");
        // coinChange3(0, amt, arr, "");
    }
}

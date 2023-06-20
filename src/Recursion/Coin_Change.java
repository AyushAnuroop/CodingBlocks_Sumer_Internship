package Recursion;

public class Coin_Change {

//    for duplicate combinations with infinite coins
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

//    for duplicate combinations with  finite coins
    public static void coinChange2(int prev, int A, int[] coins, String s) {

        if(A==0){
            System.out.println(s);
            return ;
        }
        if(A<0)
            return ;


//        if curr = prev it means the coins are infinite
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

//        unique combination for  finite coins
        for(int curr=prev+1 ; curr<coins.length ; curr++){
            if(curr==prev+1 || coins[curr] !=coins[curr-1])
                coinChange3(curr, A-coins[curr], coins, s+coins[curr]);
        }
        
    }
    public static void main(String[] args) {
        int [] arr = {1,3,2};
//        int  [] arr = {1,2,2,2,3,1,2,3,2,1,1,1};
        int amt = 5;

         coinChange(0,arr,amt,"");
            System.out.println();
       coinChange2(0, amt, arr, "");
            System.out.println();
         coinChange3(-1, amt, arr, "");
    }
}

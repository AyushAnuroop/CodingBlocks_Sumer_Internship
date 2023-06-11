package Recursion;

public class Subset_Sum_Easy {

/* Approach

At each step during the recursion , we make a call once where we include the current element into our sum and another 
where we exclude. If at the end when we reach the end of the array , we have obtained the sum=0, we return true , 
else false. During the intermediate recursive calls , we check the result from both the recursive calls , one 
including the current element and one excluding and return their OR since even if one of them had the subset sum 0 
then we have to return true.

Note that the NULL subset ( subset with no elements ) is not to be considered as that would always have sum 0. 
To avoid considering that , we take a flag variable bool included = false and mark it as true even if we include a 
single element. Else it remains false. The NULL subset would be the only subset where the flag would remain false. 
For all other subsets , they would have included atleast one element and hence their flag would be true.*/

    public static boolean subsetSumEasy(int[] v, int i, int sum, boolean included) {
        if (i == v.length) {
            return (sum == 0 && included);
        }

        boolean inc = subsetSumEasy(v, i + 1, sum + v[i], true);
        boolean exc = subsetSumEasy(v, i + 1, sum, included);

        return inc || exc;
    }

    public static int subset(int [] arr, int n, int sum) {
        if(n==-1){
            if(sum==0)
                return 1;
            return 0;
        }
        int a = subset(arr, n-1, sum);
        int b = subset(arr, n-1, sum+arr[n]);
        return a+b;
    }
    public static void main(String[] args) {
        int n=4;
        int [] arr ={1,2,3,4};
        int res = subset(arr, n-1, 0);
        System.out.println(res-1);
        if(res-1==0)
            System.out.println("No");
        else
            System.out.println("Yes");
        System.out.println();
        if(subsetSumEasy(arr, 0, 0,false))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}

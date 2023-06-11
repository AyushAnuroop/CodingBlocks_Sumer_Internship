package Recursion;

public class SplitArray {

    public static int split(int [] arr, int i, String g1, String g2, int sum1, int sum2) {
        if(i==arr.length){
            if(sum1==sum2){
                System.out.println(g1+"and "+g2);
                return 1;
            }
            return 0;
        }
        int a = split(arr, i+1, g1+arr[i]+" ", g2, sum1+arr[i], sum2);
        int b = split(arr, i+1, g1, g2+arr[i]+" ", sum1, sum2+arr[i]);
        return a+b;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,5};
        int count = split(arr, 0, "", "", 0, 0);
        System.out.println("\n"+count);
    }
}

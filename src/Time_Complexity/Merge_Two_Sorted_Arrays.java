package Time_Complexity;

import java.util.Arrays;

public class Merge_Two_Sorted_Arrays {


    public static void main(String[] args) {
        int [] a = {1,2,2,2,3,5,7};
        int [] b = {3,4,5,6,6,7,8};
        int [] ans = merge(a,b);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] merge(int[] a, int[] b) {
        int a_len = a.length, b_len = b.length;
        int [] res = new int[a_len+b_len];
        int i=0,j=0,c=0;
        while(i<a_len && j<b_len){
            if(a[i]<=b[j]) {
                res[c] = a[i];
                i++;
            }
            else {
                res[c] = b[j];
                j++;
            }
            c++;
        }

        while(i<a_len){
            res[c++]=a[i++];
        }
        while(j<b_len){
            res[c++]=b[j++];
        }
        return res;
    }
}

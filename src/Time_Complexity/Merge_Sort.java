package Time_Complexity;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int [] a = {1,4,5,6,7,3,2,8,9};
        int [] ans = mergeSort(a,0,a.length-1);
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

    private static int[] mergeSort(int[] arr, int l, int r) {
        if(l==r){
            int [] temp = new int [1];
            temp[0]=arr[l];
            return temp;
        }

        int mid=(l+r)/2;
        int [] a1 = mergeSort(arr, l, mid);
        int [] a2 = mergeSort(arr, mid+1, r);
        return merge(a1,a2);
    }
}

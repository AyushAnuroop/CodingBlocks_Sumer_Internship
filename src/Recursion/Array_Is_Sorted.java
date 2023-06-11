package Recursion;

public class Array_Is_Sorted {

	public static boolean checkSorted(int [] arr, int s){
		if(s+1==arr.length)
			return true;
		if(arr[s]>arr[s+1])
			return false;
		boolean res = checkSorted(arr,s+1);
		return res;
	}
    public static void main(String args[]) {
        int [] arr = {1,2,3,2,4,5};
		boolean res = checkSorted(arr,0);
		System.out.println(res);// Your Code Here
    }
}

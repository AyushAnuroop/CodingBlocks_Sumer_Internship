package Deep_Dive_Recursion;

public class Mazepath_VHD {

        public static int paths(int curr_rows, int curr_cols, int row, int col, String s) {

            if(curr_cols>col || curr_rows>row)
                return 0;

            if(curr_cols==col && curr_rows==row){
                System.out.print(s+" ");
                return 1;
            }

            int v = paths(curr_rows+1, curr_cols, row, col, s+"V");

            int h = paths(curr_rows, curr_cols+1, row, col, s+"H");

            int d = paths(curr_rows+1, curr_cols+1, row, col, s+"D");

            return v+h+d;

        }

        public static void main(String args[]) {
            int m = 3;
            int n = 3;
            int count = paths(0, 0, m-1, n-1, "");
            System.out.print("\n"+count);// Your Code Here
        }
}

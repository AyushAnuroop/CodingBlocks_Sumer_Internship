package Deep_Dive_Recursion;

public class N_Queens_Puzzle {


    public static  boolean canQueenBePlaced(boolean [][] board, int curr_row, int curr_col, int n){
        for(int row=0 ; row<=curr_row-1 ; row++){
            if(board[row][curr_col])
                return false;
        }

        int row = curr_row;
        int col= curr_col;

        // to check the right diagonal doesn't have any queen.
        while(row>=0 && col<n){
            if(board[row][col]){
                return false;
            }
            row--;
            col++;
        }

        row=curr_row;
        col=curr_col;

        //to check the left diagonal
        while (row>=0 && col>=0){
            if(board[row][col]){
                return false;
            }
            row--;
            col--;
        }

        //the queen is eligible to be placed.
        return true;
    }
    public static int printNQueens(boolean[][] board, int curr_row, int n) {

        //if the answer is found it will print the chess board.
        if(curr_row == n){
            System.out.println("=============");
            for(int i=0 ; i<n ; i++){
                for (int j = 0; j < n; j++) {
                    if(board[i][j])
                        System.out.print("Q ");
                    else
                        System.out.print("_ ");
                }
                System.out.println();
            }
            System.out.println("=============");
            return 1;
        }

        //for checking if any of the configuration of queens is possible.
        int a=0;
        for(int curr_col=0; curr_col<n; curr_col++){
            if(canQueenBePlaced(board, curr_row, curr_col, n)){
                board[curr_row][curr_col]=true;
                a+=printNQueens(board, curr_row+1, n);
                board[curr_row][curr_col]=false; // backtrack
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int n=5;                                //for showing the order of square board.
        boolean [][] arr = new boolean[n][n];   // for simulating the chess board.
        int count = printNQueens(arr, 0, n);
        System.out.print(count);
    }
}

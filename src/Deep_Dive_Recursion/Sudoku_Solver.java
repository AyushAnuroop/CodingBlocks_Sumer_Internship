package Deep_Dive_Recursion;

import java.util.Scanner;

public class Sudoku_Solver {

    private static void solver(int row, int col, char[][] board) {

        //if all column of current row is checked ,then start from next row.
        if(col==9){
            col=0;
            row++;
        }

        //if all rows are checked then
        if(row==9){
            print(board);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
            return;
        }

        //if an number is occupied on current cell then skip.
        if(board[row][col]!='.')
            solver(row,col+1, board);

        //check which number is valid for the current cell.
        else {
            for(char ch='1' ; ch<='9'; ch++){
                if(isSafe(ch,row,col,board)) {
                    board[row][col] = ch;
                    solver(row, col + 1, board);
                }
            }

            //backtrack if the arrangement for certain number is not possible.
            board[row][col]='.';
        }
    }

    private static boolean isSafe(char ch, int row, int col, char[][] board) {

        //for checking row
        for(int i=0 ; i<9 ; i++){
            if(board[i][col]==ch)
                return  false;
        }


        //for checking column
        for (int j = 0; j < 9; j++) {
            if (board[row][j]==ch)
                return false;
        }

        //for checking grid
        int box_r = (row/3)*3;
        int box_c = (col/3)*3;

        for(int r = box_r; r<box_r+3 ; r++){
            for (int c = box_c; c < box_c+3; c++) {
                if(board[r][c]==ch)
                    return false;
            }
        }

        return true;
    }

    private static void print(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(board[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};


        solver(0, 0, board);
    }
}

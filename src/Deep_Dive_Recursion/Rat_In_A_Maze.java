package Deep_Dive_Recursion;

import java.util.Arrays;

public class Rat_In_A_Maze {
    public static void paths(int[][] maze, int curr_row, int curr_col, int row, int col, boolean[][] vis, String s){

        if(curr_row<0 || curr_col<0 || curr_row>row || curr_col>col || vis[curr_row][curr_col] || maze[curr_row][curr_col]==1){
            return;
        }

        if(curr_row==row && curr_col==col){
            System.out.println(s);
            return;
        }

        vis[curr_row][curr_col]=true;

        paths(maze, curr_row-1, curr_col, row, col, vis,s+"U");
        paths(maze, curr_row+1, curr_col, row, col, vis,s+"D");
        paths(maze, curr_row, curr_col-1, row, col, vis,s+"L");
        paths(maze, curr_row, curr_col+1, row, col, vis,s+"R");

        //backtrack
        vis[curr_row][curr_col]=false;

    }

    public static void main(String[] args) {
        int row=4;
        int col=4;
        int [][] maze = {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,1,1,0}};
        paths(maze,0,0,row-1,col-1, new boolean[row][col],"");
    }

}

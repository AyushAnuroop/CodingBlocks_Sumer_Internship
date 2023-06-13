package Deep_Dive_Recursion;

import java.util.Scanner;

public class Rat_Chase_Cheese {
    public static boolean paths(char[][] maze, int curr_row, int curr_col, int row, int col, boolean[][] vis){

        if(curr_row<0 || curr_col<0 || curr_row>row || curr_col>col || vis[curr_row][curr_col] || maze[curr_row][curr_col]=='X'){
            return false;
        }

        if(curr_row==row && curr_col==col){


            for(int i=0 ; i<=row ; i++) {
                for (int j = 0; j <= col; j++) {
                    if (vis[i][j] || i==row && j==col)
                        System.out.print(1 + " ");
                    else
                        System.out.print(0 + " ");
                }
                System.out.println();
            }

            return true;
        }

        boolean a,b,c,d;
        vis[curr_row][curr_col]=true;

        a=paths(maze, curr_row-1, curr_col, row, col, vis );
        b=paths(maze, curr_row+1, curr_col, row, col, vis );
        c=paths(maze, curr_row, curr_col-1, row, col, vis );
        d=paths(maze, curr_row, curr_col+1, row, col, vis );

        //backtrack
        vis[curr_row][curr_col]=false;
        return  a|b||c||d;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        char [][] maze = new char[row][col];

        for(int i=0 ; i<row ; i++){
            String temp = sc.next();
            for(int j=0 ; j<col ; j++){
                maze[i][j]=temp.charAt(j);
            }
        }

        boolean res = paths(maze,0,0,row-1,col-1, new boolean[row][col]);
        if(!res)
            System.out.println("NO PATH FOUND");
    }
}

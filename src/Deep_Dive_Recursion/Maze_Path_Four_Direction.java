package Deep_Dive_Recursion;

public class Maze_Path_Four_Direction {
    public static void paths(int curr_row, int curr_col, int row, int col, boolean[][] vis, String s){

        if(curr_row<0 || curr_col<0 || curr_row>row || curr_col>col || vis[curr_row][curr_col]) {
            return;
        }

        if(curr_row==row && curr_col==col){
            System.out.println(s);
            return;
        }

        vis[curr_row][curr_col]=true;

        paths(curr_row-1, curr_col, row, col, vis,s+"U");
        paths(curr_row+1, curr_col, row, col, vis,s+"D");
        paths(curr_row, curr_col+1, row, col, vis,s+"L");
        paths(curr_row, curr_col-1, row, col, vis,s+"R");

        //backtrack
        vis[curr_row][curr_col]=false;

    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        paths(0,0,row-1,col-1, new boolean[row][col],"");
    }

}

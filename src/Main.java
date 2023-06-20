import java.util.*;
public class Main {

    static int current = 0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess_board = new int[n][n];
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                int x = sc.nextInt();
                if(x == 1){
                    count++;
                }
                chess_board[i][j] = x;
            }
        }

        // current = 0;
        Knight(chess_board , 0 , 0 , 0 , n);
        System.out.println(count-current);
    }

    static void Knight(int[][] chess_board , int r , int c, int count , int n){
        if(r < 0 || r >= n || c < 0 || c >= n || chess_board[r][c] == 0){
            return;
        }

        chess_board[r][c] = 0;
        if(current < count + 1){
            current = count+1;
        }

        int[] rb = {-2 , -2 , -1 , -1 , 1 , 1 , 2 , 2};
        int[] cb = {-1 , 1 , -2 , 2 , -2 , 2 , -1 , 1};
        chess_board[r][c] = 0;
        for(int i = 0 ; i < rb.length ; i++){
            Knight(chess_board , r + rb[i] , c+cb[i] , count+1 , n);
        }
        chess_board[r][c] = 1;
    }
}
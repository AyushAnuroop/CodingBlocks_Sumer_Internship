package Recursion;

public class Maze_Path {

	public static int paths(int rows, int cols, int v, int h, String s) {
    
        if(h>cols || v>rows)
            return 0;
        if(h==cols-1 && v==rows-1){
            System.out.print(s+" ");
            return 1;
        }

        int a = paths(rows, cols, v+1, h, s+"V");
        
		int b = paths(rows, cols, v, h+1, s+"H");
  
        return a+b;

    }
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int count = paths(m, n,0,0, "");
        System.out.println("\n"+count);
    }
}

// HHHVVV HHVHVV HHVVHV HHVVVH HVHHVV HVHVHV HVHVVH HVVHHV HVVHVH 
// HVVVHH VHHHVV VHHVHV VHHVVH VHVHHV VHVHVH VHVVHH VVHHHV VVHHVH VVHVHH VVVHHH

package Recursion;

public class Lexicographical_Order {

    public static void lexico(int curr, int n) {
        if(curr>n){
            return;
        }
        System.out.println(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            lexico(curr*10+i, n);
        }
    }
    public static void main(String[] args) {
        int n=10;
        lexico(0, n);
    }
}



/* Bigger Problem : To Print all of the counting from 1 to N.

   Smaller Problem : Assume the recursion works and will give you ans for counting 2 to N and 3 to N and 4 to N 
   upto 9 to N.
   
   Self Work : In order to make you smaller prblm your problem all you need to print your current number
   and rest will be done by the Smaller work. */

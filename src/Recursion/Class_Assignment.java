package Recursion;
/*

In a mathematics class, Teacher ask Alice to find the number of all n digit distinct integers which is formed by
the two distinct digits ai and bi but there is a rule to form n digit integer.

Rule: She has to form n digit integer by using two digits ai and bi without consecutive bi.

Alice is very weak in maths section. Help her to find the number of such n digit integers.

*/

public class Class_Assignment {

    public static int assignment(int n) {
        if(n==1)
            return 2;
        if(n==2)
            return 3;
        int res = assignment(n-1)+assignment(n-2);
        return res ;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(assignment(n));
    }    
}

package Stacks;

import java.util.Stack;

public class Celebrity_Problem {
    public static void main(String[] args) {
        int [] [] party =  {{0, 1, 0},
                            {0, 0, 0},
                            {0, 1, 0}};
        int ans = findCeleb(party);
        System.out.println(ans);
    }

    private static int findCeleb(int[][] party) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < party.length; i++) {
            s.push(i);
        }
        while(s.size()>1){
            int a = s.pop();
            int b = s.pop();
            if(party[a][b]==1 && party[b][a]==0)
                s.push(a);
            else                //(party[b][a]==1)
                s.push(b);
        }

        int potential = s.pop();
        boolean rowCheck=false;
        int zeroCount = 0;
        for (int i = 0; i < party.length; i++) {
            if(party[potential][i]==0)
                zeroCount++;
        }
        if(zeroCount== party.length-1)
            rowCheck=true;

        boolean colCheck=false;
        int oneCount=0;
        for (int i = 0; i < party.length; i++) {
            if(party[i][potential]==1)
                oneCount++;
        }

        if(oneCount== party.length-1)
            colCheck=true;

        if(colCheck&&rowCheck)
            return potential;
        else
            return -1;
//        if(party[s.peek()][s.peek()]==0)
//            System.out.println(s.peek()+" is a celebrity");
//        else
//            System.out.println(-1+ " is a celebrity");
    }
}

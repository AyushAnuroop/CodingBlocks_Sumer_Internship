package Time_Complexity;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(list.size()-i,i+"a");
        }
        System.out.println(list);
    }
}

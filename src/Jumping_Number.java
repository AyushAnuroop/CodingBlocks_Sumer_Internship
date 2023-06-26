public class Jumping_Number {

//    public static void jump(int n,int curr){
//        if(curr>n || curr<0)
//            return;
//        System.out.println(curr);
//
//    }
    public static void main(String[] args) {
//        jump(10,0);

        for(int i = 0; i <= 9; i++) {
            System.out.println(i*10+(i-1));
            System.out.println(i*10+(i+1));
        }
    }
}

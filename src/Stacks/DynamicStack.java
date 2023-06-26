package Stacks;

public class DynamicStack extends Stack_With_Array{

    @Override
    public void push(int val) throws Exception {
        if(tos+1== data.length){
            int [] newData = new int[2*data.length];

//            System.arraycopy(data, 0, newData, 0, data.length);
            for(int i = 0; i<data.length; i++) {
                newData[i]=data[i];
            }
            data = newData;
        }
        super.push(val);
    }

    public static void main(String[] args) throws Exception {
        DynamicStack st = new DynamicStack();
        for (int i = 1; i <= 10; i++) {
            st.push(i);
        }
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
    }
}

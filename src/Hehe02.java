import java.util.ArrayList;
class Hehe02{
    static void misiNum(int[] num){
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i <=num.length; i++) {
            al.add(i);
        }
        for(int i=0;i<num.length;i++){
            if (i!=num[i])
                System.out.println(al);
        }
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,5};
        misiNum(arr);
    }
}

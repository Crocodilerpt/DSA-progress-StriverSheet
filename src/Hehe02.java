class Hehe02{
    static int misiNum(int[] num){
        int xor = num.length;
        for (int i = 0; i < num.length; i++) {
            xor ^= i ^ num[i];

        }
        return xor;
    }
    public static void main(String[] args){
        int[] arr= {2,0,1,3};
        System.out.println(misiNum(arr));
    }
}

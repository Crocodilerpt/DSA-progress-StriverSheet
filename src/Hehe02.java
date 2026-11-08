class Hehe02{
    static int[] findMnR(int[] num) {
        int xor=0;
        for(int i=0; i<num.length;i++){
            xor ^= num[i] ^ (i+1);
        }
        int bit = xor & -xor;
        int a=0;   int b=0;
        for (int i = 0; i < num.length; i++) {
            if ((num[i] & bit) != 0)
                a ^= num[i];
            else b ^= num[i];
            if (((i + 1) & bit) != 0)
                a ^= (i + 1);
            else b ^= (i + 1);
        }
        return new int[]{a,b};
    }
    public static void main(String[] args){
        int[] arr = {4,3,6,2,1,1};
        int[] ans = findMnR(arr);
        for(int a : ans)System.out.print(a+"  ");
    }
}

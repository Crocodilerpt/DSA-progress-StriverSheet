import java.util.Arrays;
class Hehe02{// sum of 3 elements -- optimal (sort + 3 pointer)
    static int[] practice(int[] ar1, int[] ar2) {
        int i = 0, j = 0, k = 0;
        int[] hash = new int[ar1.length + ar2.length];

        while (i < ar1.length && j < ar2.length) {
            int val = ar1[i] < ar2[j] ? ar1[i++] : ar2[j++];
            if (k == 0 || val != hash[k-1])
                hash[k++] = val;
        }
        while (i < ar1.length) {
            int val = ar1[i++];
            if (k == 0 || val != hash[k-1])
                hash[k++] = val;
        }
        while (j < ar2.length) {
            int val = ar2[j++];
            if (k == 0 || val != hash[k-1])
                hash[k++] = val;
        }
        return Arrays.copyOf(hash, k);
    }
    public static void main(String[] args){
        //int[] num = {-3,-3,-3,0,0,2,2,4,4,4};
        int[] ar1={1,2,2,4,6};
        int[] ar2={2,2,3,5};
        int[] ans = practice(ar1,ar2);
        for (int a : ans) System.out.print(a+" ");
    }
}
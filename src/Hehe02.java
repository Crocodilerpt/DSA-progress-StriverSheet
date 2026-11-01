import java.util.Arrays;
class Hehe02{
    static void mergeArray(int[] ar1, int[] ar2) {
        int i = ar1.length - 1, j = 0;
        while (i >= 0 && j < ar2.length && ar1[i] > ar2[j]) {
            int temp = ar1[i];
            ar1[i] = ar2[j];
            ar2[j] = temp;
            i--;
            j++;
        }
        Arrays.sort(ar1);
        Arrays.sort(ar2);
    }
    public static void main(String[] args){
        int[] ar1 = {1,3,5,7};
        int[] ar2 = {0,2,6,8,9};
        mergeArray(ar1,ar2);
        for (int a :ar1) System.out.print(a+" ");
        System.out.println();
        for (int b :ar2) System.out.print(b+" ");
    }
}

package Striver_Array_nard01;
public class MergeSortedArrayNoSpace {
    static void mergeArray(int[] ar1, int[] ar2) {
        int m = ar2.length;
        if (m == 0) return;
        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] > ar2[0]) {
                int temp = ar1[i];
                ar1[i] = ar2[0];            // smallest of ar2 goes into ar1
                int j = 1;
                while (j < m && ar2[j] < temp) {   // keep ar2 sorted
                    ar2[j - 1] = ar2[j];
                    j++;
                }
                ar2[j - 1] = temp;          // insert the bigger value in place
            }
        }
    }
    public static void main(String[] args){
        int[] ar1 = {1, 4, 8, 10};
        int[] ar2 = {2, 3, 7, 9};
        mergeArray(ar1,ar2);
        for (int a :ar1) System.out.print(a+" ");
        System.out.println();
        for (int b :ar2) System.out.print(b+" ");
    }
}


/*
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
} */
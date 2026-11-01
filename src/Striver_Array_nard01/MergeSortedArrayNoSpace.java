package Striver_Array_nard01;
public class MergeSortedArrayNoSpace {
    static void mergeArray(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int gap = (n + m + 1) / 2;
        while (gap > 0) {
            for (int i = 0, j = gap; j < n + m; i++, j++) {
                int x = i < n ? a[i] : b[i - n];
                int y = j < n ? a[j] : b[j - n];
                if (x > y) {
                    if (i < n) a[i] = y; else b[i - n] = y;
                    if (j < n) a[j] = x; else b[j - n] = x;
                }
            }
            if (gap == 1) break;
            gap = (gap + 1) / 2;
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


/* better o(n), o(2 n log n)
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
*/

/* brute
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
}*/
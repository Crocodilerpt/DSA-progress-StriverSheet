class Hehe02{
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
        int[] ar1 = {1,3,5,7};
        int[] ar2 = {0,2,6,8,9};
        mergeArray(ar1,ar2);
        for (int a :ar1) System.out.print(a+" ");
        System.out.println();
        for (int b :ar2) System.out.print(b+" ");
    }
}

package Striver_Array_nard01;
public class MaxProductSubArr {
    static int maxProduct(int[] a) {
        int n = a.length, prefix = 1, suffix = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
            prefix *= a[i];
            suffix *= a[n - 1 - i];
            ans = Math.max(ans, Math.max(prefix, suffix));
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = { 2, 3,-2, 4};
        System.out.println(maxProduct(arr));
    }
}

/* brute
static int maxProduct(int[] a){
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < a.length; i++) {
        int prod = 1;
        for (int j = i; j < a.length; j++) {
            prod = prod * a[j];
            if (prod > max)
                max = prod;
        }
    }
    return max;
}*/
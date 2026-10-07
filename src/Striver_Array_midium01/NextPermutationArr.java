package Striver_Array_midium01;
public class NextPermutationArr {
    static void nextPermutation(int[] num) {
        int n = num.length;
        int key = -1;
        for (int i = n-2; i >= 0; i--) {
            if (num[i] < num[i + 1]){
                key = i; break;
            }
        }
        if (key == -1) { // last permutation, reverse whole array
            reverse(num, 0, n-1);
            return;
        }
        int mini = key +1;
        for (int i = key +2; i < n; i++) {
            if (num[i] > num[key] && num[i] < num[mini])
                mini = i;
        }
        int temp = num[key]; num[key] = num[mini]; num[mini] = temp;
        reverse(num, key +1, n -1);
    }
    static void reverse(int[] num, int l, int r) {
        while (l < r) {
            int t = num[l]; num[l] = num[r]; num[r] = t;
            l++; r--;
        }
    }
    public static void main(String[] args){
        int[] ar = {3,1,5,4,2};
        nextPermutation(ar);
        for (Integer ans : ar) System.out.print(ans+" ");
    }
}

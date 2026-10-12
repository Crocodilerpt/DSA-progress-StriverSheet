import java.util.*;
class Hehe02{ //sum of 3 -- better
    static void sum3(int[] num, int target) {
        Arrays.sort(num);
        int n = num.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && num[i] == num[i - 1]) continue; // skip duplicate i
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = num[i] + num[j] + num[k];
                if (sum == target) {
                    System.out.println(num[i] + " " + num[j] + " " + num[k]);
                    j++;
                    k--;
                    while (j < k && num[j] == num[j - 1]) j++;
                    while (j < k && num[k] == num[k + 1]) k--;
                }else if (sum < target)
                    j++;
                else
                    k--;
            }
        }
    }
    public static void main(String[] args){
        int[] num = {-3,-3,-1,-1,-1,0,0,2,2,3,4,4,4};
        sum3(num,1);
    }
}

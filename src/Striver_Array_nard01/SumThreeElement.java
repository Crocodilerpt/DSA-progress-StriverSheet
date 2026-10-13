package Striver_Array_nard01;
import java.util.*;
public class SumThreeElement {
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
        int[] num = {2,5,0,-2,3,1,9};
        sum3(num,1);
    }
}

/* brute force o(n^3)
static int[] SumOf3(int[] num,int target){
    for (int i = 0; i < num.length; i++) {
        for (int j = 0; j < num.length; j++) {
            for (int k = 0; k < num.length; k++) {
                if(i!=j && j!=k && k!=i){
                    int sum = num[i] + num[j] + num[k];
                    if (sum == target){
                        return new int[]{i,j,k};
                    }
                }
            }
        }
    }
    return new int[]{-1};
}*/


/* better o(n^2), o(n^2)+o(n)
static List<List<Integer>> sum3(int[] num){
    Set<List<Integer>> ds1 = new HashSet<>();
    for (int i = 0; i < num.length; i++) {
        Set<Integer> ds2 = new HashSet<>();
        for (int j = i+1; j < num.length; j++) {
            int val = -(num[i] + num[j]);

            if (ds2.contains(val)) {
                List<Integer> ds3 = Arrays.asList(num[i], num[j], val);
                Collections.sort(ds3);
                ds1.add(ds3);
            }
            ds2.add(num[j]);
        }
    }
    return new ArrayList<>(ds1);
}*/

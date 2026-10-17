package Striver_Array_nard01;
import java.util.Arrays;
public class SumFourElements {
    static void fourSum(int[] num, int target){
        Arrays.sort(num);
        for(int i=0; i<num.length; i++){
            if (i > 0 && num[i] == num[i-1]) continue;
            for(int j=i+1; j<num.length; j++){
                if (j > i+1 && num[j] == num[j-1]) continue;
                int k = j+1;
                int l = num.length-1;
                while (k<l){
                    long sum = (long)num[i] + num[j] + num[k] + num[l];
                    if (sum>target)
                        l--;
                    else if (sum<target)
                        k++;
                    else{
                        System.out.println(num[i]+" "+num[j]+" "+num[k]+" "+num[l]);
                    k++; l--;
                    while (k<l && num[k]==num[k-1]){k++;};
                    while (k<l && num[l]==num[l+1]){l--;};
                    }
                }
            }
        }
    } //Complexity: O(n³) time, O(1) extra space (excluding sort).
    public static void main(String[] args){
        int[] num = {-5,-5,3,3,1,2,3,4,5,6,};
        fourSum(num,4);
        System.out.println();
    }
}



/*
static List<List<Integer>> practice(int[] nums, int target) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    int n = nums.length;
    for (int i = 0; i < n; i++) {
        if (i > 0 && nums[i] == nums[i - 1])
            continue;
        for (int j = i + 1; j < n; j++) {
            if (j > i + 1 && nums[j] == nums[j - 1])
                continue;
            for (int k = j + 1; k < n; k++) {
                if (k > j + 1 && nums[k] == nums[k - 1])
                    continue;
                for (int l = k + 1; l < n; l++) {
                    if (l > k + 1 && nums[l] == nums[l - 1])
                        continue;
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                    }
                }
            }
        }
    }
    return result;
}*/


/* better 3 loop and a hash
static List<List<Integer>> fourSum(int[] num, int target) {
    Set<List<Integer>> ds1 = new HashSet<>();
    for (int i = 0; i < num.length; i++) {
        for (int j = i + 1; j < num.length; j++) {
            Set<Integer> hs = new HashSet<>();
            for (int k = j + 1; k < num.length; k++) {
                long value = (long) target - num[i] - num[j] - num[k];
                if (hs.contains((int) value) &&
                       value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE) {
                    List<Integer> al = Arrays.asList(num[i], num[j], num[k], (int) value);
                    Collections.sort(al);
                    ds1.add(al);
                }
                hs.add(num[k]);
            }
        }
    }
    return new ArrayList<>(ds1);
}*/
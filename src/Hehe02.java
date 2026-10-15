import java.util.*;
class Hehe02{// sum of 3 elements -- optimal (sort + 3 pointer)
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
    }
    public static void main(String[] args){
        int[] num = {-3,-3,-3,0,0,2,2,4,4,4};
        List<List<Integer>> an = practice(num,1);
        System.out.println(an);
    }
}

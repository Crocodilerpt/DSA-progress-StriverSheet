package Striver_Array_nard01;
import java.util.*;
public class SumThreeElement {
    static List<List<Integer>> sumThree(int[] num,int target){
        Set<List<Integer>> ds1 = new HashSet<>();




        return new ArrayList<>(ds1);
    }
    public static void main(String[] args){
        int[] num = {2,5,0,2,9,1,9};
        sumThree(num,1);
        List<List<Integer>> ans = sumThree(num,19);
        for (List an: ans) System.out.print(an+" ");
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
static List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> res = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
        Set<Integer> seen = new HashSet<>();
        for (int j = i + 1; j < nums.length; j++) {
            int need = - nums[i] - nums[j];
            if (seen.contains(need)) {
                List<Integer> t = Arrays.asList(nums[i], nums[j], need);
                Collections.sort(t);
                res.add(t); // set removes duplicates
            }
            seen.add(nums[j]);
        }
    }
    return new ArrayList<>(res);
}*/
